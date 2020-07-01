<%@ page contentType="text/html; charset=UTF-8"%>
<%
	/*
	이와같이 로직 및 디자인이 모두 jsp에 포함된 개발방식을 가리켜
	스크립트 위주의 개발방식(막개발)이라 한다!!
	장점) 개발이 빠르다!!
	단점) 로직의 재사용이 불가능하다!!
			디자인코드와 로직이 섞여 있기 때문에...
			ex) 같은 프로그램을 스윙으로 만든다면?
	*/
	request.setCharacterEncoding("utf-8");
	String movie = request.getParameter("movie");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
</script>
</head>
<body>
<%=msg %>
</body>
</html>