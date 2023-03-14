<%@page import="java.sql.Connection"%>
<%@page import="com.blog.Dao.likeDao"%>
<%@page import="com.blog.Dao.userDao"%>
<%@page import="com.blog.ModeBeans.post"%>
<%@page import="java.util.List"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.Dao.post_dao"%>
<%@page import="com.blog.ModeBeans.UserREG"%>
<%!
int uid;
String Name;
int temp;
%>
<%
    UserREG s = (UserREG) session.getAttribute("un");  
    if(s!=null)
    {    temp=1;
        uid=s.getId();
        Name=s.getName();
    }
%>
<%
    int postID = Integer.parseInt(request.getParameter("postID"));
    post_dao p = new post_dao(Connection_provider.getConnection());
    post p1 = p.getPostBypostid(postID);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=p1.getPtitle()%></title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="myjs.js" type="text/javascript"></script>
        <script src="jQuery.js" type="text/javascript"></script>
        <link href="show_blogcss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        
</div>

        <div id="fb-root"></div>

</head>
    <body>
        <%@include file="header-1.jsp" %>
          <div class="postpage">
      <div class="main-content">
        <img src="img/<%=p1.getPpic()%>" class="post-image" alt="" srcset="">
        <div class="post-title">
          <%=p1.getPtitle()%>
        </div>
        <div class="others">
          <% likeDao l=new likeDao(Connection_provider.getConnection()); %>
            <div class="like"><a onclick="dolike(<%=p1.getPid()%>,<%=uid%>,<%=temp%>)"><i
                  class="fa fa-thumbs-up"></i><span class="like_count">
                  <%=l.countlike(p1.getPid())%>
                </span></a></div>
            <div class="date">
              <%=p1.getPdate().toString()%>
            </div>
        </div>
        <% userDao u=new userDao();%>
          <h3>
            <a href="">
              <%=u.getuserByid(p1.getUserid()).getName()%>
            </a> has Posted
          </h3>
          <div class="post-content">
            <p>
              <%=p1.getPcontent()%>
            </p>
           
            <h3>Code</h3>
            <div class="post-code">
              <code> <%=p1.getPcode()%></code>
            </div>
            <a id="btn-1"><i class="fa fa-commenting"></i><span></span></a>
          </div>
      </div>
    </div>
    
              <%@include file="footer1.jsp" %>
  
                            <script>
    $(document).ready(function () {
        var ruk=<%=temp%>
    $('#btn-1').click(function () {
        
        if(ruk==0)
        {  
            window.location.href='login-1.jsp'
            alert("login phele");
        }
        else
        {     window.location.href="Comment.jsp?pid=<%=p1.getPid()%>&&uid=<%=uid%>&&uname=<%=Name%>"
            
        }
    });
});
                                
                                
                            </script>
    </body>