<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    if(email.equals("andrew@gmail.com") && password.equals("andrew@123")){
        //session.setAttribute("email", email);
        pageContext.setAttribute("email", email, PageContext.SESSION_SCOPE);
        response.sendRedirect("Ex3_1.jsp");
    }else{
        response.sendRedirect("Ex1_1.jsp");
    }
    
%>