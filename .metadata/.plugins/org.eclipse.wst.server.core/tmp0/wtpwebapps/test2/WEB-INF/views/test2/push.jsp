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
	<article>
		<h1>test2/push.jsp</h1>
		<p>request.setAttribute로 저장된 속성값<br> : ${msg}</p>
		<p>TestVo에 저장한 속성값<br> subject : ${test.subject} <br> content : ${test.content }</p>
	</article>
	<footer>
	
	</footer>
	
</body>
</html>