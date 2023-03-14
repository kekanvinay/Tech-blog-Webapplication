package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.blog.ModeBeans.UserREG;

public final class header_002d1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

UserREG s;
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("        href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"header-1css.css\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
  
    s = (UserREG) session.getAttribute("un");


      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("    \n");
      out.write("        <div class=\"top-bar\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"bg1.jpg\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"Section.html\">About Us</a></li>\n");
      out.write("                    <li><a href=\"contact_page.jsp\">Contact Us</a></li>\n");
      out.write("                    ");

                    if(s==null)
                    {
                    
      out.write("\n");
      out.write("                    <li><a href=\"login-1.jsp\">Login</a></li>\n");
      out.write("                    <li><a href=\"Resiter.jsp\">Register</a></li>\n");
      out.write("                    ");
}
                    else
                    {
      out.write("\n");
      out.write("                   <li><a href=\"Logout_Servlet\">Logout</a></li>\n");
      out.write("                    <li><a>");
      out.print(s.getName());
      out.write("</a></li>\n");
      out.write("                    ");
}
                    
      out.write("\n");
      out.write("                    ");

                    if(s!=null&&s.getRole()!=0)
                    {
                        
      out.write("\n");
      out.write("                    <li><a href=\"admin/index.jsp\n");
      out.write("                           \">Dasboard</a></li>\n");
      out.write("                    \n");
      out.write("                   ");
 }
                    
                    
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"search-box\">\n");
      out.write("                <div class=\"input-search\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Search\">\n");
      out.write("                    <div class=\"search-icon\">\n");
      out.write("                        <button><i class=\"fa fa-search\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
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
