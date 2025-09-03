<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="obj" class="Dto.UserDto"></jsp:useBean>
        <jsp:setProperty name="obj" property="*"></jsp:setProperty>
        <%--<jsp:setProperty name="obj" property="userid" value="100"></jsp:setProperty>--%>
        
        <h2>Details</h2>
        <jsp:getProperty name="obj" property="userid"/> <br>
        <jsp:getProperty name="obj" property="name"/> <br>
        <jsp:getProperty name="obj" property="email"/> <br>
        
    </body>
</html>
