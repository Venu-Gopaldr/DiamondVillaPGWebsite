<%@page import="diamondvilla.dto.GuestDB"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Diamond Villa</title>
<style type="text/css">
table{
width: 100%;
}
</style>
</head>
<body>
<% List<GuestDB> l=(List<GuestDB>)request.getAttribute("key");%>
	<table border="5px"; cellspacing="5px"; cellpadding="10px";>
		<tr>
			<th>Name</th>
			<th>Aadhar Number</th>
			<th>Email</th>
			<th>Mobile Number</th>
			<th>Location</th>
			<th>Floor Number</th>
			<th>Flat Number</th>
			<th>Rent</th>
			<th>Remove</th>
		</tr>
		<%for(GuestDB g : l){ %>
		<tr>
			<td><%= g.getGname() %></td>
			<td><%= g.getGaadhar() %></td>
			<td><%= g.getGemail() %></td>
			<td><%= g.getMobile() %></td>
			<td><%= g.getLoc() %></td>
			<td><%= g.getFloor() %></td>
			<td><%= g.getFlat() %></td>
			<td><%= g.getRent() %></td>
			<td> <a href="did?email=<%=g.getGemail()%>">delete</a> </td>
		</tr>
		<%} %>
	</table>
</body>
</html>