package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"Footer-3css.css\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   <footer class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("\n");
      out.write("        <div class=\"footer-col\">\n");
      out.write("          <h4>company</h4>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"#\">about us</a></li>\n");
      out.write("            <li><a href=\"#\">our srvices</a></li>\n");
      out.write("            <li><a href=\"#\">privacy policy</a></li>\n");
      out.write("            <li><a href=\"#\">affiliate program</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-col\">\n");
      out.write("          <h4>get help</h4>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"#\">FAQ</a></li>\n");
      out.write("            <li><a href=\"#\">shipping</a></li>\n");
      out.write("            <li><a href=\"#\">returns</a></li>\n");
      out.write("            <li><a href=\"#\">order status </a></li>\n");
      out.write("            <li><a href=\"#\">payment options</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-col\">\n");
      out.write("          <h4>online shop</h4>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"#\">watch</a></li>\n");
      out.write("            <li><a href=\"#\">bag</a></li>\n");
      out.write("            <li><a href=\"#\">shoes</a></li>\n");
      out.write("            <li><a href=\"#\">dress</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-col\">\n");
      out.write("          <h4>follow us</h4>\n");
      out.write("          <div class=\"social-links\">\n");
      out.write("            <a href=\"#\"><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("            <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("            <a href=\"#\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("</body>\n");
      out.write("</html>");
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
