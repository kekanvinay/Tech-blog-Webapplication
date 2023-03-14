<%@page import="java.util.ArrayList"%>
<%@page import="com.blog.ModeBeans.Category"%>
<%@page import="com.blog.Dao.post_dao"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="sidebar.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
     <div class="sidebar">
   <div class="section topics">
        <div class="text">Catgory</div>
         
    
            
        <ul>
            <li><a  href="index.jsp" class="btn-1">All catgory</a>
                             
                              <%
      post_dao p=new post_dao(Connection_provider.getConnection());
      p.getAllCateGary();
      ArrayList<Category>list=p.getAllCateGary();
         for(Category c:list)
         {
             %>
            <li><a onclick="load(<%=c.getCid()%>,'<%=c.getName()%>')" class="btn-1"><%=c.getName()%></a>
                                    
<%    
         }
     %>
      </ul>   
 </div> 
 </div>     
     <script>
       function load(cid,cname)
         {
             console.log(cid+" "+cname);
             var d ={
                            cid: cid
                        }
                $.ajax(
                        {
                            type: "GET",
                            url: "choiccategory.jsp",
                            data: d,
                            success: function (data, textStatus, jqXHR)
                            {
                                 $('#all-blog').html(data);
                            },
                            error: function (jqXHR, textStatus, errorThrown) {
                                console.log(data);
                            }
                        })
         }
        
     </script>
    </body>
</html>
