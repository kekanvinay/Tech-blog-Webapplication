    function showdata(a)
                {
                    var xmlhttp = new XMLHttpRequest();
                    xmlhttp.onreadystatechange = function ()
                    {
                        document.getElementById("lik").innerHTML = xmlhttp.responseText;
                    }
                    xmlhttp.open("POST", "likedata.jsp", true);

                    xmlhttp.send();
                }
            function dolike(pid, uid,ruk)
            {   
                if(ruk==0)
                {
                    window.location.href="login-1.jsp";
                    alert('If you want to Like & Comment at any Such part you have First login');
                }
                else
                {
           console.log(pid + " " + uid);
                var d =
                        {
                            uid: uid,
                            pid: pid,
                            operation: 'like'
                        }
                $.ajax(
                        {
                            type: "POST",
                            url: "likeServlet",
                            data: d,
                            success: function (data, textStatus, jqXHR)
                            {
                                console.log(data);
                                if (data.trim() == 'true')
                                {
                                    let c = $(".like_count").html();
                                    c++;
                                    $(".like_count").html(c);
                                }
                            },
                            error: function (jqXHR, textStatus, errorThrown) {
                                console.log(data);
                            }
                        })
            }
        }
        
        function myfunction() {
      var p = document.getElementById('password');
      if (p.type == "password") {
        p.type = "text";
      }
      else {
        p.type = "password";
      }
    }
    
    
                    