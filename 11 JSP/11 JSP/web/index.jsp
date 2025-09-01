<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Example of directive tag</h1>
        <form action="number1.jsp">
            <input 
                type="number"
                placeholder="Enter First Number"
                id="first"
                name="first"
                required
            > <br>
            <input 
                type="number"
                placeholder="Enter Second Number"
                id="second"
                name="second"
                required
            > <br>
            <input 
                type="submit"
                value="Divide"
                >
            <input 
                type="reset"
                value="Reset"
                > <br>
            
        </form>
    </body>
</html>
