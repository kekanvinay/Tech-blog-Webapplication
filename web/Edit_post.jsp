
<%@page import="com.blog.ModeBeans.post"%>
<%@page import="com.blog.ModeBeans.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.Dao.post_dao"%>
<html> <%
               //Get the data using post id
                 int postid=Integer.parseInt(request.getParameter("postId"));
                 post_dao p1=new post_dao(Connection_provider.getConnection());
                  post p2=p1.getPostBypostid(postid);
               %>
    
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
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" 
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" 
        crossorigin="anonymous"></script>
        <script src="jQuery.js" type="text/javascript"></script>
        <script src="js/myjs.js" type="text/javascript"></script>
        <!-- For textEditor-->
        <script src="https://cdn.ckeditor.com/4.20.1/standard/ckeditor.js"></script>
        
       <!--ADDING POST--> 
       <div class="container" >
           <h1 style="color: blue" c>Update Your POST DETAILS</h1>
                <div >
                    <div>
                        <div >
                            <form action="Update_post_servlet?postId=<%=postid%>" method="post" enctype="multipart/form-data">
           
           <div class="form-group">
               <select name="cid">
                   <option selected disabled>---Select Categary--</option>
                   <%
                  post_dao p=new post_dao(Connection_provider.getConnection());
                 ArrayList<Category> list= p.getAllCateGary();
                 for(Category c:list)
                 {
                     if(c.getCid()==p2.getCatID())
                     {
                        
                         %>
                         <option value="<%=c.getCid()%>" selected><%=c.getName()%></option>
                     <%}
                     else{
                     %>
                  
                   <option value="<%=c.getCid()%>"><%=c.getName()%></option>
                  <%}
                 }  %>
                   
               </select>
               
              
           </div>
                                <div class="form-group">
                                    <label for="UserName"><h3 style="color: red">Enter Post title</h3></label>
                                    <input type="text" name="title" class="form-control" id="username" value="<%=p2.getPtitle()%>" aria-describedby="emailHelp" placeholder="Enter NAME">

                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail1"><h3 style="color: red">Enter Post Content</h3></label>
                                    <textarea required id="content" name="content"  class="form-control" placeholder="Enter Content" style="height:200px">
                                    <%=p2.getPcontent()%></textarea>
                                    </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1"><h3 style="color: red">Enter your code </h3></label>
                                      <textarea required id="code"  name="code" class="form-control"  placeholder="Enter Content" style="height:200px">
                                   <pre> <%=p2.getPcode()%></pre> </textarea>
                                </div>

                                <div class="form-group">
                                    <label ><h3 style="color: red">Enter your pic..</h3></label><br>
                                    <input type="file" name="pic" id="file" value="">
                                </div>                         
                                <br>
                                <button type="submit" class="btn btn-primary">Update</button>
                            </form>
                                 </div>
                    </div>

                </div>
           </div>
   
     <script>
    CKEDITOR.replace('content', {
      uiColor: '#CCEAEE',
      removeButtons: 'PasteFromWord'
    });
    CKEDITOR.replace('code', {
      uiColor: '#CCEAEE',
      removeButtons: 'PasteFromWord'
    });
    
   window.onload=function ()
   {
       document.getElementById('file').value="<%=p2.getPpic()%>";
       
   }
  </script>
   </body>                                                                                                                                                           
</html>
