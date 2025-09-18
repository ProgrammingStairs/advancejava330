<%@page import="dao.AppliedVacancyDao"%>
<%@page import="dao.CandidateDao"%>
<%@page import="dto.VacancyDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.VacancyDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="public/css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="header" style="height: 50px;padding:10px;">
            <img src="public/images/logo.png" id="logoImg" style="height: 60px;">
            <span style="font-weight: bolder;font-family: candara;font-size: 32px; position: absolute; margin-top: 10px;margin-left: 10px;">SchoolHire</span>
        </div>
        <%@include  file="candidateHeaderNav.jsp"%>
        <div id="home">
            <blockquote>
                <%
                    String email = (String) session.getAttribute("email");
                    CandidateDao candidateDao = new CandidateDao();
                    int candidateId = candidateDao.getCandidateInfo(email).getCandidateId();
                    AppliedVacancyDao appliedVacancyDao = new AppliedVacancyDao();
                    VacancyDao vacancyDao = new VacancyDao();
                    ArrayList<VacancyDto> vacancy = vacancyDao.candidateViewVacancy();
                %>
                <h2 style="font-family: candara;">Welcome <%=email%> | Vacancy List</h2>
                <p style="font-family: candara;font-size: 18px; text-align: justify;">
                    
                <table border="1" cellspacing="0" cellpadding="10">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Vacancy<br>Name</th>
                            <th>Criteria</th>
                            <th>JobType</th>
                            <th>JobMode</th>
                            <th>Vacancy</th>
                            <th>Salary</th>
                            <th>Location</th>
                            <th>Timings</th>
                            <th>Bond</th>
                            <th>Gender<br>Pre</th>
                            <th>JoiningStatus</th>
                            <th>AdvDate</th>
                            <th>LastDate</th>
                            <th>Reallocate</th>
                            <th>Apply</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for(VacancyDto vac : vacancy){ %>
                        <tr>
                            <td><%=vac.getVacancyId() %></td>
                            <td><%=vac.getVacancyName()%></td>
                            <td><%=vac.getCriteria()%></td>
                            <td><%=vac.getJobType()%></td>
                            <td><%=vac.getJobMode()%></td>
                            <td><%=vac.getVacancy()%></td>
                            <td><%=vac.getSalary()%></td>
                            <td><%=vac.getLocation()%></td>
                            <td><%=vac.getTimings()%></td>
                            <td><%=vac.getBond()%></td>
                            <td><%=vac.getGenderPre()%></td>
                            <td><%=vac.getJoiningStatus()%></td>
                            <td><%=vac.getAdvDate()%></td>
                            <td><%=vac.getLastDate()%></td>
                            <td><%=vac.getReallocate()%></td>
                            <%
                                boolean res = appliedVacancyDao.checkCandidateJobApply(candidateId, vac.getVacancyId());
                            %>
                            <td>
                                <% if(res) {%>
                                    Applied
                                <%}else{%>
                                <a href="candidateApply.jsp?vid=<%=vac.getVacancyId() %>&vname=<%=vac.getVacancyName()%>">Apply</a>
                                <%}%>
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
                    
                </p>
            </blockquote>
        </div>

    </body>
</html>
