
package com.blog.ControllerServlet;

import com.blog.Dao.likeDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class likeServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String operation=request.getParameter("operation");
            int uid=Integer.parseInt(request.getParameter("uid"));
            int pid=Integer.parseInt(request.getParameter("pid"));
/*out.println("Data from server");
out.println(operation);
        out.println("uid="+uid);
        out.println("pid="+pid);*/
            System.out.println(uid);
            System.out.println(pid);
             likeDao l=new likeDao(Connection_provider.getConnection());
            if(operation.equals("like"))
            {
                if(l.isliked(pid, uid))
                {    
                }
                else
                {
                boolean b=l.insertliked(pid, uid);
                out.println(b);
                }
            }
                }
    }
 
    
    }// </editor-fold>


