<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="com.csys.model.ServletPojo" %>
    
        <%@ page import="java.util.ArrayList" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
<table>
<tr>
 <td>name</td>
 <td>date</td>
 <td>email</td>
 <td>phoneno</td>
 <td>address</td>
 <td>district</td>
 
</tr>
<% ArrayList<ServletPojo> list =( ArrayList<ServletPojo>) request.getAttribute("formlist");
    for(ServletPojo obj:list){
%>
<tr>
<td><%= obj.getName()%></td>
<td><%= obj.getDate()%></td>
<td><%= obj.getEmail()%></td>
<td><%= obj.getPhoneNo()%></td>
<td><%= obj.getAddress()%></td>
<td><%=obj.getDistrict() %></td>
<%
}
    %>
</table>

</body>
</html>