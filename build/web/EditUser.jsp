<%@page import="com.blog.ModeBeans.UserREG"%>
<%@page import="com.blog.Dao.userDao"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.Dao.post_dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN Page</title>
        
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <%
            int userid=Integer.parseInt(request.getParameter("userid"));
        userDao u=new userDao();
        UserREG u1=u.getuserByid(userid);
        
        
        %>
        <!-- Navbar-->
       <main class="primary-background p-5">
            <div class="container">1
                <div class="col-md-6 offset-md-3">
                    <div class="card">
                        <div class="card-header text-center">
                            <span class="fa fa-user-circle fa-3x"></span>
                            <br>
                            <p>Edit details</p>

                        </div>
                        <div class="card-body">

                            <form action="UpdateServlet?UID=<%=u1.getId()%>" method="post">

                                <div class="form-group">
                                    <label for="UserName">Enter UserName</label>
                                    <input type="text"name="username" class="form-control"value="<%=u1.getName()%>" id="username" aria-describedby="emailHelp" placeholder="Enter NAME">
                       
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" name="email" class="form-control"value="<%=u1.getEmail()%>" id="email" aria-describedby="emailHelp" placeholder="Enter email">
                                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                </div>

                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" class="form-control" name="Password" id="Password" value="<%=u1.getPassword()%>"placeholder="Password">
                                </div>

                                <div class="form-group">
                                    <label for="Gender">Select Gender</label>
                                    <br>
                                    <input type="text" name="gender" class="form-control"value="<%=u1.getGender()%>" id="username" aria-describedby="emailHelp" placeholder="Enter NAME">
                                </div>
                                <div form-group>
                                    <textarea class="form-control" id="area"  rows="5" name="about"  placeholder="Enter Somthing Your Self"><%=u1.getAbout()%></textarea>
                                </div>
                                <div class="form-check">
                                    <input type="checkbox" class="form-check-input" id="Check">
                                    <label class="form-check-label" for="exampleCheck1">Agree terms And Condition</label>
                                </div>
                                <div class="form-control">
                                    <select required name="role">
                                        <option value="">Select Role</option>
                                        <option value=1>Admin</option>
                                       <option value=0>Co-Admin</option>
                                    </select>
                                </div>
                                <br>
                                <button type="submit" class="btn btn-primary">Update</button>
                            </form>
                        </div>
                    </div>

                </div>



            </div>


        </main>
        
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

