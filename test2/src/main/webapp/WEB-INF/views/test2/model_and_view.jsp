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
		<jsp:include page="../inc/top.jsp"></jsp:include>
	</header>
	<form action="test1" method="get">
		<input type="submit" value="test1 서블릿요청(GET)">
	</form>
	<H1>model_and_view.jsp</H1>
	<h2>PeraonVO 데이터</h2>
	<h3>이름 : ${map.person.name }</h3>
	<h3>나이 : ${map.person.age }</h3>
	<h2>TestVO 데이터</h2>
	<h3>이름 : ${map.testvo.subject }</h3>
	<h3>나이 : ${map.testvo.content }</h3>
</body>
</html>