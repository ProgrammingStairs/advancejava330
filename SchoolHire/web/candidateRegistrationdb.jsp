<%@page import="dao.CandidateDao"%>
<%@page import="dto.CandidateDto"%>

<jsp:useBean id="candidateObj" class="dto.CandidateDto"></jsp:useBean>
<jsp:setProperty name="candidateObj" property="*"></jsp:setProperty>
    
<%
    CandidateDao candidateDao = new CandidateDao();
    int i = candidateDao.addCandidate(candidateObj);
    if(i>0){
    System.out.println("Candidate Added successfully");
%>
    <script>alert("Candidate Registration Successfull");</script>
    <jsp:include page="candidateLogin.jsp"></jsp:include>
<%
    }else{
        System.out.println("Error while adding Candidate");
%>
    <script>alert("Error while adding Candidate");</script>
    <jsp:include page="candidateRegistration.jsp"></jsp:include>
<%}%>