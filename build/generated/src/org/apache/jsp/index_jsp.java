package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import com.blog.ModeBeans.post;
import java.util.List;
import com.blog.ControllerServlet.Connection_provider;
import java.sql.Connection;
import com.blog.Dao.post_dao;
import com.blog.ModeBeans.UserREG;
import java.util.List;
import com.blog.ModeBeans.post;
import com.blog.ControllerServlet.Connection_provider;
import com.blog.Dao.post_dao;
import java.util.ArrayList;
import com.blog.ModeBeans.Category;
import com.blog.Dao.post_dao;
import com.blog.ControllerServlet.Connection_provider;
import com.blog.Dao.post_dao;
import com.blog.ControllerServlet.Connection_provider;
import com.blog.Dao.likeDao;
import com.blog.ModeBeans.post;
import java.util.List;
import com.blog.ModeBeans.UserREG;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  int total=0;
                static int blank=0;
                static int count=0;
               
UserREG s;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/header-1.jsp");
    _jspx_dependants.add("/Slider_page.jsp");
    _jspx_dependants.add("/sidebar.jsp");
    _jspx_dependants.add("/all_category.jsp");
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
      out.write("<html>\n");
      out.write("    ");
      out.write("\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("\n");
      out.write("    <title>BLOG HOME PAGE</title>\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />   \n");
      out.write("      </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"main-container\">       \n");
      out.write("              ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <style>header ul li {\n");
      out.write("    display: inline;\n");
      out.write("\n");
      out.write("}</style>\n");
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
      out.write("              \n");
      out.write("                           ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"SliderCardcss.css\">\n");
      out.write("     \n");
      out.write(" \n");
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
      out.write("        ");

post_dao  pdao=new post_dao(Connection_provider.getConnection());
List <post>plist=pdao.getTop6ALLPost();
for(post p0:plist)
{

      out.write("\n");
      out.write("      <div class=\"post\">\n");
      out.write("          <img src=\"img/");
      out.print(p0.getPpic());
      out.write("\" alt=\"\" class=\"slider-image\">\n");
      out.write("        <div class=\"post-info\">\n");
      out.write("            <h4><a href=\"show_blog.jsp?postid=");
      out.print(p0.getPid());
      out.write('"');
      out.write('>');
      out.print(p0.getPtitle());
      out.write("</a></h4>\n");
      out.write("          <i class=\"fas fa-user\"> Ritesh Dhanotiya</i>\n");
      out.write("          &nbsp;\n");
      out.write("          <i class=\"fas fa-calendar\">");
      out.print(p0.getPdate());
      out.write("</i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("         </div>\n");
      out.write("         \n");
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
      out.write("           \n");
      out.write("        ]\n");
      out.write("    });\n");
      out.write("\n");
      out.write("   \n");
      out.write("});\n");
      out.write("      </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                           \n");
      out.write("                           <div class=\"page\">\n");
      out.write("                              ");
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
      out.write("        <div class=\"text\">Catgory</div>\n");
      out.write("         \n");
      out.write("    \n");
      out.write("            \n");
      out.write("        <ul>\n");
      out.write("            <li><a  href=\"index.jsp\" class=\"btn-1\">All catgory</a>\n");
      out.write("                             \n");
      out.write("                              ");

      post_dao p=new post_dao(Connection_provider.getConnection());
      p.getAllCateGary();
      ArrayList<Category>list=p.getAllCateGary();
         for(Category c:list)
         {
             
      out.write("\n");
      out.write("            <li><a onclick=\"load(");
      out.print(c.getCid());
      out.write(',');
      out.write('\'');
      out.print(c.getName());
      out.write("')\" class=\"btn-1\">");
      out.print(c.getName());
      out.write("</a>\n");
      out.write("                                    \n");
    
         }
     
      out.write("\n");
      out.write("      </ul>   \n");
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
      out.write("              \n");
      out.write("                              <div class=\"card\" id=\"all-blog\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>     \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"cardEffectcss.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("              ");

                  String more1=request.getParameter("more");
                  int more;
                  if(more1==null)
                  {
                     more=0;
                  }
                  else
                  {
                      more=Integer.parseInt(more1);
                  }
                  
post_dao p1=new post_dao(Connection_provider.getConnection());
 List <post> l=p1.getALLPost(more);
 for(post p2:l)
 {
     
      out.write("\n");
      out.write("              <!-- Cards-->\n");
      out.write("            \n");
      out.write("    <div class=\"box\">\n");
      out.write("    <div class=\"imgbx\">\n");
      out.write("        <img src=\"img/");
      out.print(p2.getPpic());
      out.write("\" class=\"img\"  alt=\"Card image cap\" srcset=\"\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"content\">\n");
      out.write("           <div class=\"text\">");
      out.print(p2.getPtitle());
      out.write("</div>\n");
      out.write("       \n");
      out.write("        <p>");
      out.print(p2.getPcontent());
      out.write("</p>\n");
      out.write("          <div class=\"form-row submit-btn\">\n");
      out.write("                        <div class=\"input-data\">\n");
      out.write("                            <div class=\"inner\"></div>\n");
      out.write("                            <a href=\"show_blog.jsp?postID=");
      out.print(p2.getPid());
      out.write("\">Read More</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("                            ");

 }
                            
      out.write(" \n");
      out.write("         \n");
      out.write("        \n");
      out.write("         </body>\n");
      out.write("</html>\n");
      out.write("\n");

//}

      out.write('\n');
      out.write("\n");
      out.write("           </div>\n");
      out.write("               \n");
      out.write("          </div>\n");
      out.write("           \n");
      out.write("        <div class=\"pagination\">\n");
      out.write("                ");

                try
                {
                Statement st=Connection_provider.getConnection().createStatement();
                String q="Select count(*) from post";
                ResultSet rs=st.executeQuery(q);
               
                if(rs.next())
                {
                 total=rs.getInt(1);
                }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                
      out.write("\n");
      out.write("                        <a href=\"#\"><i class=\"fas fa-chevron-left\"></i></a>\n");
      out.write("                        ");

               
                       while(total>blank)
                       {
                            
                            
      out.write("\n");
      out.write("                        <button onclick=\"Load(");
      out.print(blank);
      out.write(")\"><a class=\"pages\">");
      out.print(++count);
      out.write("</a></button>\n");
      out.write("                        ");

                         blank=blank+7;
                       }
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <a href=\"#\"><i class=\"fas fa-chevron-right\"></i></a>     \n");
      out.write("               </div>\n");
      out.write("                     \n");
      out.write("    </div>\n");
      out.write("                        ");
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
      out.write("           \n");
      out.write("           \n");
      out.write("                         \n");
      out.write("                        \n");
      out.write("  </body>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(function () {\n");
      out.write("      $(\"[data-load]\").each(function () {\n");
      out.write("        $(this).load($(this).data(\"load\"), function () {});\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    function Load(more)\n");
      out.write("    \n");
      out.write("       {\n");
      out.write("             console.log(more);\n");
      out.write("             var d ={\n");
      out.write("                            more: more\n");
      out.write("                        }\n");
      out.write("                $.ajax(\n");
      out.write("                        {\n");
      out.write("                            type: \"GET\",\n");
      out.write("                            url: \"all_category.jsp\",\n");
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
      out.write("    \n");
      out.write("  </script>\n");
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
