package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n");
      out.write("\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("            <link rel=\"shortcut icon\" href=\"Images/home/favicon.ico\"/>\n");
      out.write("            <link rel=\"stylesheet\" href=\"CSS/bootstrap.min.css\"/>\n");
      out.write("            <script src=\"JS/jquery.min.js\"></script>\n");
      out.write("            <script src=\"JS/bootstrap.min.js\"></script>\n");
      out.write("            <link rel=\"stylesheet\" href=\"CSS/main.css\"/>\n");
      out.write("            <title>Tyrus K9</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <div id=\"container\">\n");
      out.write("                <div id=\"banner\">\n");
      out.write("                    <div id=\"iconlogo\"><img src='Image/main/logo.png'/></div>\n");
      out.write("                    <div class=\"titlebanner\"><img src=\"Image/main/train.png\"/></div>\n");
      out.write("                    <div id=\"doggielogo\"><img src=\"Image/main/doggie.png\"/></div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div id=\"bgimage\"></div>\n");
      out.write("\n");
      out.write("                <div id=\"nanav\">\n");
      out.write("                    <nav class=\"navbar nav\">\n");
      out.write("                        <div class=\"container-fluid\">\n");
      out.write("                            <ul id=\"navul\" class=\"nav-list navbar-nav topnav\">\n");
      out.write("                                <li  class=\"active saas\"><a class=\"lili nav-item\" style=\"cursor: default;\" href=\"../\"><p class=\"asas\">Home</p></a></li>\n");
      out.write("                                <li class=\"dropdown saas\"><a class=\"lili dropbtn\" href=\"\"><p class=\"asas\">Service<span class=\"caret\"></span></p></a>\n");
      out.write("                                    <div class=\"dropdown-content\">\n");
      out.write("                                        <a href=\"Wood\">Training for Handler</a>\n");
      out.write("                                        <a href=\"Glass\">Training for Dogs</a>\n");
      out.write("                                        <a href=\"Golf\">Breeding</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"saas\"><a class=\"lili\" href=\"About\"><p class=\"asas\">About Us</p></a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"body\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"mainfoot\">\n");
      out.write("                    <div id=\"Footer\">\n");
      out.write("                        <div id=\"footsec\">\n");
      out.write("                            <div class=\"foot1\">\n");
      out.write("                                <p class=\"foottitle\">Title1</p>\n");
      out.write("                                <p class=\"footdesc\">The quick brown fox jumps over the lazy dog.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"foot1\">\n");
      out.write("                                <p class=\"foottitle\">Title1</p>\n");
      out.write("                                <p class=\"footdesc\">The quick brown fox jumps over the lazy dog.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"foot1\">\n");
      out.write("                                <p class=\"foottitle\">Title1</p>\n");
      out.write("                                <p class=\"footdesc\">The quick brown fox jumps over the lazy dog.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"foot1\">\n");
      out.write("                                <div id=\"footconnect\" class=\"footer two\">\n");
      out.write("                                    <h4>Keep Connected</h4>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a class=\"fb\" href=\"\" target=\"_blank\">Like us on Facebook</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"copyright\" class=\"copy-right-grids\">\n");
      out.write("                        <p class=\"footer-gd\">Copyright &copy;&nbsp;<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("                            var today = new Date();\n");
      out.write("                            var year = today.getFullYear();\n");
      out.write("                            document.write(year);\n");
      out.write("                            </script>&nbsp;Tyrus K-9 Handler Services and Trainer Provider. All Rights Reserved |</p> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
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
