package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fake_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <div id=\"fb-root\"></div>\n");
      out.write("        <script>\n");
      out.write("            var currentAuthor = 'A Tiny User';\n");
      out.write("var userAllowedToResolve = 'Admin1';\n");
      out.write("\n");
      out.write("tinymce.init({\n");
      out.write("  selector: 'textarea#comments-embedded',\n");
      out.write("  toolbar: 'bold italic underline | addcomment showcomments',\n");
      out.write("  menubar: 'file edit view insert format tools tc',\n");
      out.write("  menu: {\n");
      out.write("    tc: {\n");
      out.write("      title: 'Comments',\n");
      out.write("      items: 'addcomment showcomments deleteallconversations'\n");
      out.write("    }\n");
      out.write("  },\n");
      out.write("  plugins: 'paste code tinycomments',\n");
      out.write("  tinycomments_mode: 'embedded',\n");
      out.write("  tinycomments_author: currentAuthor,\n");
      out.write("  tinycomments_can_resolve: function (req, done, fail) {\n");
      out.write("    var allowed = req.comments.length > 0 &&\n");
      out.write("                  req.comments[0].author === currentAuthor;\n");
      out.write("    done({\n");
      out.write("      canResolve: allowed || currentAuthor === userAllowedToResolve\n");
      out.write("    });\n");
      out.write("  },\n");
      out.write("  content_style: 'body { font-family:Helvetica,Arial,sans-serif; font-size:14px }',\n");
      out.write("  /* The following setup callback opens the comments sidebar when the editor loads */\n");
      out.write("  setup: function (editor) {\n");
      out.write("    editor.on('SkinLoaded', function () {\n");
      out.write("      editor.execCommand(\"ToggleSidebar\", false, \"showcomments\", { skip_focus: true });\n");
      out.write("    })\n");
      out.write("  }\n");
      out.write("}); </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            \n");
      out.write("        <div id=\"tiny-ui\">\n");
      out.write("  <textarea id=\"comments-embedded\" style=\"width: 100%; height: 500px;\">\n");
      out.write("    <h2>Welcome to Tiny Comments!</h2>\n");
      out.write("    <p>Please try out this demo of our new Tiny Comments premium plugin.</p>\n");
      out.write("    <ol>\n");
      out.write("      <li>Highlight the content you want to comment on.</li>\n");
      out.write("      <li>Click the <em>Add Comment</em> icon in the toolbar.</li>\n");
      out.write("      <li>Type your comment into the text field at the bottom of the Comment sidebar.</li>\n");
      out.write("      <li>Click <strong>Save</strong>.</li>\n");
      out.write("    </ol>\n");
      out.write("    <p>Your comment is then attached to the text, <span class=\"mce-annotation tox-comment\" data-mce-annotation-uid=\"mce-conversation_19679600221621399703915\" data-mce-annotation=\"tinycomments\">exactly like this!</span></p>\n");
      out.write("    <p>If you want to take Tiny Comments for a test drive in your own environment, Tiny Comments is one of the premium plugins you can try for free for 14 days by signing up for a Tiny account. Make sure to check out our documentation as well.</p>\n");
      out.write("    <p>And if you are ready to buy, you can either purchase Tiny Comments a la carte or as part of your Tiny Pro subscription. If you are a current cloud user, Tiny Comments has already been added to your key, and if you are a self-hosted user, Tiny Comments is now available in the latest download which you can access in My Account.</p>\n");
      out.write("    <h2>A simple table to play with</h2>\n");
      out.write("    <table style=\"border-collapse: collapse; width: 100%;\" border=\"1\">\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("          <th>Product</th>\n");
      out.write("          <th>Value</th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody>\n");
      out.write("        <tr>\n");
      out.write("          <td><a href=\"https://www.tiny.cloud/\">Tiny Cloud</a></td>\n");
      out.write("          <td>The easiest and most reliable way to integrate powerful rich text editing into your application.</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td><a href=\"https://www.tiny.cloud/drive/\">Tiny Drive</a></td>\n");
      out.write("          <td>Image and file management for TinyMCE in the cloud.</td>\n");
      out.write("        </tr>\n");
      out.write("      </tbody>\n");
      out.write("    </table>\n");
      out.write("    <p>Thanks for supporting TinyMCE! We hope it helps your users create great content.</p>\n");
      out.write("    <!--tinycomments|2.1|data:application/json;base64,eyJtY2UtY29udmVyc2F0aW9uXzE5Njc5NjAwMjIxNjIxMzk5NzAzOTE1Ijp7InVpZCI6Im1jZS1jb252ZXJzYXRpb25fMTk2Nzk2MDAyMjE2MjEzOTk3MDM5MTUiLCJjb21tZW50cyI6W3sidWlkIjoibWNlLWNvbnZlcnNhdGlvbl8xOTY3OTYwMDIyMTYyMTM5OTcwMzkxNSIsImF1dGhvciI6IkFub3RoZXIgVGlueSBVc2VyIiwiYXV0aG9yTmFtZSI6IkFub3RoZXIgVGlueSBVc2VyIiwiY29udGVudCI6IlBsZWFzZSByZXZpc2UgdGhpcyBzZW50ZW5jZSwgZXhjbGFtYXRpb24gcG9pbnRzIGFyZSB1bnByb2Zlc3Npb25hbCEiLCJjcmVhdGVkQXQiOiIyMDIxLTA1LTE5VDA0OjQ4OjIzLjkxNFoiLCJtb2RpZmllZEF0IjoiMjAyMS0wNS0xOVQwNDo0ODoyMy45MTRaIn1dfX0=-->\n");
      out.write("  </textarea>\n");
      out.write("</div>\n");
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
