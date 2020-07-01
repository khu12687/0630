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
	form1.action="/blood.do";
	form1.submit(); //전송!!
}
</script>
</head>
<body>
	<form name="form1" method="post">
		<select name="blood">
			<option value="A">A형</option>
			<option value="B">B형</option>
			<option value="O">O형</option>
			<option value="AB">AB형</option>
		</select>
	</form>
	<button onClick="send()">전송</button>
</body>
</html>