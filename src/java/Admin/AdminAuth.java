package Admin;

import Database.Database;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(name = "AdminAuth", urlPatterns = {"/AdminAuth"})
public class AdminAuth extends HttpServlet {

    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    public static String pass, user;
    boolean denied = false;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String u = request.getParameter("u").toLowerCase();
        String p = request.getParameter("p");

        String page = (String) session.getAttribute("cpage");
        String user = (String) session.getAttribute("user");

        if (page == null) {
            page = "Admin";
        }

        try {
            int count = 0;
            con = Database.getConnection();
            ps = (PreparedStatement) con.prepareStatement("Select * from admin");
            rs = ps.executeQuery();
            while (rs.next()) {
                String usr = rs.getString(2).toLowerCase();
                String pss = rs.getString(3);
                String type = rs.getString(4);
                if (u.equals(usr) && p.equals(pss)) {
                    if (type.equals("Admin")) {
                        request.getSession().setAttribute("login", u);
                        Cookie cookie = new Cookie("user",u);
                        response.addCookie(cookie);
                        response.sendRedirect("InquiryPage");
                        
                    }
                    count = 1;
                }
            }
            if (count == 0) {
                out.println("<div class='signits'><font color=red>Login Failed</font></div>");
                response.sendRedirect("Admin");
            }

        } catch (SQLException e) {

        } finally {
            try {

                con.close();
                ps = null;
                rs = null;

            } catch (SQLException e) {

            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
