package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.blog.ModeBeans.UserREG;

public final class responsiveProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    
    UserREG s=(UserREG)session.getAttribute("un");
if(s==null)
    {
    response.sendRedirect("login_page.jsp");

    }
else
{
  
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .gradient-custom {\n");
      out.write("/* fallback for old browsers */\n");
      out.write("background: #f6d365;\n");
      out.write("\n");
      out.write("/* Chrome 10-25, Safari 5.1-6 */\n");
      out.write("background: -webkit-linear-gradient(to right bottom, rgba(246, 211, 101, 1), rgba(253, 160, 133, 1));\n");
      out.write("\n");
      out.write("/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n");
      out.write("background: linear-gradient(to right bottom, rgba(246, 211, 101, 1), rgba(253, 160, 133, 1))\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("      <!-- Start navbar -->\n");
      out.write("      \n");
      out.write("      <nav class=\"navbar navbar-expand-lg navba-light primary-background text-dark\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-language\"></span>TechBlog</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\"> <span class=\"fa fa-user-circle\">vinay <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">  <span class=\"fa fa-address-book-o\">contact</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Catgories\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Programing</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Project Implmentation</a>\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Data Structure</a>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link \" href=\"#\">MORE...</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("      <ul class=\"navbar-nav mr-right\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"\">  <span class=\"fa fa-user-circle\">");
      out.print(s.getName());
      out.write("</a>\n");
      out.write("          \n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Logout_Servlet\">  <span class=\"fa fa-user-plus\">Logout</a>\n");
      out.write("      </li>\n");
      out.write("      </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("      \n");
      out.write("      <!-- end navbar      \n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");
      out.print(s.getName());
      out.write("\n");
      out.write("        --> \n");
      out.write("        \n");
      out.write("        <!--javascrip-->\n");
      out.write("         <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n");
      out.write("            integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\n");
      out.write("            crossorigin=\"anonymous\">< /script<script\n");
      out.write("                        src = \"https://code.jquery.com/jquery-3.6.0.min.js\"\n");
      out.write("                         integrity = \"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\n");
      out.write("                         crossorigin = \"anonymous\" > < /script  \n");
      out.write("                        < script\n");
      out.write("                src = \"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\n");
      out.write("                integrity = \"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("                crossorigin = \"anonymous\" ></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" \n");
      out.write("                integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" \n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("       \n");
      out.write("        <!--PRofile Degien-->\n");
      out.write("        \n");
      out.write("        <section class=\"vh-100\" style=\"background-color: #f4f5f7;\">\n");
      out.write("  <div class=\"container py-5 h-100\">\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("      <div class=\"col col-lg-6 mb-4 mb-lg-0\">\n");
      out.write("        <div class=\"card mb-3\" style=\"border-radius: .5rem;\">\n");
      out.write("          <div class=\"row g-0\">\n");
      out.write("            <div class=\"col-md-4 gradient-custom text-center text-white\"\n");
      out.write("              style=\"border-top-left-radius: .5rem; border-bottom-left-radius: .5rem;\">\n");
      out.write("              <img src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava1-bg.webp\"\n");
      out.write("                alt=\"Avatar\" class=\"img-fluid my-5\" style=\"width: 80px;\" />\n");
      out.write("              <h5>Marie Horwitz</h5>\n");
      out.write("              <p>Web Designer</p>\n");
      out.write("              <i class=\"far fa-edit mb-5\"></i>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("              <div class=\"card-body p-4\">\n");
      out.write("                <h6>Information</h6>\n");
      out.write("                <hr class=\"mt-0 mb-4\">\n");
      out.write("                <div class=\"row pt-1\">\n");
      out.write("                  <div class=\"col-6 mb-3\">\n");
      out.write("                    <h6>Email</h6>\n");
      out.write("                    <p class=\"text-muted\">info@example.com</p>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-6 mb-3\">\n");
      out.write("                    <h6>Phone</h6>\n");
      out.write("                    <p class=\"text-muted\">123 456 789</p>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <h6>Projects</h6>\n");
      out.write("                <hr class=\"mt-0 mb-4\">\n");
      out.write("                <div class=\"row pt-1\">\n");
      out.write("                  <div class=\"col-6 mb-3\">\n");
      out.write("                    <h6>Recent</h6>\n");
      out.write("                    <p class=\"text-muted\">Lorem ipsum</p>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-6 mb-3\">\n");
      out.write("                    <h6>Most Viewed</h6>\n");
      out.write("                    <p class=\"text-muted\">Dolor sit amet</p>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-flex justify-content-start\">\n");
      out.write("                  <a href=\"#!\"><i class=\"fab fa-facebook-f fa-lg me-3\"></i></a>\n");
      out.write("                  <a href=\"#!\"><i class=\"fab fa-twitter fa-lg me-3\"></i></a>\n");
      out.write("                  <a href=\"#!\"><i class=\"fab fa-instagram fa-lg\"></i></a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("         </body>\n");
      out.write("</html>\n");
      out.write("\n");

}

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
}
