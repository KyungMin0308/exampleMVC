<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login</title>
</head>
<body>

	Customer ID�� �Է��ϼ���. <br>
	<form action="/exampleMVC/doLogin" method="get">
		Customer ID(id001, id002, id003, id004, id005)
		<input type="text" name="customerId"> <br>
		<input type="submit" value="Press">
	</form>
	
</body>
</html>