package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import com.blog.Dao.likeDao;
import com.blog.Dao.userDao;
import com.blog.ModeBeans.post;
import java.util.List;
import com.blog.ControllerServlet.Connection_provider;
import com.blog.Dao.post_dao;
import com.blog.ModeBeans.UserREG;
import com.blog.ModeBeans.UserREG;

public final class show_005fblog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


int uid;
String Name;
int temp;

UserREG s;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header-1.jsp");
    _jspx_dependants.add("/footer1.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    UserREG s = (UserREG) session.getAttribute("un");  
    if(s!=null)
    {    temp=1;
        uid=s.getId();
        Name=s.getName();
    }

      out.write('\n');

    int postID = Integer.parseInt(request.getParameter("postID"));
    post_dao p = new post_dao(Connection_provider.getConnection());
    post p1 = p.getPostBypostid(postID);

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      out.print(p1.getPtitle());
      out.write("</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"jQuery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"show_blogcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <div id=\"fb-root\"></div>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("        <div class=\"top-bar\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"bg1.jpg\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"About_US.jsp\">About Us</a></li>\n");
      out.write("                    <li><a href=\"ContactForms.jsp\">Contact Us</a></li>\n");
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
      out.write("        </div>   \n");
      out.write("    </header>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("          <div class=\"postpage\">\n");
      out.write("      <div class=\"main-content\">\n");
      out.write("        <img src=\"img/");
      out.print(p1.getPpic());
      out.write("\" class=\"post-image\" alt=\"\" srcset=\"\">\n");
      out.write("        <div class=\"post-title\">\n");
      out.write("          ");
      out.print(p1.getPtitle());
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"others\">\n");
      out.write("          ");
 likeDao l=new likeDao(Connection_provider.getConnection()); 
      out.write("\n");
      out.write("            <div class=\"like\"><a onclick=\"dolike(");
      out.print(p1.getPid());
      out.write(',');
      out.print(uid);
      out.write(',');
      out.print(temp);
      out.write(")\"><i\n");
      out.write("                  class=\"fa fa-thumbs-o-up\"></i><span class=\"like_count\">\n");
      out.write("                  ");
      out.print(l.countlike(p1.getPid()));
      out.write("\n");
      out.write("                </span></a></div>\n");
      out.write("            <div class=\"date\">\n");
      out.write("              ");
      out.print(p1.getPdate().toString());
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 userDao u=new userDao();
      out.write("\n");
      out.write("          <h3>\n");
      out.write("            <a href=\"\">\n");
      out.write("              ");
      out.print(u.getuserByid(p1.getUserid()).getName());
      out.write("\n");
      out.write("            </a> has Posted\n");
      out.write("          </h3>\n");
      out.write("          <div class=\"post-content\">\n");
      out.write("            <p>\n");
      out.write("              ");
      out.print(p1.getPcontent());
      out.write("\n");
      out.write("            </p>\n");
      out.write("            <br>\n");
      out.write("            <h3>Code</h3>\n");
      out.write("            <div class=\"post-code\">\n");
      out.write("              <code> ");
      out.print(p1.getPcode());
      out.write("</code>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"btn btn-outline-primary\" id=\"btn-1\"><i class=\"fa fa-commenting-o\"></i><span></span></a>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("              ");
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
      out.write("\n");
      out.write("  \n");
      out.write("                            <script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        var ruk=");
      out.print(temp);
      out.write("\n");
      out.write("    $('#btn-1').click(function () {\n");
      out.write("        \n");
      out.write("        if(ruk==0)\n");
      out.write("        {  \n");
      out.write("            window.location.href='login-1.jsp'\n");
      out.write("            alert(\"login phele\");\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {     window.location.href=\"Comment.jsp?pid=");
      out.print(p1.getPid());
      out.write("&&uid=");
      out.print(uid);
      out.write("&&uname=");
      out.print(Name);
      out.write("\"\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </script>\n");
      out.write("    </body>");
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
