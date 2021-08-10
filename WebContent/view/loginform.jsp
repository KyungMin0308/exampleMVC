<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	Customer ID를 입력하세요. <br>
	<form action="/exampleMVC/doLogin" method="get">
		Customer ID(id001, id002, id003, id004, id005)
		<input type="text" name="customerId"> <br>
		<input type="submit" value="Press">
	</form>
	
</body>
</html>