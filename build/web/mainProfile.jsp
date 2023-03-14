<%@page import="java.util.ArrayList"%>
<%@page import="com.blog.ModeBeans.Category"%>
<%@page import="com.blog.Dao.post_dao"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.ModeBeans.UserREG"%>
<%
    
 UserREG s=(UserREG)session.getAttribute("un");
if(s==null)
    {
    response.sendRedirect("login_page.jsp");
    }
else
{
  %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">   
        <style>
          
  
        </style>
        <script>
            function toggleSidebar(ref){
    document.getElementById("sidebar").classList.toggle('active');
  }
    </script>
    </head>
    <body>
        
      <!-- Start navbar -->
      
          <div class="contanier">
          <div class="sidebar"><!--for side bar-->
              <div id="sidebar">
  <div class="toggle-btn" onclick="toggleSidebar(this)">
    <span></span>
    <span></span>
    <span></span>
    <span></span>
  </div>  
  <div class="list">
      <div class="item" > <button class="active" id="btn-1" >All catgory</button></div>
    <%
      post_dao p=new post_dao(Connection_provider.getConnection());
      p.getAllCateGary();
      ArrayList<Category>list=p.getAllCateGary();
         for(Category c:list)
         {
             %>
             <!-- catgory id ko url per bej diya isko hum url rewriting bolte hai-->
             <div class="item"> 
                 <button onclick="load(<%=c.getCid()%>,'<%=c.getName()%>')"><%=c.getName()%></button></div>  
<%    
         }
     %>

  </div>
</div>
    </div>
       
 
        <!--javascrip-->
         <script
            src="https://code.jquery.com/jquery-3.6.0.min.js"
            integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
            crossorigin="anonymous">< /script<script
                        src = "https://code.jquery.com/jquery-3.6.0.min.js"
                         integrity = "sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
                         crossorigin = "anonymous" > < /script  
                        < script
                src = "https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
                integrity = "sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
                crossorigin = "anonymous" ></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" 
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" 
        crossorigin="anonymous"></script>
        <script src="js/myjs.js" type="text/javascript"></script>
        
        <div class="blog" id="all-blog">
            
        </div>
        </div>
    <script>
          $('#all-blog').load("all_category.jsp");
    </script>
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
         $('#btn-1').click(function() {
          $('#all-blog').load('all_category.jsp');
});
        
     </script>
         </body>
</html>

<%
}
%>
