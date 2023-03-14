<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.blog.ModeBeans.post"%>
<%@page import="java.util.List"%>
<%@page import="com.blog.ControllerServlet.Connection_provider"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.blog.Dao.post_dao"%>
<html>
    <%!   static int total=0;
                static int blank=0;
                static int count=0;
               %>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

    <title>BLOG HOME PAGE</title>
    <link href="style.css" rel="stylesheet" type="text/css" />   
      </head>
  <body>
    <div class="main-container">       
              <%@include file="header-1.jsp" %>
              
                           <%@include file="Slider_page.jsp" %>
                           
                           <div class="page">
                              <%@include file="sidebar.jsp" %>              
                              <div class="card" id="all-blog">
                        <%@include file="all_category.jsp"%>
           </div>
               
          </div>
           
        <div class="pagination">
                <%
                try
                {
                Statement st=Connection_provider.getConnection().createStatement();
                String q="Select count(*) from post";
                ResultSet rs=st.executeQuery(q);
               
                if(rs.next())
                {
                 total=rs.getInt(1);
                }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                %>
                        <a href="#"><i class="fas fa-chevron-left"></i></a>
                        <%
               
                       while(total>blank)
                       {
                            
                            %>
                        <button onclick="Load(<%=blank%>)"><a class="pages"><%=++count%></a></button>
                        <%
                         blank=blank+7;
                       }
                     blank=0;
                     count=0;
                        %>
                        
                        <a href=""><i class="fas fa-chevron-right"></i></a>     
               </div>
                     
    </div>
                        <%@include file="footer1.jsp" %>           
           
                         
                        
  </body>
  <script type="text/javascript">
    $(function () {
      $("[data-load]").each(function () {
        $(this).load($(this).data("load"), function () {});
      });
    });
    
    function Load(more)
    
       {
             console.log(more);
             var d ={
                            more: more
                        }
                $.ajax(
                        {
                            type: "GET",
                            url: "all_category.jsp",
                            data: d,
                            success: function (data, textStatus, jqXHR)
                            {
                                 $('#all-blog').html(data);
                            },
                            error: function (jqXHR, textStatus, errorThrown) {
                                console.log(data);
                            }
                        })
         }
    
  </script>
</html>
