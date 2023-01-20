package com.blog.ControllerServlet;
import com.blog.ModeBeans.UserREG;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
           String name=request.getParameter("username");
           String password=request.getParameter("password");
           try
           {
               Connection con=Connection_provider.getConnection();
               Statement st=con.createStatement();
               String q="Select *from techuser WHERE Name='"+name+"'AND password='"+password+"'";
               ResultSet rs=st.executeQuery(q);
                if(rs.next())
                {
                  UserREG u=new UserREG();
                  u.setId(Integer.parseInt(rs.getString(1)));
                    u.setName(rs.getString(2));
                    u.setEmail(rs.getString(3));
                    u.setPassword(rs.getString(4));
                    u.setGender(rs.getString(5));
                    u.setAbout(rs.getString(6));
                    u.setRDATE(rs.getTimestamp("RDate"));
                    //u.setProfile(rs.getString(8));
                    HttpSession session=request.getSession();
                    session.setAttribute("un",u);
                    response.sendRedirect("mainProfile.jsp");
                }
                else
                {
                    RequestDispatcher rd=request.getRequestDispatcher("login_page.jsp");
                    response.getWriter().println("<h3 style='color:red'> 'invaild username and passworrd'</h3>");
                    rd.include(request, response);
                }
               
              
           }
            catch(Exception e)
            {
                out.println();
            }
            out.println("</body>");
            out.println("</html>");
        }
 }

}