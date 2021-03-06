<%@page import="com.the.model.movie.MovieService"%>
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
	
	//로직은 여기서 짜지말고, 공통코드로 분리시켜놓은 객체를 재사용
	MovieService movieService = new MovieService();
	String msg = movieService.getAdivce(movie);
	
	/*
	재사용가능한 코드를 객체로 분리시켜, 유지보수성을 높인 개발방식을
	javaEE분야에서는 model1 방식이라 한다!!
	
	장점) 코드의 재사용성이 높아짐
	단점) View인 디자인 코드에 디지인 외의 자바코드가 남아 있다..
			이 경우, 디자인을 버린다면?
					
	최종목표인 MVC인데, 현재의 모델1아식에서는 디자인 페이지와 컨트롤러 역할의 코드가 합쳐져 있는 상태.. 
	Model : 로직, 데이터
	View : 디자인 
	Controller : 디자인과 로직을 분리시켜주는 역할의 객체
	*/
	
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