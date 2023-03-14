<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>    
    <meta charset="utf-8">
    <title>Login Page</title>
    <script src="jQuery.js" type="text/javascript"></script>
    <script src="myjs.js" type="text/javascript"></script>
     <link rel="stylesheet" href="login-1.css">
  </head>
  <body>
<%@include file="header-1.jsp"%>
    <!--form area start-->
    <div class="form">
      <!--login form start-->
      <form class="login-form">
          <p id="error"></p>
            <div class="text">Login</div>
        
        <div class="icons">
          <a href="#"><i class="fa fa-facebook"></i></a>
          <a href="#"><i class="fa fa-google"></i></a>
          <a href="#"><i class="fa fa-twitter"></i></a>
        </div>
        <input class="input" type="text" name="username" id="username" value="" placeholder="username" required>
        <input class="input" id="password" type="password" name="" value="" placeholder="password" required>
         <div class="remember-forgot">
        <label><input type="checkbox" id="checkbox" onclick="myfunction()">Show Password</label>
        <a href="#">Forgot Password?</a>
      </div>
        <button type="button" class="btn-1" name="button">Login</button>
        <p class="options">Not Registered? <a href="Resiter.jsp">Create an Account</a></p>
      </form>
      <!--login form end-->
    </div>
    <!--form area end-->
 <script>
      $(document).ready(function(){
                        $('.btn-1').click(function()
                        {   
                            var username=$('#username').val();
                            var password=$('#password').val();
                            $.ajax({
                                type: "POST",
                                url:"LoginServlet",   // this is my servlet
                                data:{
                                    "username":username,
                                    "password":password
                                },
                                success: function (data) {
                               if(data.trim()=='true')
                               {    
                                 alert('Login succesfully');
                                 var url=document.referrer;
                                 window.location.href=url;
                             }
                             else
                             {
//                                 console.log(data);
                                  alert('invaild user name and password');
                                  $('#username').val("");
                                  $('#password').val("");
                                }
                            }
                            });                                
                        });
                    });
  </script>
  </body>
</html>