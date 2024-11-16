<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DiamondVilla</title>
</head>
<body>
<center>
		<form action="update" method="post">
			<h1>Diamond Villa PG For Men's</h1>
			<table border="10px" ; cellpadding="10px" ; cellspacing="5px";>
				<tr>
					<td><label for="name">Enter Guest Name : </label></td>
					<td><input type="text" readonly="readonly" value="<%=request.getParameter("name")%>" id="name"
						name="name"> <br></td>
				</tr>
				<tr>
					<td><label for="aadhar">Enter Guest Aadhar Number : </label></td>
					<td><input type="text" readonly="readonly" value="<%=request.getParameter("aadhar")%>"
						id="aadhar" name="aadhar"> <br></td>
				</tr>
				<tr>
					<td><label for="email">Enter Guest Email : </label></td>
					<td><input type="email" readonly="readonly" value="<%=request.getParameter("email")%>"
						id="email" name="email"> <br></td>
				</tr>
				<tr>
					<td><label for="mobile">Enter Guest Mobile Number : </label></td>
					<td><input type="tel" value="<%=request.getParameter("mobile")%>"
						id="mobile" name="mobile"> <br></td>
				</tr>
				<tr>
					<td><label for="location">Enter Guest Location : </label></td>
					<td><input type="text" readonly="readonly" value="<%=request.getParameter("location")%>"
						id="location" name="location"> <br></td>
				</tr>
				<tr>
					<td><label for="floor">Select Guest Floor No : </label></td>
					<td><select name="floor" value="<%=request.getParameter("floor")%>">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
					</select> <br></td>
				</tr>
				<tr>
					<td><label for="flat">Enter Guest flat : </label></td>
					<td><input type="text" value="<%=request.getParameter("flat")%>" id="flat"
						name="flat"> <br></td>
				</tr>
				<tr>
					<td><label for="share">Select Guests Sharing : </label></td>
					<td><select name="share" value="<%=request.getParameter("share")%>">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
					</select> <br></td>
				</tr>
				<tr>
					<td><label for="rent">Enter Guest Rent : </label></td>
					<td><input type="number" value="<%=request.getParameter("rent")%>" id="rent"
						name="rent"> <br></td>
				</tr>
				<tr>
					<td colspan="2">
						<button style="height: 45px; width: 350px; margin-left: 25px;">Submit</button> <br>
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>