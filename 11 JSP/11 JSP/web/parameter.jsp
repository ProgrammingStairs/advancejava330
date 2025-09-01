<%-- 
    Document   : parameter
    Created on : 1 Sep, 2025, 4:53:30 PM
    Author     : GAURAV KOTHARI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:forward page="view_Data.jsp">
            <jsp:param name="name" value="Andrew Anderson"></jsp:param>
            <jsp:param name="email" value="andrew@gmail.com"></jsp:param>
            <jsp:param name="address" value="Indore"></jsp:param>

        </jsp:forward>
    </body>
</html>
