<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<jsp:include page="inc/top.jsp"></jsp:include>
	</header>
	<h1>main.jsp</h1>
	<form action="test1" method="get">
		<input type="submit" value="test1 서블릿요청(GET)">
	</form>
</body>
</html>