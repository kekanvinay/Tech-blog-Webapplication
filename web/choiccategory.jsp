<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.ModeBeans.post"%>
<%@page import="java.util.List"%>
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
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
                   </style>
    </head>
    <body>
        
      <!-- Start navbar -->
      <div  style="width:100%; height:60px">
      
      <nav class="navbar navbar-expand-lg navba-light primary-background text-dark">
    <a class="navbar-brand" href="index.jsp"><span class="fa fa-language"></span>TechBlog</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#"> <span class="fa fa-user-circle">vinay <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">  <span class="fa fa-address-book-o">contact</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Catgories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Programing</a>
          <a class="dropdown-item" href="#">Project Implmentation</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Data Structure</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="#">MORE...</a>
      </li>
      <li class="nav-item">
          <a class="nav-link " href="Addd_post.jsp">DO_POST</a>
      </li>
      
    </ul>
      <ul class="navbar-nav mr-right">
          <li class="nav-item">
              <a class="nav-link" href="profile.jsp">  <span class="fa fa-user-circle"><%=s.getName()%></a>
          <li class="nav-item">
          <a class="nav-link" href="Logout_Servlet">  <span class="fa fa-user-plus">Logout</a>
      </li>
      </ul>
  </div>
</nav>
          </div> 
          
          <div  style="float:left;">
              <%@include file="menubar.jsp" %>
          </div>
          <div  style=" border: 1px solid red; width:75%;height:auto;margin-left:520px;background-image:url(img/bg.jpg);background-size:cover; background-attachment: fixed ;">
        
              <%
post_dao p1=new post_dao(Connection_provider.getConnection());
 List<post> l=p1.getCatgoryvice(Integer.parseInt(request.getParameter("catID")));
 for(post p2:l)
 {
     %>
              <!-- Cards-->
        <div class="container">
            <div  class="row mb-6"> 
                <div class="card" style="margin-bottom:30px; width: 20rem;">
                        <img class="card-img-top" style="width:100%;height:70%" src="img/<%=p2.getPpic()%> " alt="Card image cap">
                        <div class="card-body" style="float:right">

                            <h5 class="card-title"><%=p2.getPtitle()%></h5>
                            <p class="card-text"><%=p2.getPcontent()%></p>
                            <div class="card-footer primary-background">
                                <a href="show_blog.jsp?postID=<%=p2.getPid()%>" class="btn btn-outline-primary" >Read More..</a>
                            <a href="#" class="btn btn-outline-primary" ><i class="fa fa-thumbs-o-up"></i><span>10</span></a>
                            <a href="#" class="btn btn-outline-primary" ><i class="fa fa-commenting-o"></i><span>20</span></a>
                            </div>
                        </div>

                    </div>
              
            </div>
          </div>
                            <%
 }
                            %> 
          </div>
      <!-- end navbar      
        <h1>Hello World!</h1>
      
        --> 
      
        
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
        

         </body>
</html>

<%
}
%>
