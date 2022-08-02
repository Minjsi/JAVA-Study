<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style>
@import url('https://fonts.googleapis.com/css2?family=Black+And+White+Picture&family=Gowun+Batang&family=Nanum+Pen+Script&display=swap');

</style>
<link rel="stylesheet" href="../main.css">
<meta charset="UTF-8">
<title>상세정보</title>
</head>
<body>
	<%!// 선언문
	String title = "자유 게시판";%>
	<!-- CSS only -->
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
		crossorigin="anonymous">

	<%@ include file="/_header.jsp"%>
	<div class="alert alert-secondary" role="alert">
		<div class="container">
			<h1 class="display-3">
				<%=title%>
			</h1>
		</div>
	</div>
	
	<%
	String board_num = request.getParameter("board_num");
	
	BoardDTO board = (new BoardDAO()).getDetail(board_num);
	%>
	
	<div class="container">
		<div class="row">
			<div class="col-ma-5">
				<img src="" style="width:100%" >
			</div>
		<div class="col-ma-6">
			<h3><%=board.getBoard_title() %></h3>
			<p><%=board.getBoard_content() %>
			<p><b>아이디 : <%=board.getUser_id() %></b>
			<p><b>날짜 : <%=board.getBoard_date() %></b>
			<a href="boardlist.jsp" class="btn btn-secondary" role="button">글목록</a>
		</div>
		</div>
	</div>
	
	




	<%@ include file="/_footer.jsp"%>


	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>