
package com.blog.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class likeDao {

    Connection con;
    public likeDao(Connection con) {
        this.con=con;
    }
    
    public boolean insertliked(int postid,int uid)
    {
        boolean f=false;
        try
        {
        String q="insert into ulike(pid,uid) values('"+postid+"','"+uid+"')";
        Statement st=this.con.createStatement();
        st.executeUpdate(q);
        f=true;
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
        return f;
    }

public  int countlike(int postid)
{
int count=0;
try{
String q="select COUNT(*) from ulike WHERE pid='"+postid+"'";
Statement  st=this.con.createStatement();
    ResultSet rs=st.executeQuery(q);
    if(rs.next())
    {
        count=rs.getInt("count(*)");
    }
}
catch(Exception e)
{
    e.printStackTrace();
}
return count;
}
public boolean isliked(int postid,int uid)
{
    boolean f=false;
    try
    {
        Statement st=this.con.createStatement();
    String  q="Select* from ulike WHERE pid='"+postid+"'and uid='"+uid+"'";
        ResultSet rs=st.executeQuery(q);
        if(rs.next())
        {
            f=true;
        }
     }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    return  f;
}
public boolean Deleteliked(int postId,int uid)
{
    boolean f=false;
    try
    {
        Statement st=this.con.createStatement();
        String q="Delete from ulike WHERE pid='"+postId+"' and uid='"+uid+"'";
        st.executeUpdate(q);
        f=true;
    }
    catch(Exception e)
    {
        
    }
    return f;
}
}