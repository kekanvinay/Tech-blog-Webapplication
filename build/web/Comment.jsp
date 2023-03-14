    <%@page import="com.blog.ModeBeans.Comment"%>
<%@page import="java.util.List"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.Dao.comment_dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int pid=Integer.parseInt(request.getParameter("pid"));
            int uid=Integer.parseInt(request.getParameter("uid"));
            String uname=request.getParameter("uname");
            
           
        %>
       
              <div class="container" >
           <h1 style="color: blue" c>PROVIDE YOUE POST DETAILS</h1>
                
                            <form action="ADD_Comment_Servlet?uid=<%=uid%>&&pid=<%=pid%>&&uname=<%=uname%>" method="post" >
           
                       
                                <div class="form-group">
                                    <label for="exampleInputEmail1"><h3 style="color: red">Enter Post Comment</h3></label>
                                    <textarea required id="content" name="content" class="form-control" placeholder="Enter Content" style="height:5cm; width:70%">
                                    </textarea
                                    </div>                   
                                <br>
                                <button type="submit" class="btn btn-primary">Comment</button>
                          
                                 </div>
                          </form>
                      </div>
        <!-- Dispaly the Comment-->
        <% 
        comment_dao c=new comment_dao(Connection_provider.getConnection());
          List <Comment>l=c.getAllComment(pid);
          for(Comment c1:l)
          {
        %>
        <div class="row" style=" background-color: #FF4500" >
            <div class="col-12">
         <div class="card mt-3" >
             <div class="card-body" style="color: white">
      <h5 class="card-title" style="font-size:22px;"><%=c1.getUname()%></h5>
   
      <p class="card-text" style="font-size:20px"><%=c1.getContent()%></p>    
      
  </div>
</div>
                </div>
</div>
      <br>
      <%
          }
      %>
    </body>
</html>
