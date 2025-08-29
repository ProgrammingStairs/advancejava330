<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    if(email.equals("andrew@gmail.com") && password.equals("andrew@123")){
        session.setAttribute("email", email);
        response.sendRedirect("Ex3.jsp");
    }else{
        response.sendRedirect("Ex1.jsp");
    }
    
%>