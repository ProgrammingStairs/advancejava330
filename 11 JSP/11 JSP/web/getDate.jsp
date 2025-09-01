<%@page contentType="text/html" import="java.util.Calendar" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
                <%= "Today's Date : "+Calendar.getInstance().getTime() %>
            
        </h1>
    </body>
</html>
