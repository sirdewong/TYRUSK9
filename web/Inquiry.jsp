<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="shortcut icon" href="Images/home/favicon.ico"/>
        <link rel="stylesheet" href="CSS/bootstrap.min.css"/>
        <script src="JS/jquery.min.js"></script>
        <script src="JS/bootstrap.min.js"></script>
        <link rel="stylesheet" href="CSS/main.css"/>
        <script type="text/javascript" src="JS/Nav.js"></script>
        <link rel="stylesheet" href="CSS/Inquiry.css"/>
        <link rel="stylesheet" type="text/css" href="CSS/fonts/font-awesome.min.css" />
        <script src="JS/sweetalert2.js"></script>  
        <link rel="stylesheet" type="text/css" href="CSS/sweetalert2.css"/>
        <title>Tyrus K9</title>
    </head>
    <body>
        <script>
            if (<%=session.getAttribute("success")%>) {
                swal(
                        'Successful!',
                        'Please wait for the admin reply!',
                        'success'
                        );
            }
              <%  session.removeAttribute("success"); %>
        </script>
        <div id="container">
            <div id="banner">
                <div id="iconlogo"><img src='Image/main/logo.png'/></div>
                <div class="titlebanner"><img src="Image/main/train.png"/></div>
                <div id="doggielogo"><img src="Image/main/doggie.png"/></div>
            </div> <!-- banner -->
            <div class="background-image"></div>
            <div id="nanav">
                <nav id="nanav1" class="navbar nav">
                    <div class="container-fluid">
                        <ul id="navul" class="nav-list navbar-nav topnav">
                            <li  class="active saas"><a class="lili nav-item" href="./"><p class="asas">Home</p></a></li>
                            <li class="dropdown saas"><a class="lili dropbtn" href=""><p class="asas">Service<span class="caret"></span></p></a>
                                <div class="dropdown-content">
                                    <a href="Wood">Training for Handler</a>
                                    <a href="Glass">Training for Dogs</a>
                                    <a href="Golf">Breeding</a>
                                </div>
                            </li>
                            <li class="saas"><a class="lili" href="About"><p class="asas">About Us</p></a></li>
                            <li class="saas"><a class="lili" href="Inquiry"><p class="asas">Inquiry</p></a></li>
                        </ul>
                        <div class="Login">
                            <% if (session.getAttribute("valid") == "true") {%>
                            <div class="accept">
                                <div class="dropdown1">
                                    <div>
                                        <p class='user'>Welcome, <a href="" class="profilename" ><%=session.getAttribute("User")%></a></p>
                                    </div>
                                    <div>
                                        <button onclick="myFunction()" class="dropbtn1">Account</button>
                                        <div id="myDropdown" class="dropdown-content1">
                                            <a href="#">Profile</a>
                                            <a href="#">My Schedule</a>
                                            <a href="Logout">Logout</a>
                                        </div>
                                    </div>
                                </div>
                                <script src="JS/dropdown.js"></script>
                                <% } else { %>
                                <form action="LoginAuth" method="post">
                                    <input type="text" name="username" placeholder="Username"/>
                                    <input type="password" name="password" placeholder="Password"/>
                                    <input type="submit" class="buttonin" value="Login"/>
                                    <a href="Register" class="buttonlog">Register</a>
                                </form>
                                <% }%>
                            </div> <!--  accept -->
                        </div> <!--  Login -->
                </nav>
            </div> 

            <div id="body1" class="forbg">
                <h1 class="titlebar">Inquiry</h1><hr style="border-style: inset; border-width: 2px"/>

                <div id="inquirybody">
                    <form action="SendMail" method="POST" accept-charset="ISO-8859-1">
                        <table class="iinput">
                            <tr>
                                <td><input type="text" name="fname" placeholder="First Name" class="input" required/></td>
                            </tr>
                            <tr>
                                <td><input type="text" name="lname" placeholder="Last Name" class="input" required/></td>
                            </tr>
                            <tr>
                                <td><input type="number" name="contact" placeholder="Contact" class="input" required/></td>
                            </tr>
                            <tr>
                                <td><input type="email" name="email" placeholder="Email" class="input" required/></td>
                            </tr>
                            <tr>
                                <td><input type="submit" class="enjoy-css" value="Inquire" /></td>
                            </tr>
                        </table>
                    </form>
                </div>
                <%
                    if (session.getAttribute("successtype") == "1") { %>
                <p class="isuccess">Successful</p>

                <% session.setAttribute("successtype", 0);
                        } %>
            </div>
            <%
                String url = "jdbc:mysql://localhost:3306/tyrusk9";
                Connection con = null;
                PreparedStatement ps = null;
                ResultSet rs = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try {
                        con = DriverManager.getConnection(url, "root", "");
                        ps = con.prepareStatement("select * from aboutfooter");
                        rs = ps.executeQuery();
                        while (rs.next()) {%>
            <footer>
                <div class="row">
                    <div class="col-md-4 col-sm-6 footer-navigation">
                        <h3><a href="#"><%=rs.getString("CompanyName")%></a></h3>
                        <!--  <p class="links"><a href="#">Home</a><strong> · </strong><a href="#">Blog</a><strong> · </strong><a href="#">Pricing</a><strong> · </strong><a href="#">About</a><strong> · </strong><a href="#">Faq</a><strong> · </strong><a href="#">Contact</a></p> -->
                        <p class="company-name">Copyright &copy;&nbsp;<script language="javascript" type="text/javascript">
                                            var today = new Date();
                                            var year = today.getFullYear();
                                            document.write(year);
                            </script><br/>Tyrus K-9 Handler Services and Trainer Provider.<br/>All Rights Reserved |</p>
                    </div>
                    <div class="col-md-4 col-sm-6 footer-contacts">
                        <div><span class="fa fa-map-marker footer-contacts-icon"> </span>
                            <script src="JS/bootstrap.min.js" type="text/javascript"></script>
                            <p><span class="new-line-span"><%=rs.getString("address")%></span><%=rs.getString("city")%></p>
                        </div>
                        <div><span class="fa fa-phone footer-contacts-icon"></span>
                            <p>
                                <% if (!rs.getString("smart").equals("")) {%>
                                <span class="new-line-span">Smart: <%=rs.getString("smart")%></span>
                                <% }
                                    if (!rs.getString("globe").equals("")) {%>
                                <span class="new-line-span">Globe: <%=rs.getString("globe")%></span>
                                <% }
                                    if (!rs.getString("telephone").equals("")) {%>
                                <span class="new-line-span">Telephone: <%=rs.getString("telephone")%></span>
                                <% }%>

                            </p>
                        </div>
                        <div><span class="fa fa-envelope footer-contacts-icon"></span>
                            <p> <a href="#" target="_blank"><%=rs.getString("email")%></a></p>
                        </div>
                    </div>
                    <div class="clearfix visible-sm-block"></div>
                    <div class="col-md-4 footer-about">
                        <h4>About the company</h4>
                        <p><%=rs.getString("about")%>
                        </p>
                        <div class="social-links social-icons">
                            <a href="https://fb.me/<%=rs.getString("facebook")%>"><span class="fa fa-facebook"></span></a>
                            <a href="#"><span class="fa fa-google"></span></a>
                            <a href="#"><span class="fa fa-instagram"></span></a>
                        </div>
                    </div>
                </div>
            </footer>
            <% }
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
                }%> <!--  mainfoot -->
        </div>
    </body>
</html>
