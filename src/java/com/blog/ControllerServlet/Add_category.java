package com.blog.ControllerServlet;
import com.blog.Dao.CategoryDao;
import com.blog.ModeBeans.Category;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Add_category extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           PrintWriter out = response.getWriter();
            int cid=Integer.parseInt(request.getParameter("cid"));
            String catName=request.getParameter("cat");
            String catDesc=request.getParameter("desc"); 
           Category c=new Category(cid, catName, catDesc);
           CategoryDao co=new CategoryDao(Connection_provider.getConnection());
          
           if(co.savecategory(c))
            {
              response.sendRedirect("admin/main_category.jsp");
            }
            else
            {
                out.println("error");
            }
    }
    }

