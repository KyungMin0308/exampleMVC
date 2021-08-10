<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	
	<%-- JSP Expression Language 사용 --%>
	<ul>
		<li> ID: ${customer.id} </li>
		<li> NAME: ${customer.name} </li>
	</ul>
	
	<%-- JSTL 사용 --%>
	<table>
		<caption>JSTL 사용 예제</caption>
		<tr>
			<td>ID</td>
			<td>NAME</td>
		</tr>
		<c:forEach var="customer" items="${customers}">
			<tr>
				<td> ${customer.id} | </td>
				<td> ${customer.name} </td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>