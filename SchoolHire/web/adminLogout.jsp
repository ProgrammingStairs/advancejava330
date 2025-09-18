<%
    session.setAttribute("email", null);
    session.invalidate();
%>
<script>alert("Logout Successfully")</script>
<%
    response.sendRedirect("adminLogin.jsp");
%>