<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <h1>Implicit Object Example</h1>
 <%
     String email = (String)session.getAttribute("email");
 %>
 <h2>Welcome <%=email%></h2>
    </body>
</html>
