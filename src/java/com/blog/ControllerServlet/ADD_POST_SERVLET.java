
package com.blog.ControllerServlet;

import com.blog.Dao.post_dao;
import com.blog.ModeBeans.UserREG;
import com.blog.ModeBeans.post;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig
public class ADD_POST_SERVLET extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out =response.getWriter();
      int cid=Integer.parseInt(request.getParameter("cid"));
      String ptitle=request.getParameter("title");
      String pcontent=request.getParameter("content");
      String pcode=request.getParameter("code");
      Part part=request.getPart("pic"); 
      //getting curreunt user id
        HttpSession se=request.getSession();
          UserREG ue=(UserREG)se.getAttribute("un");
        //creating the post class object for storing the data
      post p=new post(ptitle, pcontent, pcode,part.getSubmittedFileName(),cid,ue.getId());
/*try
{
    String q="insert into post(ptitle,pcontent,pcode,ppic,CID,userID)values('"+ptitle+"','"+pcontent+"','"+pcode+"','"+part+"',3,3)";
     Statement st=Connection_provider.getConnection().createStatement();
     int x=st.executeUpdate(q);
     if(x==1)
     {
         out.println("done");
     }
     else
     {
         out.println("error");
     }
}        
catch(Exception e)
 {
     out.println(e);
 }*/
post_dao p1=new post_dao(Connection_provider.getConnection());
        if(p1.saveDao(p))
        {
            out.println("DONE");
          //  String path =request.getRealPath("img")+File.separator+"images"+File.separator+part.getSubmittedFileName();
            //String path =part.getSubmittedFileName();
            //out.println(path);  
            //uploading code
            try{
            FileOutputStream fos=new FileOutputStream("E:\\netbeans project\\blog\\web\\img\\"+part.getSubmittedFileName()+"");
            InputStream fis=part.getInputStream();
            //reading data
            byte[]data=new byte[fis.available()];
            fis.read(data);
            fos.write(data);
            fos.close();
            }
            catch(Exception e)
            {
                out.println(e);
                System.out.println(e);
            }
        }
        else
        {
            out.println("error");
        }
        out.println(part.getSubmittedFileName());
        out.println(ptitle);
        out.println(pcode);
        out.println("category"+cid);
       System.out.println("JAY SHREE RAM="+ue.getId());
        out.println(" RAm "+pcontent);
    }

    }


