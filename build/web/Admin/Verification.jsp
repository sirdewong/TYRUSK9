<%-- 
    Document   : Verification
    Created on : May 2, 2017, 11:51:19 PM
    Author     : admin
--%>

<%@page import="org.apache.commons.lang.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            WordUtils word = new WordUtils();
            String user = (String) session.getAttribute("login");
            if (user == null) {
                String cpage = "Verification";
                session.setAttribute("page", cpage);
                response.sendRedirect("Admin");

            }

            String url = "jdbc:mysql://localhost:3306/tyrusk9";
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/bootstrap.min.css"/>
        <link rel="stylesheet" href="Admin/CSS/main.css"/>
        <link rel="stylesheet" href="Admin/CSS/user.css"/>
        <link rel="stylesheet" href="Admin/CSS/Verification.css"/>
        <script src="JS/jquery.min.js"></script>
        <script src="JS/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-default custom-header">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button><a class="navbar-brand navbar-link" href="#">Admin<span>Page </span> </a></div>
                <div class="collapse navbar-collapse" id="navbar-collapse">
                    <ul class="nav navbar-nav links">
                        <li class="nava" role="presentation"><a class="nava" href="InquiryPage">Customer</a></li>
                        <li class="nava" role="presentation"><a class="nava" href="#">Page Manage</a></li>
                        <li class="nava" role="presentation"><a class="nava" href="#">Schedule</a></li>
                        <li class="nava" role="presentation"><a class="nava" href="Verification">Verification</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false" href="#"> <span class="caret"></span><img src="assets/img/avatar.jpg" class="dropdown-image"></a>
                            <ul class="dropdown-menu dropdown-menu-right" role="menu">
                                <li><a href="#">Settings </a></li>
                                <li class="active"><a href="#">Logout</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        
        <div id="body">
            <div id="search">
                <input type="text" size="40" placeholder="Search..." id="box"/>
            </div>

            <table class="table-fill">
                <thead>
                    <tr>
                        <th class="text-left">Name</th>
                        <th class="text-left">Email</th>
                        <th class="text-left">Contact</th>
                        <th class="text-left" colspan="2">Action</th>
                    </tr>
                </thead>
                <tbody class="table-hover">
                    <%
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            try {

                                con = DriverManager.getConnection(url, "root", "");
                                //ps = con.prepareStatement("DELETE FROM customerinquiry WHERE date < (CURDATE() - INTERVAL 30 DAY)");
                                //ps.execute();

                                ps = con.prepareStatement("select * from handlerinfo WHERE Status = ?");
                                ps.setString(1, "Waiting");
                                rs = ps.executeQuery();
                                while (rs.next()) {%>
                    <tr class="sss">
                        <td class="text-left tdtd cap"><%=word.capitalize(rs.getString(2) + rs.getString(3)) %></td>
                        <td class="text-left tdtd"><%=rs.getString("Emailaddress")%></td>
                        <td class="text-left tdtd"><%=rs.getString("contactnumber")%></td>
                        <td class="text-left bsbsbs"><input type="submit" value="Accept"/></td>
                        <td class="text-left bsbsbs"><input type="submit" value="Decline"/></td>
                    </tr>
                    <%  } %>.
                </tbody>
            </table>
        </div>
        <script src="JS/Search.js"></script>
        <%
                } catch (SQLException e) {

                } finally {
                    con = null;
                }
            } catch (ClassNotFoundException e) {
                System.out.println(e);
            }%>
        <div class="sendnudes1">
            <button class="buttonnn" href="SendToAll" style="float: right;">Send to All</button>
        </div>
    </body>
</html>
