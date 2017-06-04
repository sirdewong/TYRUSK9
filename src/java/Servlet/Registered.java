/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Database.Database;
import java.io.*;
import java.sql.*;
import java.util.regex.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.*;

/**
 *
 * @author OHSEC
 */
public class Registered extends HttpServlet {

    Connection con = null;
    PreparedStatement ps = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        String repass = request.getParameter("repass");
        String email = request.getParameter("email");
//        String bdaydate = request.getParameter("demo_birth[day]");
//        String bdaymonth = request.getParameter("demo_birth[month]");
//        String bdayyear = request.getParameter("demo_birth[year]");
        String gender = request.getParameter("gender");
        String contact = request.getParameter("tel");
        String address = request.getParameter("address");
        String squestion = request.getParameter("squestion");
        String sanswer = request.getParameter("sanswer");
        String bday = request.getParameter("bday");
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(uname);
        boolean b = m.find();
        boolean cpass = pass.equals(repass);
        boolean checked = false, success = false;
        try {
            con = Database.getConnection();

            if (bday == null) {
                checked = true;
            } else {
                success = true;
//        ps = con.prepareStatement("");
                ps = con.prepareStatement("Insert into handlerinfo (Name,lastname,username,Password,emailaddress,birthdate,gender,contactnumber,address,secretquestion,secretanswer,status) values (?,?,?,?,?,?,?,?,?,?,?,'Waiting')");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, uname);
                ps.setString(4, pass);
                ps.setString(5, email);
                ps.setString(6, bday);
                ps.setString(7, gender);
                ps.setString(8, contact);
                ps.setString(9, address);
                ps.setString(10, squestion);
                ps.setString(11, sanswer);
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con = null;
            session.setAttribute("checked", checked);
            session.setAttribute("Success", success);
            response.sendRedirect("Register");
            
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
