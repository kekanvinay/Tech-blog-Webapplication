package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.blog.ModeBeans.post;
import com.blog.ControllerServlet.Connection_provider;
import com.blog.Dao.post_dao;

public final class Slider_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"SliderCardcss.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css/?familay=Candal|Lora\">\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js\"></script>\n");
      out.write("  <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("  \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("     <div class=\"post-slider\">\n");
      out.write("    <h1 class=\"cont\">\n");
      out.write("      <span>T</span>\n");
      out.write("      <span>r</span>\n");
      out.write("      <span>e</span>\n");
      out.write("      <span>a</span>\n");
      out.write("      <span>d</span>\n");
      out.write("      <span>i</span>\n");
      out.write("      <span>n</span>\n");
      out.write("      <span>g</span>\n");
      out.write("      <span>P</span>\n");
      out.write("      <span>o</span>\n");
      out.write("      <span>s</span>\n");
      out.write("      <span>t</span>\n");
      out.write("    </h1>\n");
      out.write("    <i class=\"fas fa-angle-left prev\"></i>\n");
      out.write("    <i class=\"fas fa-angle-right next\"></i>\n");
      out.write("\n");
      out.write("    <div class=\"post-wrapper\">\n");
      out.write("\n");
      out.write("      <div class=\"post\">\n");
      out.write("          <img src=\"bg4.jpeg\" alt=\"\" class=\"slider-image\">\n");
      out.write("        <div class=\"post-info\">\n");
      out.write("          <h4><a href=\"#\">One day life will flash before your eyes</a></h4>\n");
      out.write("          <i class=\"fas fa-user\"> Ritesh Dhanotiya</i>\n");
      out.write("          &nbsp;\n");
      out.write("          <i class=\"fas fa-calendar\"> Mar 9, 2020</i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"post\">\n");
      out.write("        <img src=\"../Images/2.jpg\" alt=\"\" class=\"slider-image\">\n");
      out.write("        <div class=\"post-info\">\n");
      out.write("          <h4><a href=\"#\">One day life will flash before your eyes</a></h4>\n");
      out.write("          <i class=\"fas fa-user\"> Ritesh Dhanotiya</i>\n");
      out.write("          &nbsp;\n");
      out.write("          <i class=\"fas fa-calendar\"> Mar 9, 2020</i>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"post\">\n");
      out.write("        <img src=\"../Images/3.jpg\" alt=\"\" class=\"slider-image\">\n");
      out.write("        <div class=\"post-info\">\n");
      out.write("          <h4><a href=\"#\">One day life will flash before your eyes</a></h4>\n");
      out.write("          <i class=\"fas fa-user\"> Ritesh Dhanotiya</i>\n");
      out.write("          &nbsp;\n");
      out.write("          <i class=\"fas fa-calender\"> Mar 9, 2020</i>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"post\">\n");
      out.write("        <img src=\"../Images/index.jpg\" alt=\"\" class=\"slider-image\">\n");
      out.write("        <div class=\"post-info\">\n");
      out.write("          <h4><a href=\"#\">One day life will flash before your eyes</a></h4>\n");
      out.write("          <i class=\"fas fa-user\"> Ritesh Dhanotiya</i>\n");
      out.write("          &nbsp;\n");
      out.write("          <i class=\"fas fa-calender\"> Mar 9, 2020</i>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("         \n");
      out.write("$(document).ready(function(){    \n");
      out.write("        $('.post-wrapper').slick({\n");
      out.write("        slidesToShow: 3,\n");
      out.write("        slidesToScroll: 1,\n");
      out.write("        autoplay: true,\n");
      out.write("        autoplaySpeed: 2000,\n");
      out.write("        nextArrow: $('.next'),\n");
      out.write("        prevArrow: $('.prev'),\n");
      out.write("        responsive: [\n");
      out.write("            {\n");
      out.write("                breakpoint: 1024,\n");
      out.write("                settings: {\n");
      out.write("                    slidesToShow: 3,\n");
      out.write("                    slidesToScroll: 3,\n");
      out.write("                    infinite: true,\n");
      out.write("                    dots: true\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            {\n");
      out.write("                breakpoint: 600,\n");
      out.write("                settings: {\n");
      out.write("                    slidesToShow: 2,\n");
      out.write("                    slidesToScroll: 2\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            {\n");
      out.write("                breakpoint: 480,\n");
      out.write("                settings: {\n");
      out.write("                    slidesToShow: 1,\n");
      out.write("                    slidesToScroll: 1\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            // You can unslick at a given breakpoint now by adding:\n");
      out.write("            // settings: \"unslick\"\n");
      out.write("            // instead of a settings object\n");
      out.write("        ]\n");
      out.write("    });\n");
      out.write("\n");
      out.write("   \n");
      out.write("});\n");
      out.write("      </script>\n");
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
