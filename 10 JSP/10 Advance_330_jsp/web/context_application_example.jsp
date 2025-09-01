<%
    String driver = config.getInitParameter("driver");
    String project = application.getInitParameter("project");
    
out.println("<br>Driver name : "+driver);
out.println("<br>Project name : "+project);

%>