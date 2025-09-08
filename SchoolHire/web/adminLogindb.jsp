
<%@page import="dao.AdminDao"%>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    AdminDao adminDao = new AdminDao();
    int i = adminDao.checkAdminLogin(email, password);
    if(i!=0)
        System.out.println("admin login successfull");
    else
        System.out.println("error occured");
%>