<%@page import="com.blog.Dao.userDao"%>
<%@page import="java.util.List"%>
<%@page import="com.blog.ModeBeans.post"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.Dao.post_dao"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="SliderCardcss.css">
     
 
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
  <script src="https://kit.fontawesome.com/a076d05399.js"></script>
  
  </head>
  <body>
     <div class="post-slider">
    <h1 class="cont">
      <span>T</span>
      <span>r</span>
      <span>e</span>
      <span>a</span>
      <span>d</span>
      <span>i</span>
      <span>n</span>
      <span>g</span>
      <span>P</span>
      <span>o</span>
      <span>s</span>
      <span>t</span>
    </h1>
    <i class="fas fa-angle-left prev"></i>
    <i class="fas fa-angle-right next"></i>

    <div class="post-wrapper">
        <%
post_dao  pdao=new post_dao(Connection_provider.getConnection());
List <post>plist=pdao.getTop6ALLPost();
for(post p0:plist)
{
%>
      <div class="post">
          <img src="img/<%=p0.getPpic()%>" alt="" class="slider-image">
        <div class="post-info">
            <h4><a href="show_blog.jsp?postID=<%=p0.getPid()%>"><%=p0.getPtitle()%></a></h4>
          <%userDao u=new userDao(); %>
            <i class="fas fa-user"><%=" "+ u.getuserByid(p0.getUserid()).getName()%> </i>
          &nbsp;
          <i class="fas fa-calendar"><%=p0.getPdate()%></i>
        </div>

      </div>
           <%}%>
         </div>
         
  </div>
      
      <script>
         
$(document).ready(function(){    
        $('.post-wrapper').slick({
        slidesToShow: 3,
        slidesToScroll: 1,
        autoplay: true,
        autoplaySpeed: 2000,
        nextArrow: $('.next'),
        prevArrow: $('.prev'),
        responsive: [
            {
                breakpoint: 1024,
                settings: {
                    slidesToShow: 3,
                    slidesToScroll: 3,
                    infinite: true,
                    dots: true
                }
            },
            {
                breakpoint: 600,
                settings: {
                    slidesToShow: 2,
                    slidesToScroll: 2
                }
            },
            {
                breakpoint: 480,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
            }
           
        ]
    });

   
});
      </script>
</body>
</html>
