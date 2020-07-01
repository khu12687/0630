<%@page import="com.the.model.board.BoardDAO"%>
<%@page import="com.the.model.board.Board"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%! BoardDAO boardDAO =new BoardDAO(); %>
<%
	List<Board> boardList = boardDAO.selectAll();
%>
<%
	//페이징 처리에 필요한 변수 선언 및 페이지 분할 계산
	int currentPage=1;//현재 페이지
	//페이지가 전달되면.. 끄대만.. 던달된 숫자로 대체!!
	if(request.getParameter("currentPage")!=null){
		currentPage=Integer.parseInt(request.getParameter("currentPage"));
	}
	int totalRecord =boardList.size();//총 레코드수
	int pageSize=10; //페이지당 보여질 레코드 수
	int totalPage=(int)Math.ceil((float)totalRecord/pageSize);
	int blockSize=10; //블럭당 보여질 페이지 수
	int firstPage=currentPage-(currentPage-1)%blockSize; //블럭당 시작 페이지
	int lastPage=firstPage+(blockSize-1); //블럭당 마지막 페이지
	int curPos=(currentPage-1)*pageSize; //페이지당 시작 인덱스!!
	int num=totalRecord-curPos; //페이지당 시작 번호
%>
<%= "현재 페이지는 "+currentPage %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
table {
	border-collapse: collapse;
	border-spacing: 0;
	width: 100%;
	border: 1px solid #ddd;
	position: relative;
	left:0px;
}

th, td {
	text-align: left;
	padding: 16px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}
.pageStyle{
	font-size:15pt;
	font-weight:bold;
	color:blue;
}
a{text-decoration:none;}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(function(){
	$("button").click(function(){
		location.href="/board/registForm.jsp";
	});
});
</script>
</head>
<body>

	<h1>상담게시판</h1>
	<table>
		<tr>
			<th width="5%">no</th>
			<th width="50%">제목</th>
			<th width="10%">작성자</th>
			<th width="20%">등록일</th>
			<th width="10%">조회수</th>
		</tr>
		<%for(int i=1; i<=pageSize; i++){ %>
		<%if(num<1)break; %>
		<%Board board=boardList.get(curPos++); %>
		<tr>
			<td><%=num-- %></td>
			<td>
				<%if(board.getDepth()>0){ //답변일때만...%>
				<img style="margin-left:<%=20*board.getDepth()%>px" src="/images/reply.png" width="20px"/>
				<%} %>
				<a href="/board/content.jsp?board_id=<%=board.getBoard_id()%>"><%= board.getTitle() %></a>
			</td>
			<td><%= board.getWriter() %></td>
			<td><%= board.getRegdate().substring(0,10) %></td>
			<td><%= board.getHit() %></td>
		</tr>
		<%} %>
		<tr>
			<td colspan="5">
				<button>글등록</button>
			</td>
		</tr>
		<tr>
			<td colspan="5" style="text-align:center;">
				<%if(firstPage>1){ %>
				<a href="/board/list.jsp?currentPage=<%=firstPage-1%>">◀</a>
				<%} %>
				<%for(int i=firstPage; i<=lastPage; i++){ %>
				<%if(i>totalPage)break; %>
				<a <%if(i==currentPage){%>class="pageStyle"<%}%> href="/board/list.jsp?currentPage=<%=i %>">[<%=i %>]</a>
				<%} %>
				<%if(lastPage<totalPage){ %>
				<a href="/board/list.jsp?currentPage=<%=lastPage+1%>">▶</a>
				<%} %>
			</td>
		</tr>
	</table>

</body>
</html>
