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
			<th>Sharing</th>
			<th>Rent</th>
			<th>Remove</th>
			<th>Update</th>
		</tr>
		
		<tr>
			<td><%=g.getGname()%></td>
			<td><%=g.getGaadhar()%></td>
			<td><%=g.getGemail()%></td>
			<td><%=g.getMobile()%></td>
			<td><%=g.getLoc()%></td>
			<td><%=g.getFloor()%></td>
			<td><%=g.getFlat()%></td>
			<td><%=g.getShare()%></td>
			<td><%=g.getRent()%></td>
			<td><a href="did?email=<%=g.getGemail()%>">delete</a></td>
			<td><a href="update.jsp?name=<%=g.getGname()%>&&aadhar=<%=g.getGaadhar()%>&&email=<%=g.getGemail()%>&&mobile=<%=g.getMobile()%>&&location=<%=g.getLoc()%>&&floor=<%=g.getFloor()%>&&flat=<%=g.getFlat()%>&&share=<%=g.getShare()%>&&rent=<%=g.getRent()%>">edit</a></td>
		</tr>
		
	</table>
</body>
</html>