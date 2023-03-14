package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.blog.ModeBeans.Category;
import com.blog.Dao.post_dao;
import com.blog.ControllerServlet.Connection_provider;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"sidebar.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <div class=\"sidebar\">\n");
      out.write("   <div class=\"section topics\">\n");
      out.write("        <div class=\"text\">Topics</div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    ");

      post_dao p=new post_dao(Connection_provider.getConnection());
      p.getAllCateGary();
      ArrayList<Category>list=p.getAllCateGary();
         for(Category c:list)
         {
             
      out.write("\n");
      out.write("             <!-- catgory id ko url per bej diya isko hum url rewriting bolte hai-->\n");
      out.write("           \n");
      out.write("        <ul>\n");
      out.write("            <li><a onclick=\"load(");
      out.print(c.getCid());
      out.write(',');
      out.write('\'');
      out.print(c.getName());
      out.write("')\" class=\"btn-1\">");
      out.print(c.getName());
      out.write("</a>\n");
      out.write("                              </ul>          \n");
    
         }
     
      out.write("\n");
      out.write(" </div> \n");
      out.write(" </div>     \n");
      out.write("     <script>\n");
      out.write("       function load(cid,cname)\n");
      out.write("         {\n");
      out.write("             console.log(cid+\" \"+cname);\n");
      out.write("             var d ={\n");
      out.write("                            cid: cid\n");
      out.write("                        }\n");
      out.write("                $.ajax(\n");
      out.write("                        {\n");
      out.write("                            type: \"GET\",\n");
      out.write("                            url: \"choiccategory.jsp\",\n");
      out.write("                            data: d,\n");
      out.write("                            success: function (data, textStatus, jqXHR)\n");
      out.write("                            {\n");
      out.write("                                 $('#all-blog').html(data);\n");
      out.write("                            },\n");
      out.write("                            error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                                console.log(data);\n");
      out.write("                            }\n");
      out.write("                        })\n");
      out.write("         }\n");
      out.write("        \n");
      out.write("     </script>\n");
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
