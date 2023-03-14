<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">

<head>
    <meta charset="utf-8">
    <title>Responsive Contact us Form </title>
    <link rel="stylesheet" href="ContactFormcss.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
    <%@include file="header-1.jsp" %>
    <div class="container">
        <div class="text">
            Responsive Contact us Form</div>
        <form action="#">
            <div class="form-row">
                <div class="input-data">
                    <input type="text" required>
                    <div class="underline">
                    </div>
                    <label for="">First Name</label>
                </div>
                <div class="input-data">
                    <input type="text" required>
                    <div class="underline">
                    </div>
                    <label for="">Last Name</label>
                </div>
            </div>
            <div class="form-row">
                <div class="input-data">
                    <input type="text" required>
                    <div class="underline">
                    </div>
                    <label>Email Address</label>
                </div>
                <div class="input-data">
                    <input type="text" required>
                    <div class="underline">
                    </div>
                    <label>Website Name</label>
                </div>
            </div>
            <div class="form-row">
                <div class="input-data textarea">
                    <!-- Due to more textarea tag I got an error.. SO I changed the name of texarea tag into changeit. Replace the changeit text/tag to textarea-->
                    <textarea rows="8" cols="80" required></textarea>
                    <br />
                    <div class="underline">
                    </div>
                    <label>Write your message</label>
                    
                    <div class="form-row submit-btn">
                        <div class="input-data">
                            <div class="inner"></div>
                            <input type="submit" value="submit">
                        </div>
                    </div>
        </form>
    </div>

</body>

</html>