package Servlet;

import Database.Database;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginAuth extends HttpServlet {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String accepted = "false";
        String user = "";
        
        try{
            con = Database.getConnection();
            ps = con.prepareStatement("Select Username, Password, Status from handlerinfo where username = ?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            while(rs.next()){
                if(password.equals(rs.getString(2)) && rs.getString(3).equals("Active")){
                    accepted = "true";
                    ps = con.prepareStatement("Select name, lastname from handlerinfo where username = ?");
                    ps.setString(1, username);
                    rs = ps.executeQuery();
                    while(rs.next()){
                        user = rs.getString(1) + " " + rs.getString(2);
                    }
                }
               
            }
            session.setAttribute("User", user);
            session.setAttribute("valid", accepted);
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            
        }catch(SQLException e){
            
        }finally{
            
        }
        
        
    }
    
    public static void nameget(){
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
