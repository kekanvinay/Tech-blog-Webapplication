package com.blog.Dao;

import com.blog.ModeBeans.Category;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.constructorParameterOrderType;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {
    Connection con;
    public CategoryDao(Connection con)
    {
        this.con=con;
    }
    public  boolean savecategory(Category co)
    {
        boolean ans=false;
        String query="insert into catog(cid,Name,descrption)values('"+co.getCid()+"','"+co.getName()+"','"+co.getDescription()+"')";
        try{
        Statement st=con.createStatement();
        st.executeUpdate(query);
        ans=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return ans;
    }
    public List<Category> getAllCategory()
    {
        List list=new ArrayList<>();
        String query="select * from catog";
        try
        {
            Statement st=con.createStatement();
           ResultSet rs= st.executeQuery(query);
            while(rs.next())
            {
                int cid=Integer.parseInt(rs.getString(1));
                String Name=rs.getString(2);
                String desc=rs.getString(3);
                Category c=new Category(cid, Name, desc);
                list.add(c);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
}