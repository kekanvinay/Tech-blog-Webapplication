package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.blog.ModeBeans.Category;
import com.blog.Dao.post_dao;
import com.blog.ControllerServlet.Connection_provider;
import com.blog.ModeBeans.UserREG;

public final class mainProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">   \n");
      out.write("        <style>\n");
      out.write("           .contanier\n");
      out.write("            {\n");
      out.write("                display:flex;\n");
      out.write("                width: 100%;\n");
      out.write("                    margin-top: -4px;   \n");
      out.write("                height:100%;\n");
      out.write("                  background: linear-gradient(\n");
      out.write("          to Right,\n");
      out.write("          rgb(60, 162, 94),\n");
      out.write("          rgb(2, 195, 169),\n");
      out.write("          rgb(107, 210, 96)\n");
      out.write("        );\n");
      out.write("                        \n");
      out.write("            }\n");
      out.write("            .sidebar{\n");
      out.write("                width: 258px;\n");
      out.write("                height: 100%;\n");
      out.write("                /*border: 2px  aqua solid;*/  \n");
      out.write("            }\n");
      out.write("            .blog\n");
      out.write("            {\n");
      out.write("              \n");
      out.write("                width: 80%;\n");
      out.write("                height: max-content;\n");
      out.write("                /*border: 5px red solid;*/\n");
      out.write("                margin-left:10px ;\n");
      out.write("                margin-top: 0px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("    #sidebar {\n");
      out.write("    position:relative;\n");
      out.write("    top:0px;\n");
      out.write("    margin-top:-9px;\n");
      out.write("    left:0px;\n");
      out.write("    width:200px;\n");
      out.write("    height:100%;\n");
      out.write("    background:rgba(0,0,0,0.7);\n");
      out.write("    transition:all 300ms linear;\n");
      out.write("  }\n");
      out.write("  #sidebar.active {\n");
      out.write("    left:-200px;\n");
      out.write("  }\n");
      out.write("  #sidebar .toggle-btn {\n");
      out.write("    position:relative;\n");
      out.write("    left:220px;\n");
      out.write("    top:10px;\n");
      out.write("  }\n");
      out.write("  #sidebar .toggle-btn span {\n");
      out.write("    display:block;\n");
      out.write("    width:30px;\n");
      out.write("    height:5px;\n");
      out.write("    background:#151719;\n");
      out.write("    margin:5px 0px;\n");
      out.write("    cursor:pointer;\n");
      out.write("  }\n");
      out.write("  #sidebar div.list div.item {\n");
      out.write("    padding:15px 10px;\n");
      out.write("    /* border-bottom:1px solid #444; */\n");
      out.write("    color:#fcfcfc;\n");
      out.write("    text-align: center;\n");
      out.write("    text-transform:uppercase ;\n");
      out.write("    font-size:18px;\n");
      out.write("    margin: 20px;\n");
      out.write("  }\n");
      out.write("  #sidebar .list .item button\n");
      out.write("  {\n");
      out.write("      background: transparent;\n");
      out.write("      color: #FF4500;\n");
      out.write("      border: none;\n");
      out.write("  }\n");
      out.write("  #sidebar .list .item button:focus {\n");
      out.write("    outline: none;\n");
      out.write("    color: aquamarine;\n");
      out.write("}\n");
      out.write("nav{\n");
      out.write("    background: linear-gradient(\n");
      out.write("          to Right,\n");
      out.write("          rgb(60, 162, 94),\n");
      out.write("          rgb(2, 195, 169),\n");
      out.write("          rgb(107, 210, 96)\n");
      out.write("        );\n");
      out.write("    \n");
      out.write("}\n");
      out.write("  \n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function toggleSidebar(ref){\n");
      out.write("    document.getElementById(\"sidebar\").classList.toggle('active');\n");
      out.write("  }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("      <!-- Start navbar -->\n");
      out.write("      \n");
      out.write("          <div class=\"contanier\">\n");
      out.write("          <div class=\"sidebar\"><!--for side bar-->\n");
      out.write("              <div id=\"sidebar\">\n");
      out.write("  <div class=\"toggle-btn\" onclick=\"toggleSidebar(this)\">\n");
      out.write("    <span></span>\n");
      out.write("    <span></span>\n");
      out.write("    <span></span>\n");
      out.write("    <span></span>\n");
      out.write("  </div>  \n");
      out.write("  <div class=\"list\">\n");
      out.write("      <div class=\"item\" > <button class=\"active\" id=\"btn-1\" >All catgory</button></div>\n");
      out.write("    ");

      post_dao p=new post_dao(Connection_provider.getConnection());
      p.getAllCateGary();
      ArrayList<Category>list=p.getAllCateGary();
         for(Category c:list)
         {
             
      out.write("\n");
      out.write("             <!-- catgory id ko url per bej diya isko hum url rewriting bolte hai-->\n");
      out.write("             <div class=\"item\"> \n");
      out.write("                 <button onclick=\"load(");
      out.print(c.getCid());
      out.write(',');
      out.write('\'');
      out.print(c.getName());
      out.write("')\">");
      out.print(c.getName());
      out.write("</button></div>  \n");
    
         }
     
      out.write("\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write(" \n");
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
      out.write("        \n");
      out.write("        <div class=\"blog\" id=\"all-blog\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    <script>\n");
      out.write("          $('#all-blog').load(\"all_category.jsp\");\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
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
      out.write("         $('#btn-1').click(function() {\n");
      out.write("          $('#all-blog').load('all_category.jsp');\n");
      out.write("});\n");
      out.write("        \n");
      out.write("     </script>\n");
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
