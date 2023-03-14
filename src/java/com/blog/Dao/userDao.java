package com.blog.Dao;
import com.blog.ControllerServlet.Connection_provider;
import com.blog.ModeBeans.UserREG;
import com.blog.ModeBeans.post;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class userDao {

    public userDao() {
    }
    
public UserREG getuserByid(int userid)
{
    UserREG u=null;
    try
    {
        Statement st=Connection_provider.getConnection().createStatement();
       String q="Select*from techuser Where id='"+userid+"'";
        ResultSet rs=st.executeQuery(q);
        if (rs.next()) {
             u=new UserREG();
             u.setId(rs.getInt("id"));
             u.setName(rs.getString("Name"));
             u.setEmail(rs.getString("Email"));
             u.setPassword(rs.getString("password"));
             u.setGender(rs.getString("gender"));
             u.setAbout(rs.getString("about"));
             u.setRDATE(rs.getTimestamp("RDate"));
             u.setProfile(rs.getString("profile"));
             u.setRole(rs.getInt("Role"));
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    return u;
}
public boolean  isUpdateUser(UserREG u) 
    {
        boolean f=false;
        String q="Update techuser SET Name='"+u.getName()+"',Email='"+u.getEmail()+"',password='"+u.getPassword()+"',about='"+u.getAbout()+"',gender='"+u.getGender()+"',Role='"+u.getRole()+"' WHERE id='"+u.getId()+"'"; 
        try
        {
        Statement st=Connection_provider.getConnection().createStatement();                
        st.executeUpdate(q);
        f=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  f;
    }
public List FetchAllUser()
{
    List <UserREG>list=new ArrayList<>();
    try
    {
        Statement st=Connection_provider.getConnection().createStatement();
        String query="select Name,Email,Role,RDate from techuser";
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            UserREG u=new UserREG();
            u.setName(rs.getString(1));
            u.setEmail(rs.getString(2));
            u.setRole(rs.getInt(3));
            u.setRDATE(rs.getDate(4));
            list.add(u);
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    return list;
}
    public List getUserByRole(int role)
    {
        List <UserREG>list=new ArrayList<>();
         try
    {
        Statement st=Connection_provider.getConnection().createStatement();
        String query="select Name,Email,Role,RDate from techuser where '"+1+"'";
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            UserREG u=new UserREG();
            u.setName(rs.getString(1));
            u.setEmail(rs.getString(2));
            u.setRole(rs.getInt(3));
            u.setRDATE(rs.getDate(4));
            list.add(u);
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
        return  list;
    }
    public boolean DeleteUser(int uid)
    {
    boolean flag=false;
    try
    {
    Statement st=Connection_provider.getConnection().createStatement();
    String query="Delete from techuser where id='"+uid+"'";
    st.executeUpdate(query);
    flag=true;
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
     return flag;
    }
    }