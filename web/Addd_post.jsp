
<%@page import="com.blog.ModeBeans.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.Dao.post_dao"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>

    <body>
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
        
       <!--ADDING POST--> 
       <div class="container" >
           <h1 style="color: blue" c>PROVIDE YOUE POST DETAILS</h1>
                <div >
                    <div>
                        <div >
       <form action="ADD_POST_SERVLET" method="post" enctype="multipart/form-data">
           
           <div class="form-group">
               <select name="cid">
                   <option selected disabled>---Select Categary--</option>
                   <%
                  post_dao p=new post_dao(Connection_provider.getConnection());
                 ArrayList<Category> list= p.getAllCateGary();
                 for(Category c:list)
                 {
                   
                   %>
                   <option value="<%=c.getCid()%>"><%=c.getName()%></option>
                  <%}%>
                   
               </select>
               
               
           </div>
                                <div class="form-group">
                                    <label for="UserName"><h3 style="color: red">Enter Post title</h3></label>
                                    <input type="text" name="title" class="form-control" id="username" aria-describedby="emailHelp" placeholder="Enter NAME">

                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail1"><h3 style="color: red">Enter Post Content</h3></label>
                                    <textarea required id="content" name="content" class="form-control" placeholder="Enter Content" style="height:200px">
                                    </textarea>
                                    </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1"><h3 style="color: red">Enter your code </h3></label>
                                    <input type="text" class="form-control" name="code" id="Password" placeholder="Enter your Progarm">
                                </div>

                                <div class="form-group">
                                    <label ><h3 style="color: red">Enter your pic..</h3></label><br>
                                    <input type="file" name="pic">
                                </div>                         
                                <br>
                                <button type="submit" class="btn btn-primary">Register</button>
                            </form>
                                 </div>
                    </div>

                </div>
           </div>
    </body>
</html>
