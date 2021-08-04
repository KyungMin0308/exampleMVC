<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Success</title>
</head>
<body>
	
	<%-- JSP Expression Language ��� --%>
	<ul>
		<li> ID: ${customer.id} </li>
		<li> NAME: ${customer.name} </li>
	</ul>
	
	<%-- JSTL ��� --%>
	<table>
		<caption>JSTL ��� ����</caption>
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