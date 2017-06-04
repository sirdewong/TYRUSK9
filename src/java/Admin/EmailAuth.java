/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Database.Database;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "EmailAuth", urlPatterns = {"/EmailAuth"})
public class EmailAuth extends HttpServlet {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String email = request.getParameter("Email");
        String pass = request.getParameter("Password");
        String Login = request.getParameter("Login");
        String change = request.getParameter("change");
        String allow;
        if (change != null) {
            allow = "allow";
            session.setAttribute("allow", allow);
            response.sendRedirect("InquiryPage");
        }
        if (Login != null) {
            try {
                con = Database.getConnection();
                ps = con.prepareStatement("Update Admin Set Email = ?, Pass = ? where id = 1");
                ps.setString(1, email);
                ps.setString(2, pass);
                ps.executeUpdate();
            } catch (SQLException e) {

            } finally {
                con = null;
            }
            response.sendRedirect("InquiryPage");
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
