<%@page import="com.blog.Dao.post_dao"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="com.blog.Dao.likeDao"%>
<%@page import="com.blog.ModeBeans.post"%>
<%@page import="java.util.List"%>
<%@page import="com.blog.ModeBeans.UserREG"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>     
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="cardEffectcss.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
              <%
                  String more1=request.getParameter("more");
                  int more;
                  if(more1==null)
                  {
                     more=0;
                  }
                  else
                  {
                      more=Integer.parseInt(more1);
                  }
                  
post_dao p1=new post_dao(Connection_provider.getConnection());
 List <post> l=p1.getALLPost(more);
 for(post p2:l)
 {
     %>
              <!-- Cards-->
            
    <div class="box">
    <div class="imgbx">
        <img src="img/<%=p2.getPpic()%>" class="img"  alt="Card image cap" srcset="">
      </div>
      <div class="content">
           <div class="text"><%=p2.getPtitle()%></div>
       
        <p><%=p2.getPcontent()%></p>
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
                            %> 
         
        
         </body>
</html>

<%
//}
%>
