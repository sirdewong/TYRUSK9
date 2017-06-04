<!-- File file = File.createTempFile("somefilename-", ".ext", uploads);

try (InputStream input = part.getInputStream()) {
    Files.copy(input, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
} -->

<%@page import="java.sql.*"%>
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
        <link rel="stylesheet" href="CSS/home.css"/>
        <link rel="stylesheet" type="text/css" href="engine1/style.css" />
        <script type="text/javascript" src="engine1/jquery.js"></script>
        <script type="text/javascript" src="JS/Nav.js"></script>
        <link rel="stylesheet" type="text/css" href="CSS/fonts/font-awesome.min.css" />
        <title>Tyrus K9</title>
    </head>
    <body>
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
                            <li class="lili"><div id="iconlogo1"><img src='Image/main/logo.png'/></div></li>
                            <li  class="active saas"><a class="lili nav-item" style="cursor: default;"><p class="asas">Home</p></a></li>
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
                    </div>
                </nav>
            </div> 

            <div id="body">
                <section id="section1" class="section"> 
                    <div id="wowslider-container1">
                        <div class="ws_images">
                            <ul>
                                <li><img src="data1/images/image1.jpg" alt="Image1" title="Image1" id="wows1_0"/></li>
                                <li><img src="data1/images/image2.jpg" alt="Image2" title="Image2" id="wows1_1"/></li>
                                <li><img src="data1/images/image3.jpg" alt="Image3" title="Image3" id="wows1_2"/></li>
                                <li><img src="data1/images/image4.jpg" alt="Image4" title="Image4" id="wows1_3"/></li>
                                <li><img src="data1/images/image5.jpg" alt="Image5" title="Image5" id="wows1_4"/></li>
                            </ul>
                        </div>
                        <div class="ws_bullets">
                            <div>
                                <a href="#" title="Image1"><span><img src="data1/tooltips/image1.jpg" alt="Image1"/>1</span></a>
                                <a href="#" title="Image2"><span><img src="data1/tooltips/image2.jpg" alt="Image2"/>2</span></a>
                                <a href="#" title="Image3"><span><img src="data1/tooltips/image3.jpg" alt="Image3"/>3</span></a>
                                <a href="#" title="Image4"><span><img src="data1/tooltips/image4.jpg" alt="Image4"/>4</span></a>
                                <a href="#" title="Image5"><span><img src="data1/tooltips/image5.jpg" alt="Image5"/>5</span></a>
                            </div>
                        </div>
                        <div class="ws_script" style="position:absolute;left:-99%"></div>
                        <div class="ws_shadow"></div>
                    </div>	
                    <script type="text/javascript" src="engine1/wowslider.js"></script>
                    <script type="text/javascript" src="engine1/script.js"></script>
                    <div class="fielddiv forbg" id="field1">
                        <fieldset id="fcontent1" class="field">
                            <legend class="legend">Schedule<span class="viewall"><a href="#">View all >></a></span></legend>
                            <div class="scheduling">
                                <div class="schedule srow">
                                    <div class="schedcolumn1 std">
                                        <p class="schedtime">May 1, 2017 - 6:00 PM</p>
                                        <p class="schedtitle">Title of Sched</p>
                                    </div>
                                    <div class="schedcolumn2 std">
                                        <p class="scheddesc">Description of blah blah blah Lorem Ipsum. The quick brown fox jumps over the lazy dog.</p>
                                    </div>
                                </div>
                                <div class="schedule srow">
                                    <div class="schedcolumn1 std">
                                        <p class="schedtime">May 1, 2017 - 6:00 PM</p>
                                        <p class="schedtitle">Title of Sched</p>
                                    </div>
                                    <div class="schedcolumn2 std">
                                        <p class="scheddesc">Description of blah blah blah Lorem Ipsum. The quick brown fox jumps over the lazy dog.</p>
                                    </div>
                                </div>
                            </div>
                        </fieldset>
                    </div>
                </section>
                <section id="section2" class="section">
                    <div class="fielddiv forbg" id="field2">
                        <fieldset id="fcontent2" class="field">
                            <legend class="legend">Content2</legend>
                            <div>

                            </div>
                        </fieldset>
                    </div>
                </section>
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
                        <!--  <p class="links"><a href="#">Home</a><strong> � </strong><a href="#">Blog</a><strong> � </strong><a href="#">Pricing</a><strong> � </strong><a href="#">About</a><strong> � </strong><a href="#">Faq</a><strong> � </strong><a href="#">Contact</a></p> -->
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
                        con = null;
                    }
                } catch (ClassNotFoundException e) {
                    System.out.println(e);
          }%>

        </div> <!-- container -->
    </body>
</html>
