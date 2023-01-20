/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blog.ControllerServlet;

import com.blog.Dao.comment_dao;
import com.blog.ModeBeans.Comment;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ADD_Comment_Servlet extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            int pid=Integer.parseInt(request.getParameter("pid"));
            int uid=Integer.parseInt(request.getParameter("uid"));
            String uname=request.getParameter("uname");
            String content=request.getParameter("content");
             Comment  c=new Comment(pid, uid, content, uname);
             
             comment_dao c1=new comment_dao(Connection_provider.getConnection());
              if(c1.SaveComment(c))
              {
                  out.println("Doneeee");
                  response.sendRedirect("Comment.jsp");
              }
              else
              {
                  out.println("Erooor");
              }
              out.println("post id="+pid);
              out.println("user id="+uid);
              out.println("user name="+uname);
              out.println("user comment="+content);
        }
    }

    
}
