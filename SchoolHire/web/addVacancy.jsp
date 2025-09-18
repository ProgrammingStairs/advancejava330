<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="public/css/style.css" rel="stylesheet" type="text/css"/>
        <style>
            input[type="email"],input[type="password"],select,input[type="text"],input[type="date"],input[type="number"]{
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
              <%@include  file="adminHeaderNav.jsp"%>

        <div id="home">
            <blockquote>
                       <%
                    String email = (String)session.getAttribute("email");
                %>
                  <h2 style="font-family: candara;">Welcome <%=email%></h2>
                  <center><h2 style="font-family: candara;">Add Vacancy</h2></center>
                <form action="addVacancyDb.jsp" method="post">

                    <div style="width:48%; float:left; text-align: center">
                                            <input 
                            type="text"
                            placeholder="Enter Vacancy Name"
                            name="vacancyName"
                            id="vacancyName"
                            required
                         ><br>    
                    <input 
                            type="text"
                            placeholder="Enter Criteria"
                            name="criteria"
                            id="criteria"
                            required
                         ><br>
                    <select id="jobType" name="jobType">
                        <option value="">Select Job Type</option>
                        <option value="FullTime">FullTime (8-9 Hours)</option>
                        <option value="PartTime">PartTime (4-5 Hours)</option>
                    </select><br>  
                    <select id="jobMode" name="jobMode">
                        <option value="">Select Job Mode</option>
                        <option value="Online">Online</option>
                        <option value="Offline">Offline</option>
                    </select><br>
                    <input 
                            type="number"
                            placeholder="Enter Number of Vacancy"
                            name="vacancy"
                            id="vacancy"
                            step="1"
                            min="1"
                            required
                         ><br>
                        <input 
                            type="text"
                            placeholder="Enter Salary"
                            name="salary"
                            id="salary"
                            required
                         ><br>
                         <input 
                            type="text"
                            placeholder="Enter Location"
                            name="location"
                            id="location"
                            required
                         ><br>
  <input 
                            type="text"
                            placeholder="Enter Timings"
                            name="timings"
                            id="timings"
                            required
                         ><br>
                         Select Bond<br>
                    <select id="bond" name="bond">
                        <option value="">Select Bond Option</option>
                        <option value="Bond-Yes">Bond-Yes</option>
                        <option value="Bond-No">Bond-No</option>
                    </select><br>

                    </div>
                    <div style="width:48%; float:left; text-align: center">
                    Gender Preference<br>
                    <select id="genderPre" name="genderPre">
                        <option value="">Select Gender Preference</option>
                        <option value="Male">Male</option>
                        <option value="Female">Female</option>
                    </select><br>                                              
                    Joining Status<br>
                    <select id="joiningStatus" name="joiningStatus">
                        <option value="">Select Joining Status</option>
                        <option value="Immediate Joiners Required">Immediate Joiners Required</option>
                        <option value="Join within 10 Days">Join within 10 Days</option>
                        <option value="Join within a month">Join within a month</option>
                        <option value="Join within 2 months">Join within 2 months</option>
                    </select><br>
                    AdvDate : <br>
                    <input 
                            type="date"
                            name="advDate"
                            id="advDate"
                            required
                         ><br>
                    LastDate : <br>
                    <input 
                            type="date"
                            name="lastDate"
                            id="lastDate"
                            required
                         ><br>
                    Reallocation<br>
                    <select id="reallocate" name="reallocate">
                        <option value="">Select Reallocation</option>
                        <option value="Yes">Yes</option>
                        <option value="No">No</option>
                    </select><br>          
                    <input
                            type="submit"
                            value="Add Vacancy"
                         ><br>
                        <input
                            type="reset"
                            value="Reset"
                         ><br>

                    </div>
                </form>                 
                
                
            </blockquote>
        </div>
        
    </body>
</html>
