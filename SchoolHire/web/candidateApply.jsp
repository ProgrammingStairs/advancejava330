<%@page import="jdk.nashorn.internal.runtime.regexp.joni.ApplyCaseFoldArg"%>
<%@page import="dao.AppliedVacancyDao"%>
<%@page import="dto.CandidateDto"%>
<%@page import="dao.CandidateDao"%>
<%
    int vid = Integer.parseInt(request.getParameter("vid"));
    String vacancyName = request.getParameter("vname");
    String candidateEmail = (String)session.getAttribute("email");
    CandidateDao obj = new CandidateDao();
    CandidateDto candidate =  obj.getCandidateInfo(candidateEmail);
    int candidateId = candidate.getCandidateId();
    String name = candidate.getName();
    String applyStatus = "Pending";
   
    AppliedVacancyDao applyVacancy = new AppliedVacancyDao();
    int i = applyVacancy.candidateAppliedVacancy(candidateId, name, candidateEmail, vid, vacancyName, applyStatus);
    if(i>0){
    System.out.println("Candidate Applied Successfully ");
%>
    <script>alert("Candidate Applied Successfully");</script>
    <jsp:include page="candidateViewVacancy.jsp"></jsp:include>
<%
    }else{
        System.out.println("Error while applying for Vacancy");
%>
    <script>alert("Error while applying for Vacancy");</script>
    <jsp:include page="candidateViewVacancy.jsp"></jsp:include>
<%}%>