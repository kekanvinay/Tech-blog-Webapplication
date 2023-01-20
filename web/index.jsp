<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>BLOG HOME PAGE</title>
        <!--css content-->

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    </head>
    <body>
        <!-- NAVBAR-->
        <%@include file="NavBar.jsp" %>
        <!-- Bannner-->
        <div  class="container-fluid p-0 m-0">
            <div class="jumbotron primary-background">
                <div class="container ">
                    <h3  class="display-3">Welcome To Tech Blog</h3>
                    <p>Welcome  to Technical blog,world of technology Computer programming is the process of performing a particular computation (or more generally, accomplishing a specific computing result), usually by designing and building an executable computer program. </p>
                    <p>Computer programming is the process of performing a particular computation (or more generally, accomplishing a specific computing result), usually by designing and building an executable computer program.</p> 
                    <button class="btn btn-outline-light btn-lg"><sapn class="fa fa-user-plus"></sapn> Start ! It Free</button>
                    <a href="login_page.jsp" class="btn btn-outline-light btn-lg"><sapn class="fa fa-user-circle-o fa-spin"></sapn> LOGIN</a>
                </div>
            </div>

        </div>
        <!-- Cards-->
        <div class="container">
            <div  class="row mb-2">

                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">

                            <h5 class="card-title">Java Programing</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary" >Read More</a>

                        </div>

                    </div>
                </div> 

                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">

                            <h5 class="card-title">Java Programing</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary" >Read More</a>

                        </div>
                    </div>
                </div> 

                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">

                            <h5 class="card-title">Java Programing</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary" >Read More</a>

                        </div>


                    </div>
                </div> 
            </div>

            <!--Secand Row-->
            <div  class="row">

                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">

                            <h5 class="card-title">Java Programing</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary" >Read More</a>

                        </div>
                    </div>
                </div> 

                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">

                            <h5 class="card-title">Java Programing</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary" >Read More</a>

                        </div>


                    </div>
                </div> 

                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">

                            <h5 class="card-title">Java Programing</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary" >Read More</a>
                        </div>
                       </div>
                </div> 
            </div>
          </div>
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
    </body>
</html>
