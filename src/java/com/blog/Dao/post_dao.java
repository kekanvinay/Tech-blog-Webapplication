package com.blog.Dao;

import com.blog.ModeBeans.Category;
import com.blog.ModeBeans.post;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class post_dao {
    Connection con;

    public post_dao(Connection con) {
        this.con = con;
    }
    public ArrayList<Category> getAllCateGary()
    {
        ArrayList<Category> list=new ArrayList<>();
        try
        {
            String q="Select *from catog";
            Statement st=this.con.createStatement();
                 ResultSet rs=st.executeQuery(q);
                 while(rs.next())
                 {
                     int cid=rs.getInt("cid");
                     String name=rs.getString("Name");
                     String desc=rs.getString("Descrption");
                     Category c=new Category(cid, name, desc);
                     list.add(c);
                 }
         }
        catch(Exception  e)
        {
            e.printStackTrace();
        }
        return list;
    }
    public boolean  saveDao(post p) 
    {
        boolean f=false;
        String q="insert into post(ptitle,pcontent,pcode,ppic,CID,userID)values('"+p.getPtitle()+"','"+p.getPcontent()+"','"+p.getPcode()+"','"+p.getPpic()+"','"+p.getCatID()+"','"+p.getUserid()+"')";
        try
        {
        Statement st=con.createStatement();
        st.executeUpdate(q);
        f=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  f;
    }
    //get All post
    public List<post> getALLPost(int more)
    {
        int count=0;
        count=count+more;
        List<post> list=new ArrayList<>();
        try{
        Statement st=con.createStatement();
          int tmt=6;
        String q="Select *from post order by pid desc limit " + count + ", " + tmt;
        ResultSet rs=st.executeQuery(q);
        while(rs.next())
        {
         int pid=rs.getInt("pid");
         String ptitle=rs.getString("ptitle");
         String pcontent=rs.getString("pcontent");
         String pcode=rs.getString("pcode");
         String pic=rs.getString("ppic");
            Timestamp pdate=rs.getTimestamp("pdate");
            int cid=rs.getInt("CID");
            int userid=rs.getInt("userID");
            post p=new post(pid, ptitle, pcontent, pcode, pic, pdate, cid, userid);
            list.add(p);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return list;
    }
     public List<post> getCatgoryvice(int catid)
    {
        int C=catid;
        System.out.println("jay shree"+catid);
        List<post> list=new ArrayList<>();
        try{
        Statement st=con.createStatement();
        String q="Select *from post WHERE CID='"+catid+"'";
        ResultSet rs=st.executeQuery(q);
        while(rs.next())
        {
         int pid=rs.getInt("pid");
         String ptitle=rs.getString("ptitle");
         String pcontent=rs.getString("pcontent");
         String pcode=rs.getString("pcode");
         String pic=rs.getString("ppic");
            Timestamp pdate=rs.getTimestamp("pdate");
          
            int userid=rs.getInt("userID");
            post p=new post(pid, ptitle, pcontent, pcode, pic, pdate, catid, userid);
            list.add(p);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return list;
    }
     public post getPostBypostid(int postid)
     {
         post p=null;
        
         try{
        Statement st=con.createStatement();
        String q="Select *from post WHERE pid='"+postid+"'";
        ResultSet rs=st.executeQuery(q);
        while(rs.next())
        {
         int pid=rs.getInt("pid");
         String ptitle=rs.getString("ptitle");
         String pcontent=rs.getString("pcontent");
         String pcode=rs.getString("pcode");
         String pic=rs.getString("ppic");
            Timestamp pdate=rs.getTimestamp("pdate");
            int cid=rs.getInt("CID");
            int userid=rs.getInt("userID");
            p=new post(pid, ptitle, pcontent, pcode, pic, pdate, cid, userid);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         return p;
     }
      public List<post> getTop6ALLPost()
    {
        List<post> list=new ArrayList<>();
        try{
        Statement st=con.createStatement();
        String q="Select *from post order by pid desc limit 6";
        ResultSet rs=st.executeQuery(q);
        while(rs.next())
        {
         int pid=rs.getInt("pid");
         String ptitle=rs.getString("ptitle");
         String pcontent=rs.getString("pcontent");
         String pcode=rs.getString("pcode");
         String pic=rs.getString("ppic");
            Timestamp pdate=rs.getTimestamp("pdate");
            int cid=rs.getInt("CID");
            int userid=rs.getInt("userID");
            post p=new post(pid, ptitle, pcontent, pcode, pic, pdate, cid, userid);
            list.add(p);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return list;
    }
      public boolean  UPdatePostDao(post p) 
    {   
        boolean f=false;
        String q="Update post Set ptitle='"+p.getPtitle()+"',pcontent='"+p.getPcontent()+"',pcode='"+p.getPcode()+"',ppic='"+p.getPpic()+"',CID='"+p.getCatID()+"' where pid='"+p.getPid()+"'";
        try
        {
        Statement st=con.createStatement();
        st.executeUpdate(q);
        f=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  f;
    }
}
