<%@page import="java.sql.Connection"%>
<%@page import="com.blog.Dao.likeDao"%>
<%@page import="com.blog.Dao.userDao"%>
<%@page import="com.blog.ModeBeans.post"%>
<%@page import="java.util.List"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.Dao.post_dao"%>
<%@page import="com.blog.ModeBeans.UserREG"%>
<%
    UserREG s = (UserREG) session.getAttribute("un");
    if (s == null) {
        response.sendRedirect("login_page.jsp");
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
        <script src="js/myjs.js" type="text/javascript"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script type="text/javascript" src=
                "https://code.jquery.com/jquery-3.5.1.js">
        </script>
        <div id="fb-root"></div>

        <script>
            function showdata(a)
            {
                var xmlhttp = new XMLHttpRequest();
                xmlhttp.onreadystatechange = function ()
                {
                    document.getElementById("lik").innerHTML = xmlhttp.responseText;
                }
                xmlhttp.open("POST", "likedata.jsp", true);

                xmlhttp.send();
            }
            function dolike(pid, uid)
            {
                console.log(pid + " " + uid);
                var d =
                        {
                            uid: uid,
                            pid: pid,
                            operation: 'like'
                        }
                $.ajax(
                        {
                            type: "POST",
                            url: "likeServlet",
                            data: d,
                            success: function (data, textStatus, jqXHR)
                            {
                                console.log(data);
                                if (data.trim() == 'true')
                                {
                                    let c = $(".like_count").html();
                                    c++;
                                    $(".like_count").html(c);
                                }
                            },
                            error: function (jqXHR, textStatus, errorThrown) {
                                console.log(data);
                            }
                        })
            }
        </script>
        <style>

            .post-title
            {
                font-weight:120;
                font-size:30px; 
            }
            .post-content
            {
                font-weight:100;
                font-size:20px; 
            }
            .post-date
            {
                font-style: initial;
                font-weight: bold;
            }
            .post-user-info
            {
                font-size: 20px;
                font-weight:150px; 
            }
            .row-user 
            {
                border: 1px solid brown;
                padding-top: 15px;
            }
            body
            {
                background: url(img/bg.jpg);
                background-size: cover;
                background-attachment: fixed;
            }
            .post-code
            {
                background-color: black
            }
        </style>
        <div id="fb-root"></div>
<script async defer crossorigin="anonymous" src="https://connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v15.0" nonce="cdwBD6Sq"></script>
    </head>
    <body>

        <!--Java Script-->

        <!--   <script src="newjs.js" type="text/javascript"></script>
          <script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI=" crossorigin="anonymous"></script>
        -->


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
                            <a class="nav-link" href="" >  <span class="fa fa-user-circle"><%=s.getName()%></a>
                        <li class="nav-item">
                            <a class="nav-link" href="Logout_Servlet">  <span class="fa fa-user-plus">Logout</a>
                        </li>
                    </ul>
                </div>
            </nav>
            <!--main content -->
            <div class="container">
                <div class="row my-5">
                    <div class="col-md-6 offset-md-3">
                        <div class="card">

                            <div class="card-footer primary-background">

                                <h4 class="post-title"><%=p1.getPtitle()%></h4>
                            </div>
                            <div class="card-body">
                                <img class="card-img-top" src="img/<%=p1.getPpic()%> " alt="Card image cap">
                                <div class="row my-3 row-user">
                                    <div class="col-md-8">
                                        <%
                                              userDao u = new userDao();%>
                                        <p class="post-user-info"><a href="#"><%=u.getuserByid(p1.getUserid()).getName()%></a> has Posted :</p>
                                    </div>
                                    <div class="col-md-4 ">
                                        <p class="post-date"><%=p1.getPdate().toString()%></p>
                                    </div>
                                </div>
                                <p class="post-content"> <%=p1.getPcontent()%></p>
                                <br>
                                <br>
                                <div class="post-code">
                                    <code> <%=p1.getPcode()%></code>
                                </div>
                            </div>
                            <%
                                likeDao l = new likeDao(Connection_provider.getConnection());
                            %>
                            <div class="card-footer primary-background">
                                <a href="show_blog.jsp?postID=<%=p1.getPid()%>" class="btn btn-outline-primary" >Read More..</a>
                                <!--<a href="" class="btn btn-outline-primary"><button name="subject" type="submit" value="fav_HTML" class="fa fa-thumbs-o-up" onclick="showdata()"></button ><span id="lik">0</span></a>
                                -->  <a href="#" onclick="dolike(<%=p1.getPid()%>,<%=s.getId()%>)" class="btn btn-outline-primary" ><i class="fa fa-thumbs-o-up"></i><span class="like_count"><%=l.countlike(p1.getPid())%></span></a>
                                <a href="Comment.jsp?pid=<%=p1.getPid()%>&&uid=<%=s.getId()%>&&uname=<%=s.getName()%>" class="btn btn-outline-primary" ><i class="fa fa-commenting-o"></i><span></span></a>
                            </div>
                            <div class="card-comment">
                                <div class="fb-comments" data-href="http://localhost:8080/blog/show_blog.jsp" data-width="" data-numposts="5"></div>
                            </div>
                        </div>
                    </div> 

                </div>
            </div>

    </body>