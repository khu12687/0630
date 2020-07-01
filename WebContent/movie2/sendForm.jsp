<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
//서버측에 선택한 파라미터에 대한 결과 요청하기!!
//get: 얻어올때?변수=값, post: 전송
function send(){
	form1.action="/movie.do";
	form1.submit(); //전송!!
}
</script>
</head>
<body>
	<form name="form1" method="post">
		<select name="movie">
			<option value="para">기생충</option>
			<option value="starwars">스타워즈</option>
			<option value="007">007</option>
		</select>
	</form>
	<button onClick="send()">전송</button>
</body>
</html>