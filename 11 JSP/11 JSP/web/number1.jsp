<%@page contentType="text/html" errorPage="handleException.jsp" pageEncoding="UTF-8"%>
<%@include  file="index.jsp"%>
<%
    int first = Integer.parseInt(request.getParameter("first"));
    int second = Integer.parseInt(request.getParameter("second"));

    int c = first/second;
    out.println("Divide Result : "+c);
%>