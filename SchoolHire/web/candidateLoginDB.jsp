<%@page import="dao.CandidateDao"%>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
CandidateDao candidateDao = new CandidateDao();
int i = candidateDao.checkCandidateLogin(email, password);
    if(i>0){
    session.setAttribute("email", email);
    System.out.println("Candidate Login successfully");
%>
    <script>alert("Candidate Login Successfull");</script>
    <jsp:include page="candidateHome.jsp"></jsp:include>
<%
    }else{
        System.out.println("Error while Logging in Candidate");
%>
    <script>alert("Error while logging in Candidate");</script>
    <jsp:include page="candidateLogin.jsp"></jsp:include>
<%}%>