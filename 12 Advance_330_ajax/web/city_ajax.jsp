<%@page import="dto.CityDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.CityDao"%>
<%
    int stateId = Integer.parseInt(request.getParameter("stateId"));
    System.out.println("-------------------------------------> stateId : "+stateId);
    CityDao cityDao = new CityDao();
    ArrayList<CityDto> list = cityDao.getCityList(stateId);
%>
<option value="">Select City</option>
<%
    for(CityDto city :  list){
%>
<option value="<%=city.getCityid() %>"><%=city.getCityname()  %></option>
<%}%>