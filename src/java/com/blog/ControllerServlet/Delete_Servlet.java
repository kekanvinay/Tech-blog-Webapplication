package com.blog.ControllerServlet;
import com.blog.Dao.userDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Delete_Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int uid=Integer.parseInt(request.getParameter("uid"));
             userDao u=new userDao();
             if(u.DeleteUser(uid))
             {
                response.sendRedirect(request.getHeader("referer"));
             }
             else
             {
                 response.getWriter().println("error");
             }
    }


}
