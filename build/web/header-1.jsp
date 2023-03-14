<%@page import="com.blog.ModeBeans.UserREG"%>
<!DOCTYPE html>
<%!UserREG s;%>
<html lang="en">
<head>
    <style>header ul li {
    display: inline;

}</style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css"
        href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="header-1css.css">
    <title>Document</title>
</head>
<%  
    s = (UserREG) session.getAttribute("un");

%>
<body>
    <header>
        <div class="top-bar">
            <div class="logo">
                <img src="bg1.jpg">
            </div>
            <div class="menu-bar">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="About_US.jsp">About Us</a></li>
                    <li><a href="ContactForms.jsp">Contact Us</a></li>
                    <%
                    if(s==null)
                    {
                    %>
                    <li><a href="login-1.jsp">Login</a></li>
                    <li><a href="Resiter.jsp">Register</a></li>
                    <%}
                    else
                    {%>
                   <li><a href="Logout_Servlet">Logout</a></li>
                    <li><a><%=s.getName()%></a></li>
                    <%}
                    %>
                    <%
                    if(s!=null&&s.getRole()!=0)
                    {
                        %>
                    <li><a href="admin/index.jsp
                           ">Dasboard</a></li>
                    
                   <% }
                    
                    %>
                </ul>
            </div>
            <div class="search-box">
                <div class="input-search">
                    <input type="text" placeholder="Search">
                    <div class="search-icon">
                        <button><i class="fa fa-search"></i></button>
                    </div>
                </div>
            </div>
        </div>   
    </header>
</body>
</html>