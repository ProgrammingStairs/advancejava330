<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="public/css/style.css" rel="stylesheet" type="text/css"/>
        <style>
            input[type="email"],input[type="password"],select,input[type="text"],input[type="date"]{
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
                <h1 style="font-family: candara;">Candidate Registration</h1>
                <form action="candidateRegistrationdb.jsp" method="post">
                    <input 
                            type="text"
                            placeholder="Enter Name"
                            name="name"
                            id="name"
                            required
                         ><br>    
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
                            type="text"
                            placeholder="Enter 10 Digit Mobile Number"
                            name="contact"
                            id="contact"
                            required
                         ><br>
                        <input 
                            type="text"
                            placeholder="Enter Address"
                            name="address"
                            id="address"
                            required
                         ><br>
                        Select DOB :  <br>
                        <input 
                            type="date"
                            name="date"
                            id="date"
                            required
                         ><br>
                        Select Gender : <br>
                        <input 
                            type="radio"
                            name="gender"
                            id="male"
                            value="male"
                            required
                         >Male
                        <input 
                            type="radio"
                            name="gender"
                            id="female"
                            value="female"
                            required
                         >Female
                        <br>
                        Qualification :  <br>
                        <select name="qualification" id="qualification">
                            <option value="">Select Qualification</option>
                            <option value="B.Com">B.Com</option>
                            <option value="BCA">BCA</option>
                            <option value="B.Sc">B.Sc</option>
                            <option value="M.Com">M.Com</option>
                            <option value="M.Sc">M.Sc</option>
                            <option value="BE">BE</option>
                            <option value="BTech">BTech</option>
                            <option value="MTech">MTech</option>
                            <option value="MCA">MCA</option>
                            <option value="MBA">MBA</option>
                            <option value="B.Ed">B.Ed</option>
                            <option value="M.Ed">M.Ed</option>
                        </select> <br>
                        Experience :  <br>
                      <select name="experience" id="experience">
                            <option value="">Select Experience</option>
                            <option value="Fresher">Fresher</option>
                            <option value="6 Months Experience">6 Months Experience</option>
                            <option value="1+ Year Experience">1+ Year Experience</option>
                            <option value="2+ Year Experience">2+ Year Experience</option>
                        <option value="5+ Year Experience">5+ Year Experience</option>
                         <option value="10+ Year Experience">10+ Year Experience</option>
                         <option value="15+ Year Experience">15+ Year Experience</option>
                      </select><br>
                        <input
                            type="submit"
                            value="Register"
                         ><br>
                        <input
                            type="reset"
                            value="Reset"
                         ><br>
                        <a href="candidateLogin.jsp">Already Registered ? LoginHere </a>  
                </form>
            </blockquote>
        </div>
        
    </body>
</html>
