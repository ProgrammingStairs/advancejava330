<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                
out.println("Name : "+name);
out.println("Email : "+email);
out.println("Address : "+address);

%>
    </body>
</html>
