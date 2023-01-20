<%@page import="com.blog.ModeBeans.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.Dao.post_dao"%>
<html>
    <head>
        <link rel="stylesheet" href="h1.css">
        
    </head>
  <body>      
  <div class="sidebar" style="width:25%; padding:0px; font-size: 40px; background-image:url(img/bg.jpg);background-size:cover; background-attachment: fixed ;">
      <a class="active" href="all_category.jsp" >All catgory</a>
  <%
      post_dao p=new post_dao(Connection_provider.getConnection());
      p.getAllCateGary();
      ArrayList<Category>list=p.getAllCateGary();
         for(Category c:list)
         {
             %>
             <!-- catgory id ko url per bej diya isko hum url rewriting bolte hai-->
             <a href="choiccategory.jsp?catID=<%=c.getCid()%>"><%=c.getName()%></a>
             
              
<%    
         }
     %>
</div>
<div class="content">
  ..
</div>
        
    </body>
    
</html>