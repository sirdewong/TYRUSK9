/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Database.Database;
import JavaClass.SendEmail;
import java.io.*;
import java.nio.charset.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.JOptionPane;

/**
 *
 * @author OHSEC
 */
public class SendMail extends HttpServlet {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String contact = request.getParameter("contact");
        String email = request.getParameter("email");
        String successtype = "";
        boolean success = false;
        try{
            
            con = Database.getConnection();
            ps = con.prepareStatement("Insert into customerinquiry (Name, Contact, Email) values (?, ?, ?)");
            ps.setString(1, fname+" "+lname);
            ps.setString(2, contact);
            ps.setString(3, email);
            ps.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            con = null;
             success = true;
        }
        
        session.setAttribute("success", success);
        response.sendRedirect("Inquiry");
        
        //String msg = "Name: "+fname+" "+lname+"\nContact: "+contact+"\nEmail: "+email;
              
        //SendEmail.email("sirdewong@gmail.com", "055452631", email, "Tyrus K9 Inquire", msg);
        //getServletContext().getRequestDispatcher("/Inquiry").forward(request, response);
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
