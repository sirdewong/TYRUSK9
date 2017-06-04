package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Servlet.*;
import java.util.*;

public final class InsertDisplayTest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Insert title here</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=frm method=\"post\" action=\"./InsertImage\">\n");
      out.write("            <table>\n");
      out.write("                <tr><TD ><B>Upload Image</B></TD>\n");
      out.write("                    <td><input type=\"file\" name=\"Image\" size=\"20\" value=\"\"></TD>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" height=\"30\" width=\"62\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <TD><b>ClickImage</b>\n");
      out.write("                        ");

                            GetImage udet = new GetImage();
                            Vector V_ids = new Vector();
                            V_ids = udet.ImageList();
                            for (int i = 0; i < V_ids.size(); i++) {

                                String temp[] = new String[2];
                                int j = i + 1;
                                temp = (String[]) V_ids.get(i);

                        
      out.write("</TD>\n");
      out.write("                    <td><a target=\"_blank\" href='");
      out.print(response.encodeURL("RetrieveImage?Image_id=" + temp[0]));
      out.write("' onmouseover=\"_ScrollStatus('Click here for view', 1);\" onmouseout=\"_StopScrollStatus();\" onblur=\"_StopScrollStatus();\" >\n");
      out.write("                            <b>");
      out.print(temp[1]);
      out.write("</b>\n");
      out.write("                        </a></TD>\n");
      out.write("\n");
      out.write("                    ");


                        }

                    
      out.write("</TR>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
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
