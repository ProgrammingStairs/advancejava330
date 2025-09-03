<%@page import="dto.StateDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.StateDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function getCities(){
                var stateId = document.getElementById("state").value;
//                alert(stateId+" "+typeof stateId);
                 var method = "GET";
                 var url = "city_ajax.jsp?stateId="+stateId;
                 var async_status = true;
                 
                 var xhttp = new XMLHttpRequest();
                 xhttp.open(method,url,async_status);
                 xhttp.send();
                 
                 xhttp.onreadystatechange = function(){
                     if(xhttp.readyState==4 && xhttp.status==200){
                         document.getElementById("city").innerHTML = xhttp.responseText;
                     }
                 }
    }
        </script>
    </head>
    <body>
        <h2>Ajax Example</h2>
        <%
            StateDao stateDao = new StateDao();
            ArrayList<StateDto> list = stateDao.getStateList();
        %>
        
        <label>Select State</label>
        <select id="state" name="state" onchange="getCities()">
            <option value="">Select State</option>
            <% for(StateDto state : list){ %>
            <option value="<%=state.getStateid() %>"><%=state.getStatename() %></option>
            <%}%>
         </select> <br>
         
         <label>Select City</label>
        <select id="city" name="city">
            <option value="">Select City</option>
         </select>
    </body>
</html>
