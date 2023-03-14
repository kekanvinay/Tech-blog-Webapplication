
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
        
    </head>
    <body>
        
      <!-- Start navbar -->
      
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
      
      <!-- end navbar      
        <h1>Hello World!</h1>
        <%=s.getName()%>
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
        
        <main class="primary-background p-5">
            <div class="container">1
                <div class="col-md-6 offset-md-3">
                    <div class="card">
                        <div class="card-header text-center">
                            <span class="fa fa-user-circle fa-3x"></span>
                            <br>
                            <p>TechBlog</p>
                            <table class="table">
  
  <tbody>
    <tr>
      <th scope="row">ID :</th>
      <td><%=s.getId()%></td>
     
     
    </tr>
    <tr>
      <th scope="row">Name :</th>
      <td><%=s.getName()%></td>
      
      
    </tr>
    <tr>
      <th scope="row">Gender :</th>
      <td><%=s.getGender()%></td>
    
    </tr>
    
     <tr>
      <th scope="row">Status :</th>
      <td><%=s.getAbout()%></td>
    
    </tr>
    
    <tr>
      <th scope="row">Registered ON</th>
      <td><%=s.getRDATE()%></td>
    
    </tr>
  </tbody>
</table>
      <a href="EditUser.jsp?userid=<%=s.getId()%>"><button type="submit" class="btn btn-primary">Edit</button></a>               
                    </div>

                </div>



            </div>


        </main>
         </body>
</html>

<%
}
%>
