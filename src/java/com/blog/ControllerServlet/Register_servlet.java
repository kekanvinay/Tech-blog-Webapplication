package com.blog.ControllerServlet;
import com.blog.ModeBeans.UserREG;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register_servlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
      PrintWriter out = response.getWriter();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register_servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            String name=request.getParameter("username");
            String Email=request.getParameter("email");
            String Password=request.getParameter("password");
            String gender=request.getParameter("GENDER");
            String area=request.getParameter("about");
            int rol =Integer.parseInt(request.getParameter("role"));
            UserREG u=new UserREG(name,Email,Password,gender, area,rol);
             try
             {
             Connection con=Connection_provider.getConnection();
            Statement st=con.createStatement();
            String q="insert into techUser(Name,Email,password,gender,about,Role) values('"+u.getName()+"','"+u.getEmail()+"','"+u.getPassword()+"','"+u.getGender()+"','"+u.getAbout()+"','"+u.getRole()+"')";
            int x=st.executeUpdate(q);
            if(x==1)
            {
            response.sendRedirect("login-1.jsp");                
            }
              }
             catch(Exception e)
             {
                 out .println(e);
             }
             //out.println("<h1>Servlet Register_servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
