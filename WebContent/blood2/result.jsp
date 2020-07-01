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
	
	
	javaEE 분야에서 MVC패턴을 적용한 개발방법을 가리켜 모델 2방식이라 한다!!
	MVC 패턴이란?
		-재사용성과 유지보수성을 높이기 위해
		 디자인과 로직을 완전히 분리키시는 개발 방법
		 전산분야에서 잘 알려진 개발방법(선배들의 경험이 녹아든 패턴)
		 
	Model2 패턴?
		-MVC 개발방법 이론을 자바EE의 기술로 반영한 개발패턴을 의미
		
	Model : .pojo(Plain Old Java Object:플랫폼에 중립적인 순수한 자바)
	View : .jsp
	Controller : .java(서블릿) 
	*/
	request.setCharacterEncoding("utf-8");
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
<%=request.getAttribute("msg") %>
</body>
</html>