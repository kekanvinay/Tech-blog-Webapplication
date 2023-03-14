package com.blog.ControllerServlet;
import com.blog.ModeBeans.UserREG;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean res=false;
        
        try (PrintWriter out = response.getWriter()) {
           String name=request.getParameter("username");
           String password=request.getParameter("password");
           System.out.println("Name is"+name);
           System.out.println("password is"+password);
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
                    u.setRole(Integer.parseInt(rs.getString(9)));
                    HttpSession session=request.getSession();
                    session.setAttribute("un",u);
                   out.println(true);
                }
                else
                {
                  out.println(false); 
                }
           }
            catch(Exception e)
            {
                out.println(e);
            }
           
        }
 }

}