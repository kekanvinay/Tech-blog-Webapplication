<%@page import="com.blog.Dao.post_dao"%>
<%@page import="com.blog.Dao.likeDao"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.ModeBeans.post"%>
<%@page import="java.util.List"%>
<%@page import="com.blog.ModeBeans.UserREG"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>  
         <link href="cardEffectcss.css" rel="stylesheet" type="text/css">
    </head>
    <body>
                                            <%
post_dao p1=new post_dao(Connection_provider.getConnection());
 List<post> l=p1.getCatgoryvice(Integer.parseInt(request.getParameter("cid")));
 if(!l.isEmpty())
 for(post p2:l)
 {
     %>
                    <div  class="box"> 
                <div class="imgbx">
                            <img  class="img"  src="img/<%=p2.getPpic()%>"  alt="Card image cap">
                         </div>
                            <div class="content" >
 <div class="text"><%=p2.getPtitle()%></div>
                           
                            <p class="card-text" ><%=p2.getPcontent()%></p>

                           <div class="form-row submit-btn">
                        <div class="input-data">
                            <div class="inner"></div>
                            
                             <a href="show_blog.jsp?postID=<%=p2.getPid()%>">Read More</a>
                        </div>
                   
                                                  
                         </div>
                       
                    </div>
                          </div>
          
                            <%
 }
 else
   out.println("<h1>In this Category Post is not Availble</h1>");

                            %> 
                          
              </body>
</html>


