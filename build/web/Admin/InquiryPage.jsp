<%@page import="java.io.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page import="org.apache.commons.lang.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            WordUtils word = new WordUtils();
            String user = (String) session.getAttribute("login");
            if (user == null) {
                String cpage = "InquiryPage";
                session.setAttribute("page", cpage);
                response.sendRedirect("Admin");

            }

            String url = "jdbc:mysql://localhost:3306/tyrusk9";
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            String from = "";
            String fpass = "";
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CSS/bootstrap.min.css"/>
        <link rel="stylesheet" href="Admin/CSS/main.css"/>
        <link rel="stylesheet" href="Admin/CSS/user.css"/>
        <link rel="stylesheet" href="Admin/CSS/Inquiry.css"/>
        <script src="JS/jquery.min.js"></script>
        <script src="JS/bootstrap.min.js"></script>

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
                        <li class="nava" role="presentation"><a class="nava" href="#">Customer</a></li>
                        <li class="nava" role="presentation"><a class="nava" href="#">Page Manage</a></li>
                        <li class="nava" role="presentation"><a class="nava" href="#">Schedule</a></li>
                        <li class="nava" role="presentation"><a class="nava" href="Verification">Verification</a></li>
                    </ul>
                    <div class="sendnudes">
                        <ul>

                            <li id="login">
                                <a id="login-trigger" href="#">
                                    Email Used<span>▼</span>
                                </a>
                                <div id="login-content">
                                    <form action="EmailAuth" method="POST">
                                        <%if (session.getAttribute("allow") == "allow") { %>
                                        <fieldset id="inputs">
                                            <input id="username" type="email" name="Email" placeholder="Your email address" required/>   
                                            <input id="password" type="password" name="Password" placeholder="Password" required/>
                                        </fieldset>
                                        <%
                                        } else { %>
                                        <fieldset id="inputs">
                                            <%
                                                try {
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    try {

                                                        con = DriverManager.getConnection(url, "root", "");
                                                        //ps = con.prepareStatement("DELETE FROM customerinquiry WHERE date < (CURDATE() - INTERVAL 30 DAY)");
                                                        //ps.execute();

                                                        ps = con.prepareStatement("select * from admin");
                                                        rs = ps.executeQuery();
                                                        while (rs.next()) {%>
                                            <input id="username" type="email" name="Email" value="<%=rs.getString("email")%>" disabled/>

                                            <%
                                                            from = rs.getString("Email");
                                                            fpass = rs.getString("Pass");
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
                                                } catch (ClassNotFoundException e) {
                                                    System.out.println(e);
                                                }%>

                                        </fieldset> <% } %>
                                        <fieldset id="actions">
                                            <input type="submit" name="Login" class="submit11" value="Log in">
                                                   <input type="submit" name="change" class="submit11" value="Change"<%if (session.getAttribute("allow") == "allow") { %>disabled <% session.removeAttribute("allow");
                                                } %>/>
                                        </fieldset>
                                    </form>
                                </div>                     
                            </li>
                        </ul>
                    </div>
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
        <script>
            $(document).ready(function () {
                $('#login-trigger').click(function () {
                    $(this).next('#login-content').slideToggle();
                    $(this).toggleClass('active');

                    if ($(this).hasClass('active'))
                        $(this).find('span').html('&#x25B2;')
                    else
                        $(this).find('span').html('&#x25BC;')
                })
            });
        </script>
        <div id="body">
            <div id="search">
                <input type="text" size="40" placeholder="Search..." id="box"/>
            </div>

            <table class="table-fill">
                <thead>
                    <tr>
                        <th class="text-left">Name</th>
                        <th class="text-left">Contact</th>
                        <th class="text-left">Email</th>
                        <th class="text-left">Action</th>
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

                                ps = con.prepareStatement("select * from customerinquiry WHERE date > (CURDATE() - INTERVAL 29 DAY) order by date Desc");
                                rs = ps.executeQuery();
                                while (rs.next()) {%>
                    <tr class="sss">
                        <td class="text-left tdtd cap"><%=word.capitalize(rs.getString(2))%></td>
                        <td class="text-left tdtd"><%=rs.getString(3)%></td>
                        <td class="text-left tdtd"><%=rs.getString(4)%></td>
                        <td class="text-left bsbsbs"><a class="buttonn" data-toggle="modal" data-target="#myModal<%=rs.getString("ID")%>">Send Email</a> </td>
                    </tr>
                    <%  } %>.
                </tbody>
            </table>
            <% ps = con.prepareStatement("select * from customerinquiry WHERE date > (CURDATE() - INTERVAL 29 DAY) order by date Desc");
                rs = ps.executeQuery();
                while (rs.next()) {%>
            <form action="SendingEmail" method="POST">
                <div class="modal fade" id="myModal<%=rs.getString("ID")%>" role="dialog">
                    <div class="modal-dialog modal-sm">
                        <div class="modal-content">

                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h3 class="modal-title cap">To: <%=word.capitalize(rs.getString("Name"))%></h3>
                            </div>

                            <div class="modal-body">
                                <textarea class="texarea" name="longmsg"></textarea>

                            </div>
                            <div class="modal-footer">

                                <input type="hidden" name="IDID" value="<%=rs.getString("ID")%>"/>
                                <input type="hidden" name="fromm" value="<%=from%>"/>
                                <input type="hidden" name="fpass" value="<%=fpass%>"/>
                                <input type="submit" class="subbutton" value="SEND"/>

                            </div>
                        </div>
                    </div>
                </div>
            </form>
            <% } %>



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
