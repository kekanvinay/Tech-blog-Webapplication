package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<footer>\n");
      out.write("    <div class=\"con-container\">\n");
      out.write("      <ul>\n");
      out.write("        <li><button  onclick=\"window.location.href='mailto:vinaykekan235@gmail.com';\"><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i>vinaykekan235@gmail.com</button></li>\n");
      out.write("        <li><button  onclick=\"window.location.href='tel:7067523410';\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>7067523410</button></li>\n");
      out.write("        <li><i class=\"fa fa-address-book-o\" aria-hidden=\"true\"></i></i>68 New Gouri Nagar Indore [M.p]</li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"social-media\">\n");
      out.write("        <ul>\n");
      out.write("            <li><button  onclick=\"window.location.href='#';\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></button></li>\n");
      out.write("            <li><button  onclick=\"window.location.href='#';\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></button></li>\n");
      out.write("            <li><button  onclick=\"window.location.href='#';\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></button></li>    \n");
      out.write("            <li><button  onclick=\"window.location.href='#';\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></button></li>\n");
      out.write("            <li><button  onclick=\"window.location.href='#';\"><i class=\"fa fa-github\" aria-hidden=\"true\"></i></button></li>\n");
      out.write("            <li><button  onclick=\"window.location.href='#';\"><i class=\"fa fa-whatsapp\" aria-hidden=\"true\"></i></button></li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("  \n");
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
