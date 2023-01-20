function Demo(pid,uid)
 {
var reqest=new XMLHttpRequest();
reqest.open("GET","likeServlet");
reqest.send(pid,uid);
 }
 

