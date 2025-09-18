<%@page import="dto.AppliedVacancyDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.AppliedVacancyDao"%>
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
        <%@include  file="adminHeaderNav.jsp"%>
        <div id="home">
            <blockquote>
                <%
                    String email = (String)session.getAttribute("email");
                     AppliedVacancyDao applied = new AppliedVacancyDao();
                    ArrayList<AppliedVacancyDto> list = applied.getAppliedCandidateList();
               
                %>
                <h2 style="font-family: candara;">Welcome <%=email%></h2>

                <table border="1" cellspacing="0" cellpadding="10">
                    <thead>
                        <tr>
                            <th>Applied <br> VacancyId</th>
                            <th>Candidate<br>Id</th>
                            <th>CandidateName</th>
                            <th>Email</th>
                            <th>Vacancy<br>Id</th>
                            <th>VacancyName</th>
                            <th>ApplyStatus</th>
                           </tr>
                    </thead>
                    <tbody>
                        <% for(AppliedVacancyDto vac : list){ %>
                        <tr>
                            <td><%=vac.getAppliedVacancyId()%></td>
                            <td><%=vac.getCandidateId()%></td>
                            <td><%=vac.getCandidateName()%></td>
                            <td><%=vac.getEmail()%></td>
                            <td><%=vac.getVacancyId()%></td>
                            <td><%=vac.getVacancyName()%></td>
                            <td>
                                <form action="adminUpdateStatus.jsp">
                                    <input 
                                        type="hidden" 
                                        name="appliedVacancyId" 
                                        id="appliedVacancyId" 
                                        value="<%=vac.getAppliedVacancyId()%>">
                                    
                                    <select name="applyStatus" id="applyStatus">
                                        <option value="<%=vac.getApplyStatus()%>"> <%=vac.getApplyStatus()%> </option>
                                         <option value="Pending"> Pending </option>
                                          <option value="ShortListed"> ShortListed </option>
                                           <option value="Rejected"> Rejected </option>
                                    </select>
                                    <button>Update Status</button>      
                                </form>
                            </td>
                                <%}%>
                        </tr>
                    </tbody>
                </table>

            </blockquote>
        </div>
        
    </body>
</html>
