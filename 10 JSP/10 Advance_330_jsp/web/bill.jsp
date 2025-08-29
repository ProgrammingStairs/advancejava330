<%--  Example of Scripting Element  --%>
<%
    int p1 = Integer.parseInt(request.getParameter("p1"));
    int p2 = Integer.parseInt(request.getParameter("p2"));
    int q1 = Integer.parseInt(request.getParameter("q1"));
    int q2 = Integer.parseInt(request.getParameter("q2"));
    double gst = Double.parseDouble(request.getParameter("gst"));
%>

<%!
    double calculate(int p1,int q1,int p2,int q2,double gst){
        return (p1*q1+p2*q2)+(p1*q1+p2*q2)*gst/100;
    }
%>

<%= "Total amount : "+calculate(p1,q1,p2,q2,gst) %>
<% out.println("Result : "+calculate(p1,q1,p2,q2,gst)); %>