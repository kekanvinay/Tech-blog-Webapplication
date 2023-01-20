/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blog.Dao;

import com.blog.ControllerServlet.Connection_provider;
import com.blog.ModeBeans.UserREG;
import com.blog.ModeBeans.post;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
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
        String q="Update techuser SET Name='"+u.getName()+"',Email='"+u.getEmail()+"',password='"+u.getPassword()+"',about='"+u.getAbout()+"',gender='"+u.getGender()+"' WHERE id='"+u.getId()+"'"; 
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
    
}
