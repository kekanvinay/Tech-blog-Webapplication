<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link href="header-1css.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="Registercss.css">
    <title>Document</title>
</head>

<body>
   
    <%@include file="header-1.jsp"%>
    <form class="Register-form" action="Register_servlet" method="post">
       
         <div class="text">Register</div>
        <div class="icons">
            <a href="#"><i class="fa fa-facebook"></i></a>
            <a href="#"><i class="fa fa-google"></i></a>
            <a href="#"><i class="fa fa-twitter"></i></a>
        </div>
        <input class="input" type="text" name="username" value="" placeholder="Username" required>
        <input class="input" type="email" name="email" placeholder="Email" required value="">
        <input class="input" id="password" type="password" name="password" value="" placeholder="Password" required>
         <div class="remember-forgot">
        <label><input type="checkbox" id="checkbox" onclick="myfunction()">Show Password</label>
       
      </div>
        <div class="form-control">
            <select required name="role">
                <option value="">Select Role</option>
                <option value="0">User</option>
                <option value="1">Bloger</option>
            </select>
        </div>

        <button type="submit" name="button">Register</button>
    </form>
    <!--form area end-->
    <script>
    function myfunction() {
      var p = document.getElementById('password');
      if (p.type == "password") {
        p.type = "text";
      }
      else {
        p.type = "password";
      }
    }
  </script>
</body>

</html> 