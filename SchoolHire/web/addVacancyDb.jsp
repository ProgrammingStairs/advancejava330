<%@page import="dao.VacancyDao"%>
<%@page import="dto.VacancyDto"%>

<jsp:useBean id="vacancyObj" class="dto.VacancyDto"></jsp:useBean>
<jsp:setProperty name="vacancyObj" property="*"></jsp:setProperty>
    
<%
    VacancyDao vacancyDao = new VacancyDao();
    int i = vacancyDao.addVacancy(vacancyObj);
    if(i>0){
    System.out.println("Vacancy Added successfully");
%>
    <script>alert("Vacancy Added Successfully");</script>
    <jsp:include page="addVacancy.jsp"></jsp:include>
<%
    }else{
        System.out.println("Error while adding Vacancy");
%>
    <script>alert("Error while adding Vacancy");</script>
    <jsp:include page="addVacancy.jsp"></jsp:include>
<%}%>