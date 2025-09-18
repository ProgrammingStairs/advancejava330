<%@page import="dao.AdminDao"%>
<%
    int appliedVacancyId = Integer.parseInt(request.getParameter("appliedVacancyId"));
    String applyStatus = request.getParameter("applyStatus");
    
    AdminDao adminDao = new AdminDao();
    int i = adminDao.adminUpdateStatus(appliedVacancyId,applyStatus);
    if(i>0){
%>
    <script>alert("Admin Updated Candidate Status")</script>
    <jsp:include page="appliedCandidateList.jsp"></jsp:include>
<%}else{%>
    <script>alert("Error while Admin Update Candidate Status")</script>
    <jsp:include page="appliedCandidateList.jsp"></jsp:include>
<%}%>