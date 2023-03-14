package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("   <head>\n");
      out.write("      <meta charset=\"utf-8\">\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("      <meta name=\"description\" content=\"\">\n");
      out.write("      <meta name=\"author\" content=\"\">\n");
      out.write("      <title>Categories</title>\n");
      out.write("      <!-- Custom fonts for this template-->\n");
      out.write("      <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("      <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("      <!-- Custom styles for this template-->\n");
      out.write("      <link href=\"vendor/css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("   </head>\n");
      out.write("   <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("   <body id=\"page-top\">\n");
      out.write("      <!-- Page Wrapper -->\n");
      out.write("      <div id=\"wrapper\">\n");
      out.write("         <!-- Sidebar -->\n");
      out.write("         <ul class=\"navbar-nav bg-dark sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("            <!-- Sidebar - Brand -->\n");
      out.write("            <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"blog.php\">\n");
      out.write("               <div class=\"sidebar-brand-icon rotate-n-15\"> <i class=\"fas fa-laugh-wink\"></i> </div>\n");
      out.write("               <div class=\"sidebar-brand-text mx-3\">Category</div>\n");
      out.write("            </a>\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider my-0\">\n");
      out.write("            <!-- Nav Item - Dashboard -->\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider\">\n");
      out.write("            <!-- Nav Item - Utilities Collapse Menu -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("               <a class=\"nav-link\" href=\"\"> <span>Blogs</span></a>\n");
      out.write("            </li>\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider\">\n");
      out.write("            <!-- Nav Item - Tables -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"category.jsp\"> <span>Categories</span> </a>\n");
      out.write("            </li>\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider\">\n");
      out.write("            <!-- Nav Item - Tables -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("               <a class=\"nav-link collapsed\" href=\"\"> <span>Users</span> </a>\n");
      out.write("            </li>\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("            <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("            <div class=\"text-center d-none d-md-inline\">\n");
      out.write("               <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("            </div>\n");
      out.write("         </ul>\n");
      out.write("         <!-- End of Sidebar -->\n");
      out.write("         <!-- Content Wrapper -->\n");
      out.write("         <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("            <!-- Main Content -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("               <!-- Topbar -->\n");
      out.write("               <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("                  <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                  <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\"> <i class=\"fa fa-bars\"></i> </button>\n");
      out.write("                  <!-- Topbar Navbar -->\n");
      out.write("                  <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                     <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n");
      out.write("                     <li class=\"nav-item dropdown no-arrow d-sm-none\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"fas fa-search fa-fw\"></i> </a>\n");
      out.write("                        <!-- Dropdown - Messages -->\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-right p-3 shadow +animated--grow-in\" aria-labelledby=\"searchDropdown\">\n");
      out.write("                           <form class=\"form-inline mr-auto w-100 navbar-search\">\n");
      out.write("                              <div class=\"input-group\">\n");
      out.write("                                 <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("                                 <div class=\"input-group-append\">\n");
      out.write("                                    <button class=\"btn btn-primary\" type=\"button\"> <i class=\"fas fa-search fa-sm\"></i> </button>\n");
      out.write("                                 </div>\n");
      out.write("                              </div>\n");
      out.write("                           </form>\n");
      out.write("                        </div>\n");
      out.write("                     </li>\n");
      out.write("                     <!-- Nav Item - User Information -->\n");
      out.write("                     <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">\n");
      out.write("                        username\n");
      out.write("                        </span> <img class=\"img-profile rounded-circle\" src=\"vendor/img/undraw_profile.svg\"> </a>\n");
      out.write("                        <!-- Dropdown - User Information -->\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"userDropdown\">\n");
      out.write("                           <a class=\"dropdown-item\" href=\"#\"> <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i> Profile </a>\n");
      out.write("                           <a class=\"dropdown-item\" href=\"#\"> <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i> Settings </a>\n");
      out.write("                           <div class=\"dropdown-divider\"></div>\n");
      out.write("                           <a class=\"dropdown-item\" \n");
      out.write("                              href=\"\"> <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>Logout </a>\n");
      out.write("                        </div>\n");
      out.write("                     </li>\n");
      out.write("                  </ul>\n");
      out.write("               </nav>\n");
      out.write("               <!-- End header -->\n");
      out.write("               <!-- Begin Page Content -->\n");
      out.write("               <div class=\"container-fluid\">\n");
      out.write("                  <!-- Page Heading -->\n");
      out.write("                  <h5 class=\"mb-2 text-gray-800\">Category</h5>\n");
      out.write("                  <!-- DataTales Example -->\n");
      out.write("                  <div class=\"card shadow\">\n");
      out.write("                     <div class=\"card-header py-3 d-flex justify-content-between\">\n");
      out.write("                       \n");
      out.write("                           <form class=\"navbar-search\">\n");
      out.write("                              <div class=\"input-group\">\n");
      out.write("                                  <input type=\"number\" name=\"cid\" placeholder=\"Enter the category id\">\n");
      out.write("                              </div>\n");
      out.write("                               <br>\n");
      out.write("                               <div>\n");
      out.write("                                  <input type=\"text\" name=\"cat\" placeholder=\"Enter the Category\" required=\"\">\n");
      out.write("                              </div>\n");
      out.write("                               <div> \n");
      out.write("                                   <input type=\"submit\"> \n");
      out.write("                               </div>\n");
      out.write("                                <br>\n");
      out.write("                           </form>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <footer class=\"sticky-footer bg-white\">\n");
      out.write("               <div class=\"container my-auto\">\n");
      out.write("                  <div class=\"copyright text-center my-auto\"> <span>Copyright &copy; Blog 2022</span> </div>\n");
      out.write("               </div>\n");
      out.write("            </footer>\n");
      out.write("            <!-- End of Footer -->\n");
      out.write("         </div>\n");
      out.write("         <!-- End of Content Wrapper -->\n");
      out.write("      </div>\n");
      out.write("      <!-- End of Page Wrapper -->\n");
      out.write("      <!-- Scroll to Top Button-->\n");
      out.write("      <a class=\"scroll-to-top rounded\" href=\"#page-top\"> <i class=\"fas fa-angle-up\"></i> </a>\n");
      out.write("      <!-- Bootstrap core JavaScript-->\n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("      <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("      <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("      <!-- Core plugin JavaScript-->\n");
      out.write("      <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("      <!-- Custom scripts for all pages-->\n");
      out.write("      <script src=\"vendor/js/sb-admin-2.min.js\"></script>\n");
      out.write("      <!-- Page level plugins -->\n");
      out.write("      <script src=\"https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js\" referrerpolicy=\"origin\"></script>\n");
      out.write("      <script src=\"//cdn.ckeditor.com/4.17.1/standard/ckeditor.js\"></script>\n");
      out.write("      <script>\n");
      out.write("         CKEDITOR.replace( 'blog_body' );\n");
      out.write("      </script>\n");
      out.write("   </body>\n");
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
