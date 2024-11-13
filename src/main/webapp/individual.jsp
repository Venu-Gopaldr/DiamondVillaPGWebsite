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
	<%
	GuestDB g = (GuestDB)request.getAttribute("individual");
	%>
	<table border="5px" ; cellspacing="10px" ; cellpadding="20px";>
		<tr>
			<th>Name</th>
			<th>Aadhar Number</th>
			<th>Email</th>
			<th>Mobile Number</th>
			<th>Location</th>
			<th>Floor Number</th>
			<th>Flat Number</th>
			<th>Rent</th>
		</tr>
		
		<tr>
			<td><%=g.getGname()%></td>
			<td><%=g.getGaadhar()%></td>
			<td><%=g.getGemail()%></td>
			<td><%=g.getMobile()%></td>
			<td><%=g.getLoc()%></td>
			<td><%=g.getFloor()%></td>
			<td><%=g.getFlat()%></td>
			<td><%=g.getRent()%></td>
		</tr>
		
	</table>
</body>
</html>