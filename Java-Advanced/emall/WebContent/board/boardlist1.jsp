<%@page import="jdbc.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style>
@import url('https://fonts.googleapis.com/css2?family=Black+And+White+Picture&family=Gowun+Batang&family=Nanum+Pen+Script&display=swap');

</style>
<meta charset="UTF-8">
<title>상품 목록</title>
<link rel="stylesheet" href="../main.css">
</head>
<body>
	<%!// 선언문
	String title = "상품 목록";%>
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

	<div class="container">
		<div class="row" align="center">
		
		<%
			ArrayList<BoardDTO> boards = (new BoardDAO()).getList();
			
		   for (BoardDTO board : boards) {
		%>
		
			<div class="col-md-4">
				<img src="" style="width: 100%">
					<h3><%=board.getBoard_title() %></h3>
					<p><%=board.getBoard_content() %>원
					<p><a href="boarddetail.jsp?pid=<%=board.getBoard_num() %>" class="btn btn-secondary" role="button">상세정보</a>
			</div>

		<% } %>

		</div>
		<hr>
	</div>








	<%@ include file="/_footer.jsp"%>


	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>