
package com.blog.Dao;

import com.blog.ModeBeans.Comment;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class comment_dao {
  Connection con;

    public comment_dao() {
    }

    public comment_dao(Connection con) {
        this.con = con;
    }
    public boolean SaveComment(Comment c)
    {
        boolean f=false;
        try{
        String q="insert into comment(Ccontent,ppid,uid,uname)values('"+c.getContent()+"','"+c.getPid()+"','"+c.getUid()+"','"+c.getUname()+"')";
         Statement st=this.con.createStatement();
         st.executeUpdate(q);
         f=true;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return  f;
    }
    public List<Comment>getAllComment(int pid)
    {
        List l=new ArrayList();
        try{
         String Q="Select *from comment Where ppid='"+pid+"'";
         Statement st=this.con.createStatement();
            ResultSet rs=st.executeQuery(Q);
            while(rs.next())
            {
                int cid=rs.getInt("cid");
                int ppid=rs.getInt("ppid");
                int uid=rs.getInt("uid");
                String content=rs.getString("Ccontent");
                String uname=rs.getString("uname");
                Comment c=new Comment(cid, pid, uid, content, uname);
                l.add(c);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return l;
    }
  
}
