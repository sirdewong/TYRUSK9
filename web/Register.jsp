<%@page import="Database.Database"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Tyrus K9</title>

    <link rel="shortcut icon" href="Images/home/favicon.ico"/>
    <link rel="stylesheet" href="CSS/bootstrap.min.css"/>
    <link rel="stylesheet" href="CSS/main.css"/>
    <link rel="stylesheet" href="CSS/Register.css"/>
    <link rel="stylesheet" href="CSS/intlTelInput.css">
    <link rel="stylesheet" type="text/css" href="CSS/fonts/font-awesome.min.css" />
    <link rel="stylesheet" type="text/css" href="CSS/sweetalert2.css">
    <link rel="stylesheet" href="CSS/DatePicker/jquery.datepick.css">
    <link rel="stylesheet" href="CSS/DatePicker/ui-flick.datepick.css">
    <link rel="stylesheet" href="CSS/DatePicker/ui.datepick.css">

    <script src="JS/jquery123.js"></script>
    <script src="JS/sweetalert2.js"></script>    

  </head>
  <%
    String url = "jdbc:mysql://localhost:3306/tyrusk9";
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
  %>
  <body>

    <script>
      if (<%=session.getAttribute("checked")%>) {
        swal('Please Fill up form');
      }
      if (<%=session.getAttribute("Success")%>) {
        swal(
                'Registered!',
                'We send an email to you please wait for the admin verification!',
                'success'
                );
      }
      <% session.removeAttribute("checked"); %>
      <%  session.removeAttribute("Success"); %>


      $(function () {
        $("#datepicker").datepick({
          dateFormat: 'D dd MM, yyyy',
          altField: '#altOutput',
          altFormat: 'yyyy-mm-dd',
          onShow: $.datepick.showStatus,
          useMouseWheel: true,
          prevText: '< M', todayText: 'M yyyy', nextText: 'M >',
          commandsAsDateFormat: true,
          pickerClass: 'noPrevNext',
          showOnFocus: true,
          showTrigger: '#calImg',
          minDate: '-80y',
          maxDate: '0y'
        });
      });


    </script>
    <div id="container">
      <div id="banner">
        <div id="iconlogo"><img src='Image/main/logo.png'/></div>
        <div class="titlebanner"><img src="Image/main/train.png"/></div>
        <div id="doggielogo"><img src="Image/main/doggie.png"/></div>
      </div>
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
                  <a href="RegisterAuth" class="buttonlog">Register</a>
                </form>
                <% }%>
              </div>
            </div>
        </nav>
      </div>

      <div id="body">
        <div id="registerbody" class="forbg">
          <div id="registerform">
            <strong class="regtitle">Student Registration</strong><hr/>
            <form action="Registered" method="POST" name="regform"  accept-charset="ISO-8859-1">
              <div>
                <div class="trtr">
                  <div class="label1 inline1"><p>Name</p></div>
                  <div class="td inline1">
                    <input type="text" class="input" name="fname" required/>
                    <p class="sublabel">First Name</p>
                  </div>
                  <div class="td inline1">
                    <input type="text" class="input" name="lname" required/>
                    <p class="sublabel">Last Name</p>
                  </div>
                  <div class="clear1"></div>
                </div>
                <div class="trtr">
                  <div class="label1 inline1"><p>Username</p></div>
                  <div class="td inline1">
                    <input type="text" class="input uname" name="uname" pattern="[A-Za-z0-9].{5,}" autocomplete="off" title="Alpha numeric only and 6 or more characters" required/><span class="status stat"></span>
                    <p class="sublabel">6 characters AlphaNumeric and "." only</p>
                  </div>
                </div>
                <div class="trtr">
                  <div class="label1 inline1"><p>Password</p></div>
                  <div class="td inline1">
                    <input type="password" name="pass" class="input passs" pattern=".{8,}" required/>
                    <p class="sublabel">8 characters or more characters</p>
                  </div>
                  <div class="td inline1">
                    <input type="password" name="repass" class="input repasss" id="repasss" pattern=".{8,}" required/><span class="pstatus stat"></span>
                    <p class="sublabel">Re-type Password</p>
                  </div>
                </div>
                <div class="trtr">
                  <div class="label1 inline1"><p>Email Address</p></div>
                  <div class="td inline1">
                    <input type="email" name="email"  class="input"  required/>
                    <p class="sublabel">8 characters or more characters</p>
                  </div>
                </div>
                <div class="trtr">
                  <script src="JS/jquery-birthday-picker.min.js"></script>
                  <div class="label1 inline1"><p>Birth date</p></div>
                  <div class="td inline1" >
                    <input type="text" size="16" placeholder="e.g: 01/01/2017" id="datepicker" readonly>
                    <div style="display: none;">
                      <img id="calImg" src="img/calendar-green.gif" alt="Popup" class="trigger">
                    </div>
                    <input type="text" id="altOutput" size="10" readonly="" class="ui-state-active" name="bday" >
                  </div>
                </div>
                <div class="trtr">
                  <div class="label1 inline1"><p>Gender</p></div>
                  <div class="td inline1">
                    <input type="radio" value="Male" name="gender" class="input" checked/>&nbsp;Male
                    <input type="radio" value="Female" name="gender" class="input" />&nbsp;Female
                  </div>
                </div>
                <div class="trtr">
                  <div class="label1 inline1"><p>Contact</p></div>
                  <div class="td inline1">
                    <p id="output">Please enter a number below</p>
                    <input type="tel" maxlength="20" minlength="7" id="phone" name="tel" required/>
                    <span id="valid-msg" class="hide">✓ Valid</span>
                    <span id="error-msg" class="hide">Invalid number</span>
                    <p class="sublabel">Contact Number</p>
                  </div>
                </div>
                <div class="trtr">
                  <div class="label1 inline1"><p>Address</p></div>
                  <div class="td inline1">
                    <input type="text" size="50" name="address" class="input" checked required/>
                  </div>
                </div>
                <div class="trtr">
                  <div class="label1 inline1"><p>Secret Question</p></div>
                  <div class="td inline1">
                    <select type="text" name="squestion" class="input" checked required/>
                    <option value="Father's Middle name"/>
                    <option value="Name of First Pet"/>
                    </select>
                  </div>
                  <div class="td inline1">
                    <input type="text" name="sanswer" class="input" required/>
                  </div>
                </div>
                <div class="trtr">
                  <div class="label1 inline1"><p>&nbsp;</p></div>
                  <div class="td inline1">
                    <input type="submit" name="submit" value="Register">
                  </div>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
      <% try {
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
        }%>
    </div>

    <script src="JS/jquery.min.js"></script>   
    <script type="text/javascript" src="JS/Nav.js"></script> 
    <script src="JS/intlTelInput.js"></script>
    <script src="JS/Usernamecheck.js"></script>
    <script src="JS/bootstrap.min.js"></script>
    <script src="JS/DatePicker/jquery.plugin.js"></script>
    <script src="JS/DatePicker/jquery.datepick.js"></script>
    <script src="JS/DatePicker/jquery.datepick.ext.js"></script>

  </body>
</html>
