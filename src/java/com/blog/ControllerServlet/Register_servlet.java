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
    public void doGet(HttpServletRequest request, HttpServletResponse response)
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
            String Password=request.getParameter("Password");
            String gender=request.getParameter("GENDER");
            String area=request.getParameter("about");
            UserREG u=new UserREG(name,Email,Password,gender, area);
             try
             {
             Connection con=Connection_provider.getConnection();
            Statement st=con.createStatement();
            String q="insert into techUser(Name,Email,password,gender,about) values('"+u.getName()+"','"+u.getEmail()+"','"+u.getPassword()+"','"+u.getGender()+"','"+u.getAbout()+"')";
            int x=st.executeUpdate(q);
            if(x==1)
            {
            response.sendRedirect("login_page.jsp");                
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
