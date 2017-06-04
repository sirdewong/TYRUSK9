package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_view.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    _jspx_th_f_view_0.setJspId("id7");
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("    <html>\r\n");
        out.write("        <head>\r\n");
        out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
        out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("            <link rel=\"shortcut icon\" href=\"Images/home/favicon.ico\">\r\n");
        out.write("            <link rel=\"stylesheet\" href=\"CSS/bootstrap.min.css\">\r\n");
        out.write("            <script src=\"JS/jquery.min.js\"></script>\r\n");
        out.write("            <script src=\"JS/bootstrap.min.js\"></script>\r\n");
        out.write("            <link rel=\"stylesheet\" href=\"CSS/main.css\">\r\n");
        out.write("            <!-- Start WOWSlider.com HEAD section -->\r\n");
        out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"engine1/style.css\" />\r\n");
        out.write("            <script type=\"text/javascript\" src=\"engine1/jquery.js\"></script>\r\n");
        out.write("            <!-- End WOWSlider.com HEAD section -->\r\n");
        out.write("            <title>Tyrus K9</title>\r\n");
        out.write("        </head>\r\n");
        out.write("        <body>\r\n");
        out.write("            <div id=\"container\">\r\n");
        out.write("                <div id=\"banner\">\r\n");
        out.write("                    <div id=\"iconlogo\"><img src='Image/main/logo.png'/></div>\r\n");
        out.write("                    <div class=\"titlebanner\"><img src=\"Image/main/train.png\"/></div>\r\n");
        out.write("                    <div id=\"doggielogo\"><img src=\"Image/main/doggie.png\"/></div>\r\n");
        out.write("                </div>\r\n");
        out.write("                <div id=\"bgimage\"></div>\r\n");
        out.write("\r\n");
        out.write("                    <div id=\"nanav\">\r\n");
        out.write("                        <nav class=\"navbar nav\">\r\n");
        out.write("                            <div class=\"container-fluid\">\r\n");
        out.write("                                <ul id=\"navul\" class=\"nav-list navbar-nav topnav\">\r\n");
        out.write("                                    <li  class=\"active saas\"><a class=\"lili nav-item\" style=\"cursor: default;\"><p class=\"asas\">Home</p></a></li>\r\n");
        out.write("                                    <li class=\"dropdown saas\"><a class=\"lili dropbtn\" href=\"\"><p class=\"asas\">Service</p><span class=\"caret\"></span></a>\r\n");
        out.write("                                        <div class=\"dropdown-content\">\r\n");
        out.write("                                            <a href=\"Wood\">Training for Handler</a>\r\n");
        out.write("                                            <a href=\"Glass\">Training for Dogs</a>\r\n");
        out.write("                                            <a href=\"Golf\">Breeding</a>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </li>\r\n");
        out.write("                                    <li><a class=\"lili saas\" href=\"AboutUs\"><p class=\"asas\">About Us</p></a></li>\r\n");
        out.write("\r\n");
        out.write("                                </ul>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </nav>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    \r\n");
        out.write("\r\n");
        out.write("                    <div id=\"body\">\r\n");
        out.write("                        \r\n");
        out.write("                        <div id=\"wowslider-container1\">\r\n");
        out.write("                            <div class=\"ws_images\"><ul>\r\n");
        out.write("                                    <li><img src=\"data1/images/image1.jpg\" alt=\"Image1\" title=\"Image1\" id=\"wows1_0\"/></li>\r\n");
        out.write("                                    <li><img src=\"data1/images/image2.jpg\" alt=\"Image2\" title=\"Image2\" id=\"wows1_1\"/></li>\r\n");
        out.write("                                    <li><img src=\"data1/images/image3.jpg\" alt=\"Image3\" title=\"Image3\" id=\"wows1_2\"/></li>\r\n");
        out.write("                                    <li><img src=\"data1/images/image4.jpg\" alt=\"Image4\" title=\"Image4\" id=\"wows1_3\"/></li>\r\n");
        out.write("                                    <li><img src=\"data1/images/image5.jpg\" alt=\"Image5\" title=\"Image5\" id=\"wows1_4\"/></li>\r\n");
        out.write("                                </ul></div>\r\n");
        out.write("                            <div class=\"ws_bullets\"><div>\r\n");
        out.write("                                    <a href=\"#\" title=\"Image1\"><span><img src=\"data1/tooltips/image1.jpg\" alt=\"Image1\"/>1</span></a>\r\n");
        out.write("                                    <a href=\"#\" title=\"Image2\"><span><img src=\"data1/tooltips/image2.jpg\" alt=\"Image2\"/>2</span></a>\r\n");
        out.write("                                    <a href=\"#\" title=\"Image3\"><span><img src=\"data1/tooltips/image3.jpg\" alt=\"Image3\"/>3</span></a>\r\n");
        out.write("                                    <a href=\"#\" title=\"Image4\"><span><img src=\"data1/tooltips/image4.jpg\" alt=\"Image4\"/>4</span></a>\r\n");
        out.write("                                    <a href=\"#\" title=\"Image5\"><span><img src=\"data1/tooltips/image5.jpg\" alt=\"Image5\"/>5</span></a>\r\n");
        out.write("                                </div></div><div class=\"ws_script\" style=\"position:absolute;left:-99%\"></div>\r\n");
        out.write("                            <div class=\"ws_shadow\"></div>\r\n");
        out.write("                        </div>\t\r\n");
        out.write("                        <script type=\"text/javascript\" src=\"engine1/wowslider.js\"></script>\r\n");
        out.write("                        <script type=\"text/javascript\" src=\"engine1/script.js\"></script>\r\n");
        out.write("                    </div>\r\n");
        out.write("                \r\n");
        out.write("                <div id=\"mainfoot\">\r\n");
        out.write("                    <div id=\"Footer\">\r\n");
        out.write("                        <div id=\"footsec\">\r\n");
        out.write("                            <div class=\"foot1\">\r\n");
        out.write("                                <p class=\"foottitle\">Title1</p>\r\n");
        out.write("                                <p class=\"footdesc\">The quick brown fox jumps over the lazy dog.</p>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"foot1\">\r\n");
        out.write("                                <p class=\"foottitle\">Title1</p>\r\n");
        out.write("                                <p class=\"footdesc\">The quick brown fox jumps over the lazy dog.</p>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"foot1\">\r\n");
        out.write("                                <p class=\"foottitle\">Title1</p>\r\n");
        out.write("                                <p class=\"footdesc\">The quick brown fox jumps over the lazy dog.</p>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"foot1\">\r\n");
        out.write("                                <p class=\"foottitle\">Title1</p>\r\n");
        out.write("                                <p class=\"footdesc\">The quick brown fox jumps over the lazy dog.</p>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <div id=\"copyright\" class=\"copy-right-grids\">\r\n");
        out.write("                        <p class=\"footer-gd\">Copyright &copy; <script language=\"javascript\" type=\"text/javascript\">\r\n");
        out.write("                        var today = new Date();\r\n");
        out.write("                        var year = today.getFullYear();\r\n");
        out.write("                        document.write(year);\r\n");
        out.write("                            </script>Tyrus K-9 Handler Services and Trainer Provider. All Rights Reserved | </p> \r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </body>\r\n");
        out.write("    </html>\r\n");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      return true;
    }
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }
}
