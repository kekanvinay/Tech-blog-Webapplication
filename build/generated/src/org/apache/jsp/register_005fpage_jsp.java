package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/NavBar.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            #bg\n");
      out.write("            {\n");
      out.write("                background: linear-gradient(\n");
      out.write("          to Right,\n");
      out.write("          rgb(60, 162, 94),\n");
      out.write("          rgb(2, 195, 169),\n");
      out.write("          rgb(107, 210, 96)\n");
      out.write("        );\n");
      out.write("            }\n");
      out.write("            .card-header\n");
      out.write("            {\n");
      out.write("                background: linear-gradient(\n");
      out.write("          to Right,\n");
      out.write("          rgb(60, 162, 94),\n");
      out.write("          rgb(2, 195, 169),\n");
      out.write("          rgb(107, 210, 96)\n");
      out.write("        );\n");
      out.write("            }\n");
      out.write("            .card-body\n");
      out.write("            {\n");
      out.write("                background-color: #151719;\n");
      out.write("                color: chartreuse\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("               background: linear-gradient(\n");
      out.write("          to Right,\n");
      out.write("          rgb(60, 162, 94),\n");
      out.write("          rgb(2, 195, 169),\n");
      out.write("          rgb(107, 210, 96)\n");
      out.write("        );\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n");
      out.write("            integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\n");
      out.write("            crossorigin=\"anonymous\">< /script<script\n");
      out.write("                        src = \"https://code.jquery.com/jquery-3.6.0.min.js\"\n");
      out.write("                        integrity = \"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\n");
      out.write("                        crossorigin = \"anonymous\" > < /script  \n");
      out.write("                        < script\n");
      out.write("                src = \"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\n");
      out.write("                integrity = \"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("                crossorigin = \"anonymous\" ></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" \n");
      out.write("                integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" \n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-lg navba-light  text-dark\" style=\" background: linear-gradient(\n");
      out.write("          to Right,\n");
      out.write("          rgb(60, 162, 94),\n");
      out.write("          rgb(2, 195, 169),\n");
      out.write("          rgb(107, 210, 96)\n");
      out.write("        );\">\n");
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
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"login_page.jsp\">  <span class=\"fa fa-user-plus\">LOGIN</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"register_page.jsp\">  <span class=\"fa fa-user-plus\">REGISTER</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("      <button class=\"btn btn-outline-dark my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        <main class=\"p-5\" id=\"bg\">\n");
      out.write("            <div class=\"container\">1\n");
      out.write("                <div class=\"col-md-6 offset-md-3\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header text-center\">\n");
      out.write("                            <span class=\"fa fa-user-circle fa-3x\"></span>\n");
      out.write("                            <br>\n");
      out.write("                            <p>Register Here</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                            <form  novalidate action=\"Register_servlet\" onsubmit=\"return demo()\">\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"UserName\">Enter UserName</label>\n");
      out.write("                                    <input  type=\"text\"name=\"username\" class=\"form-control\" id=\"username\" aria-describedby=\"emailHelp\" placeholder=\"Enter NAME\" required >\n");
      out.write("                                    <small class=\"form-field-msg form-text text-danger ml-2\"></small>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                                    <input type=\"email\" name=\"email\" class=\"form-control\" id=\"email\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\" required>\n");
      out.write("                                    <small \" email-field-msg    form-text text-danger ml-2\"></small>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"Password\" id=\"Password\" placeholder=\"Password\" required>\n");
      out.write("                                 <small \" password-field-msg   form-text text-danger ml-2\"></small>\n");
      out.write("                                \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"Gender\">Select Gender</label>\n");
      out.write("                                    <br>\n");
      out.write("                                    <input type=\"radio\" id=\"gender\"  value=\"Male\"name=\"GENDER\">Male\n");
      out.write("                                    <input type=\"radio\" id=\"gender\"  value=\"FeMAle\" name=\"GENDER\">FeMale\n");
      out.write("                                </div>\n");
      out.write("                                <div form-group>\n");
      out.write("                                    <textarea class=\"form-control\" id=\"area\"  rows=\"5\" name=\"about\"  placeholder=\"Enter Somthing Your Self\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <input type=\"checkbox\" class=\"form-check-input\" id=\"Check\">\n");
      out.write("                                    <label class=\"form-check-label\" for=\"exampleCheck1\">Agree terms And Condition</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-control\">\n");
      out.write("                                    <select required name=\"role\">\n");
      out.write("                                        <option value=\"\">Select Role</option>\n");
      out.write("                                        <option value=1>Admin</option>\n");
      out.write("                                       <option value=0>Co-Admin</option>\n");
      out.write("                                       <option value=\"-1\">User</option>\n");
      out.write("                                       \n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <br>\n");
      out.write("                                <button  onclick=\"demo()\"type=\"submit\">Register</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </main>\n");
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
