/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blog.ControllerServlet;

import com.blog.Dao.userDao;
import com.blog.ModeBeans.UserREG;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class UpdateServlet extends HttpServlet {

   
   public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter(); 
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            int userid=Integer.parseInt(request.getParameter("UID"));
            String name=request.getParameter("username");
            String Email=request.getParameter("email");
            String password=request.getParameter("Password");
            String about=request.getParameter("about");
            String gender=request.getParameter("gender");
            int rol=Integer.parseInt(request.getParameter("role"));
            UserREG u=new UserREG(userid, name, Email, password, gender, about,Date.from(Instant.EPOCH),rol);
          //  out.println(Date.from(Instant.EPOCH));
            userDao u1=new userDao();
            if(u1.isUpdateUser(u))
            {
                out.println("done");
            }
            else
            {
                out.println("eroor");
            }
            out.println("</body>");
            out.println("</html>");
        
    }

}