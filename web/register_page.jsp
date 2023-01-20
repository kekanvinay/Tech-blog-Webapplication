<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        <%@include file="NavBar.jsp" %>
        <main class="primary-background p-5">
            <div class="container">1
                <div class="col-md-6 offset-md-3">
                    <div class="card">
                        <div class="card-header text-center">
                            <span class="fa fa-user-circle fa-3x"></span>
                            <br>
                            <p>Register Here</p>

                        </div>
                        <div class="card-body">

                            <form  novalidate action="Register_servlet" onsubmit="return demo()">

                                <div class="form-group">
                                    <label for="UserName">Enter UserName</label>
                                    <input  type="text"name="username" class="form-control" id="username" aria-describedby="emailHelp" placeholder="Enter NAME" required >
                                    <small class="form-field-msg form-text text-danger ml-2"></small>

                                </div>
                                
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" name="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email" required>
                                    <small " email-field-msg    form-text text-danger ml-2"></small>
                                </div>

                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" class="form-control" name="Password" id="Password" placeholder="Password" required>
                                 <small " password-field-msg   form-text text-danger ml-2"></small>
                                
                                </div>

                                <div class="form-group">
                                    <label for="Gender">Select Gender</label>
                                    <br>
                                    <input type="radio" id="gender"  value="Male"name="GENDER">Male
                                    <input type="radio" id="gender"  value="FeMAle" name="GENDER">FeMale
                                </div>
                                <div form-group>
                                    <textarea class="form-control" id="area"  rows="5" name="about"  placeholder="Enter Somthing Your Self"></textarea>
                                </div>
                                <div class="form-check">
                                    <input type="checkbox" class="form-check-input" id="Check">
                                    <label class="form-check-label" for="exampleCheck1">Agree terms And Condition</label>
                                </div>
                                <br>
                                <button  onclick="demo()"type="submit" class="btn btn-primary">Register</button>
                            </form>
                        </div>
                    </div>

                </div>



            </div>


        </main>
    </body>
</html>
