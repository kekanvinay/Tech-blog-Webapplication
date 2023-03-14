package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public class Slider_page extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"SliderCardcss.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"slider-card\">\n");
      out.write("      <input type=\"radio\" name=\"select\" id=\"tap-1\" checked>\n");
      out.write("      <input type=\"radio\" name=\"select\" id=\"tap-2\">\n");
      out.write("      <input type=\"radio\" name=\"select\" id=\"tap-3\">\n");
      out.write("      <input type=\"checkbox\" id=\"imgTap\">\n");
      out.write("      <div class=\"sliders\">\n");
      out.write("        <label for=\"tap-1\" class=\"tap tap-1\"></label>\n");
      out.write("        <label for=\"tap-2\" class=\"tap tap-2\"></label>\n");
      out.write("        <label for=\"tap-3\" class=\"tap tap-3\"></label>\n");
      out.write("      </div> \n");
      out.write("<div class=\"inner-part\">\n");
      out.write("        <label for=\"imgTap\" class=\"img\">\n");
      out.write("            <img class=\"img-1\" src=\"bg4.jpeg\">\n");
      out.write("        </label>\n");
      out.write("        <div class=\"content content-1\">\n");
      out.write("          <span>26 December 2017</span>\n");
      out.write("          <div class=\"title\">Lorem Ipsum Dolor</div>\n");
      out.write("<div class=\"text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Explicabo animi atque aliquid pariatur voluptatem numquam, quisquam. Neque est voluptates doloribus!</div>\n");
      out.write("<button>Read more</button>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"inner-part\">\n");
      out.write("        <label for=\"imgTap\" class=\"img\">\n");
      out.write("          <img class=\"img-2\" src=\"img.jpg\">\n");
      out.write("        </label>\n");
      out.write("        <div class=\"content content-2\">\n");
      out.write("          <span>26 December 2018</span>\n");
      out.write("          <div class=\"title\">Lorem Ipsum Dolor</div>\n");
      out.write("<div class=\"text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsum eos ut consectetur numquam ullam fuga animi laudantium nobis rem molestias.</div>\n");
      out.write("<button>Read more</button>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"inner-part\">\n");
      out.write("        <label for=\"imgTap\" class=\"img\">\n");
      out.write("          <img class=\"img-3\" src=\"index.jpg\">\n");
      out.write("        </label>\n");
      out.write("        <div class=\"content content-3\">\n");
      out.write("          <span>26 December 2019</span>\n");
      out.write("          <div class=\"title\">Lorem Ipsum Dolor</div>\n");
      out.write("<div class=\"text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod excepturi nemo commodi sint eum ipsam odit atque aliquam officia impedit.</div>\n");
      out.write("<button>Read more</button>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
