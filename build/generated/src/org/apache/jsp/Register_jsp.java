package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Images/home/favicon.ico\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.min.css\"/>\n");
      out.write("        <script src=\"JS/jquery.min.js\"></script>\n");
      out.write("        <script src=\"JS/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/main.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/Register.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/jquery-ui.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/style.css\"/>\n");
      out.write("        <script src=\"JS/jquery.js\"></script>\n");
      out.write("        <script src=\"JS/Usernamecheck.js\"></script>\n");
      out.write("        <script src=\"JS/bootstrap-datepicker.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Tyrus K9</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"banner\">\n");
      out.write("                <div id=\"iconlogo\"><img src='Image/main/logo.png'/></div>\n");
      out.write("                <div class=\"titlebanner\"><img src=\"Image/main/train.png\"/></div>\n");
      out.write("                <div id=\"doggielogo\"><img src=\"Image/main/doggie.png\"/></div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"bgimage\"></div>\n");
      out.write("\n");
      out.write("            <div id=\"nanav\">\n");
      out.write("                <nav id=\"nanav1\" class=\"navbar nav\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <ul id=\"navul\" class=\"nav-list navbar-nav topnav\">\n");
      out.write("                            <li  class=\"active saas\"><a class=\"lili nav-item\" style=\"cursor: default;\" href=\"./\"><p class=\"asas\">Home</p></a></li>\n");
      out.write("                            <li class=\"dropdown saas\"><a class=\"lili dropbtn\" href=\"\"><p class=\"asas\">Service<span class=\"caret\"></span></p></a>\n");
      out.write("                                <div class=\"dropdown-content\">\n");
      out.write("                                    <a href=\"Wood\">Training for Handler</a>\n");
      out.write("                                    <a href=\"Glass\">Training for Dogs</a>\n");
      out.write("                                    <a href=\"Golf\">Breeding</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"saas\"><a class=\"lili\" href=\"About\"><p class=\"asas\">About Us</p></a></li>\n");
      out.write("                            <li class=\"saas\"><a class=\"lili\" href=\"Inquiry\"><p class=\"asas\">Inquiry</p></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"Login\">\n");
      out.write("                            ");
 if (session.getAttribute("valid") == "true") {
      out.write("\n");
      out.write("                            <div class=\"accept\">\n");
      out.write("\n");
      out.write("                                <div class=\"dropdown1\">\n");
      out.write("                                    <p>Welcome, <a href=\"\" class=\"profilename\" >");
      out.print(session.getAttribute("User"));
      out.write("</a></p>\n");
      out.write("                                    <button onclick=\"myFunction()\" class=\"dropbtn1\">Account</button>\n");
      out.write("                                    <div id=\"myDropdown\" class=\"dropdown-content1\">\n");
      out.write("                                        <a href=\"#\">Profile</a>\n");
      out.write("                                        <a href=\"#\">My Schedule</a>\n");
      out.write("                                        <a href=\"Logout\">Logout</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <script src=\"JS/dropdown.js\"></script>\n");
      out.write("                                ");
 } else { 
      out.write("\n");
      out.write("                                <form action=\"LoginAuth\" method=\"post\">\n");
      out.write("                                    <input type=\"text\" name=\"username\" placeholder=\"Username\"/>\n");
      out.write("                                    <input type=\"password\" name=\"password\" placeholder=\"Password\"/>\n");
      out.write("                                    <input type=\"submit\" class=\"buttonin\" value=\"Login\"/>\n");
      out.write("                                    <a href=\"RegisterAuth\" class=\"buttonlog\">Register</a>\n");
      out.write("                                </form>\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <script>\n");
      out.write("                                        $(window).scroll(function () {\n");
      out.write("                                            if ($(window).scrollTop() > 280) {\n");
      out.write("                                                $('#nanav1').addClass('navbar-fixed-top');\n");
      out.write("                                                $('#nanav1').addClass('nav-or');\n");
      out.write("                                                $('#nanav').addClass('nav-or-a');\n");
      out.write("                                            }\n");
      out.write("                                            if ($(window).scrollTop() < 281) {\n");
      out.write("                                                $('#nanav1').removeClass('nav-or navbar-fixed-top');\n");
      out.write("                                                $('#nanav').removeClass('nav-or-a');\n");
      out.write("                                            }\n");
      out.write("                                        });\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"body\">\n");
      out.write("                <div id=\"registerbody\">\n");
      out.write("                    <div id=\"registerform\">\n");
      out.write("                        <strong class=\"regtitle\">Student Registration</strong>\n");
      out.write("                        <form>\n");
      out.write("                            <table class=\"regtable\">\n");
      out.write("                                <tr height=\"50\" class=\"trtr\">\n");
      out.write("                                    <td class=\"label\">Name</td>\n");
      out.write("                                    <td class=\"td\"><input type=\"text\" name=\"fname\" class=\"input\"  pattern=\"[A-Za-z]{20}\" title=\"20 characters only\" required/><p class=\"sublabel\">First Name</p></td>\n");
      out.write("                                    <td class=\"td\"><input type=\"text\" name=\"lname\"class=\"input\" pattern=\"[A-Za-z]{20}\" title=\"20 characters only\" required/><p class=\"sublabel\">Last Name</p></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height=\"50\" class=\"trtr\">\n");
      out.write("                                    <td class=\"label\">Username</td>\n");
      out.write("                                    <td colspan=\"2\" class=\"td\"><input type=\"text\" name=\"uname\" class=\"input uname\" pattern=\"[A-Za-z0-9].{6,}\" title=\"Alpha numeric only and 6 or more characters\" required/>&nbsp;<span class=\"status stat\"></span><p class=\"sublabel\">20 character a-z and numeric only</p></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height=\"50\" class=\"trtr\">\n");
      out.write("                                    <td class=\"label\">Password</td>\n");
      out.write("                                    <td class=\"td\"><input type=\"password\" name=\"pass\" class=\"input passs\" pattern=\".{8,}\"/><p class=\"sublabel\">8 or more characters</p></td>\n");
      out.write("                                    <td class=\"td\"><input type=\"password\" name=\"repass\" class=\"input repasss\" /><p class=\"sublabel\">Re-type Password</p></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height=\"20\" class=\"trtr\">\n");
      out.write("                                    <td class=\"label\" >&nbsp;</td>\n");
      out.write("                                    <td class=\"td\" colspan=\"2\"><span class=\"pstatus stat\"></span></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height=\"50\" class=\"trtr\">\n");
      out.write("                                    <td class=\"label\">Email Address</td>\n");
      out.write("                                    <td class=\"td\" colspan=\"2\"><input type=\"email\" name=\"email\" class=\"input\" checked/><p class=\"sublabel\">&nbsp;</p></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height=\"50\" class=\"trtr\">\n");
      out.write("                                    <td class=\"label\">Birthday</td>\n");
      out.write("                                    <td class=\"td\" colspan=\"2\">\n");
      out.write("                                        <input id=\"datepicker\" size=\"16\"  name=\"bday\"><p class=\"sublabel\">&nbsp;</p>\n");
      out.write("                                        <script>\n");
      out.write("                                            $(function () {\n");
      out.write("                                                $(\"#datepicker\").datepicker();\n");
      out.write("                                                $(\"#anim\").on(\"change\", function () {\n");
      out.write("                                                    $(\"#datepicker\").datepicker(\"option\", \"showAnim\", $(this).val());\n");
      out.write("                                                });\n");
      out.write("                                            });\n");
      out.write("                                        </script>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height=\"50\" class=\"trtr\">\n");
      out.write("                                    <td class=\"label\">Gender</td>\n");
      out.write("                                    <td class=\"td\"><input type=\"radio\" value=\"Male\" name=\"gender\" class=\"input\" checked/>&nbsp;Male<p class=\"sublabel\"></p></td>\n");
      out.write("                                    <td class=\"td\"><input type=\"radio\" value=\"Female\" name=\"gender\" class=\"input\" />&nbsp;Female<p class=\"sublabel\"></p></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height=\"50\" class=\"trtr\">\n");
      out.write("                                    <td class=\"label\">Email</td>\n");
      out.write("                                    <td class=\"td\" colspan=\"2\"><input type=\"email\" name=\"\" class=\"input\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$\" /><p class=\"sublabel\"></p></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height=\"50\" class=\"trtr\">\n");
      out.write("                                    <td class=\"label\">Contact</td>\n");
      out.write("                                    <td class=\"td\" weight=\"5\"><input type=\"text\" name=\"pass\" size=\"5\" class=\"input\" pattern=\"++[0-9]{3}\"/><p class=\"sublabel\">Country Code</p></td>\n");
      out.write("                                    <td><input type=\"number\" name=\"repass\" class=\"input\" /><p class=\"sublabel\">Digits</p></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height=\"50\" class=\"trtr\">\n");
      out.write("                                    <td class=\"label\">Address</td>\n");
      out.write("                                    <td class=\"td\" colspan=\"2\"><input type=\"text\" size=\"30\" name=\"genders\" class=\"input\" checked/><p class=\"sublabel\"></p></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height=\"50\" class=\"trtr\">\n");
      out.write("                                    <td class=\"label\">Secret Question</td>\n");
      out.write("                                    <td class=\"td\">\n");
      out.write("                                        <select type=\"text\" name=\"\" class=\"input\" checked>\n");
      out.write("                                            <option>Father's Middle name</option>\n");
      out.write("                                            <option>name of first pet</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"td\"><input type=\"text\" name=\"\" class=\"input\" /><p class=\"sublabel\"></p></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input type=\"submit\" value=\"Register\">\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"mainfoot\">\n");
      out.write("                <div id=\"Footer\">\n");
      out.write("                    <div id=\"footsec\">\n");
      out.write("                        <div class=\"foot1\">\n");
      out.write("                            <p class=\"foottitle\">Title1</p>\n");
      out.write("                            <p class=\"footdesc\">The quick brown fox jumps over the lazy dog.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"foot1\">\n");
      out.write("                            <p class=\"foottitle\">Title1</p>\n");
      out.write("                            <p class=\"footdesc\">The quick brown fox jumps over the lazy dog.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"foot1\">\n");
      out.write("                            <p class=\"foottitle\">Title1</p>\n");
      out.write("                            <p class=\"footdesc\">The quick brown fox jumps over the lazy dog.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"foot1\">\n");
      out.write("                            <div id=\"footconnect\" class=\"footer two\">\n");
      out.write("                                <h4>Keep Connected</h4>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a class=\"fb\" href=\"\" target=\"_blank\">Like us on Facebook</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"copyright\" class=\"copy-right-grids\">\n");
      out.write("                    <p class=\"footer-gd\">Copyright &copy;&nbsp;<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("                        var today = new Date();\n");
      out.write("                        var year = today.getFullYear();\n");
      out.write("                        document.write(year);\n");
      out.write("                        </script>&nbsp;Tyrus K-9 Handler Services and Trainer Provider. All Rights Reserved |</p> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
