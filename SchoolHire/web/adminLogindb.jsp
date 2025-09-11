
<%@page import="dao.AdminDao"%>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    AdminDao adminDao = new AdminDao();
    int i = adminDao.checkAdminLogin(email, password);
    if(i!=0){
            session.setAttribute("email", email);
        System.out.println("admin login successfull");
%>
        <script>alert("Admin Login Successfull")</script>
        <jsp:include page="adminHome.jsp"></jsp:include>
<%}else{
        System.out.println("error occured");
%>
        <script>alert("Error while Admin Login")</script>
        <jsp:include page="adminLogin.jsp"></jsp:include>
<%}%>