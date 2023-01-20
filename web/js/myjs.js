function demo()
{
    var re=/^[A-Za-z]+$/;
    x=document.getElementById("username").value;
    if(re.test(x))
    {
        document.getElementById("t1").innerHTML="Corect";
    }
    else
    {
        document.getElementById("t1").innerHTML="please Enter only Charcter";
    }
}
function dolike(pid,uid)
{
    console.log(pid+" "+uid);
}