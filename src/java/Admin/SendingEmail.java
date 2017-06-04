/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin;

import Database.Database;
import JavaClass.SendEmail;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(name="SendingEmail", urlPatterns={"/SendingEmail"})
public class SendingEmail extends HttpServlet {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String fname = request.getParameter("IDID");
        String longmsg = request.getParameter("longmsg");
        String from = request.getParameter("fromm");
        String fpass = request.getParameter("fpass");
        String toto = "";
        String name = "";
        String msg = "";
        try{
            con = Database.getConnection();
            ps = con.prepareStatement("Select * from customerinquiry where ID = ?");
            ps.setString(1, fname);
            rs = ps.executeQuery();
            while(rs.next()){
                toto = rs.getString("Email");
                name = rs.getString("Name");
                
            }
        msg = "Dear "+name+"\n\n"+longmsg;    
        SendEmail.email(from, fpass, toto, "Tyrus K-9 Handler Services and Trainer Provider", msg);
        }catch(SQLException e){
           
        
        }finally{
             con=null;
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
