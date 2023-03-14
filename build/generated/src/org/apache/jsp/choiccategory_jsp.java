package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.blog.Dao.post_dao;
import com.blog.Dao.likeDao;
import com.blog.ControllerServlet.Connection_provider;
import com.blog.ModeBeans.post;
import java.util.List;
import com.blog.ModeBeans.UserREG;

public final class choiccategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>  \n");
      out.write("         <link href=\"cardEffectcss.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("              <!-- Cards-->\n");
      out.write("              <div class=\"card\">\n");
      out.write("                          ");

post_dao p1=new post_dao(Connection_provider.getConnection());
 List<post> l=p1.getCatgoryvice(Integer.parseInt(request.getParameter("cid")));
 for(post p2:l)
 {
     
      out.write("\n");
      out.write("                    <div  class=\"box\"> \n");
      out.write("                <div class=\"imgbx\">\n");
      out.write("                            <img  class=\"img\"  src=\"img/");
      out.print(p2.getPpic());
      out.write("\"  alt=\"Card image cap\">\n");
      out.write("                         </div>\n");
      out.write("                            <div class=\"content\" >\n");
      out.write(" <div class=\"text\">");
      out.print(p2.getPtitle());
      out.write("</div>\n");
      out.write("                           \n");
      out.write("                            <p class=\"card-text\" >");
      out.print(p2.getPcontent());
      out.write("</p>\n");
      out.write("\n");
      out.write("                           <div class=\"form-row submit-btn\">\n");
      out.write("                        <div class=\"input-data\">\n");
      out.write("                            <div class=\"inner\"></div>\n");
      out.write("                            \n");
      out.write("                             <a href=\"show_blog.jsp?postID=");
      out.print(p2.getPid());
      out.write("\">Read More</a>\n");
      out.write("                        </div>\n");
      out.write("                   \n");
      out.write("                                                  \n");
      out.write("                         </div>\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                          </div>\n");
      out.write("          \n");
      out.write("                            ");

 }
                            
      out.write(" \n");
      out.write("                            </div>\n");
      out.write("              </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
