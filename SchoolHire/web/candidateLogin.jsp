<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="public/css/style.css" rel="stylesheet" type="text/css"/>
        <style>
            input[type="email"],input[type="password"]{
                height: 30px;
                width: 300px;
                font-size: 17px;
                margin: 5px;
                border-width: 0px 0px 2px 0px;
                border-color:black;
            }
            input[type="submit"],input[type="reset"]{
                height: 35px;
                width: 305px;
                font-size: 17px;
                margin: 5px;
                background-color: #234567;
                color:white;
                border-width: 0px;
            }

        </style>
    </head>
    <body>
        <div id="header" style="height: 50px;padding:10px;">
            <img src="public/images/logo.png" id="logoImg" style="height: 60px;">
            <span style="font-weight: bolder;font-family: candara;font-size: 32px; position: absolute; margin-top: 10px;margin-left: 10px;">SchoolHire</span>
        </div>
              <%@include  file="headerNav.jsp"%>

        <div id="home">
            <blockquote>
                <h1 style="font-family: candara;">Candidate Login</h1>
                <form action="candidateLoginDB.jsp" method="post">
                        <input 
                            type="email"
                            placeholder="Enter Email"
                            name="email"
                            id="email"
                            required
                         ><br>
                        <input 
                            type="password"
                            placeholder="Enter Password"
                            name="password"
                            id="password"
                            required
                         ><br>
                        <input
                            type="submit"
                            value="Login"
                         ><br>
                        <input
                            type="reset"
                            value="Reset"
                         ><br>
                        <a href="candidateRegistration.jsp">Yet Not Registered ? Register Here </a>  
                </form>
            </blockquote>
        </div>
        
    </body>
</html>
