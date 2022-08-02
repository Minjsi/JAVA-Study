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
<title>자유게시판</title>
<link rel="stylesheet" href="../main.css">
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
     
   
   <div class = "container bg-warning shadow mx-auto mt-5 p-5 w-75">

   
   <table class="table table-striped table-hover">
   
     <thead>
    <tr>
      <th scope="col">글번호</th>
      <th scope="col">작성자</th>
      <th scope="col">제목</th>
      <th scope="col">날짜</th>
    </tr>
  </thead>
  <tbody>
      		<%
			ArrayList<BoardDTO> boards = (new BoardDAO()).getList();
			
		   for (BoardDTO board : boards) {
		%>
    <tr>
    <th scope="row"><%=board.getBoard_num() %></th>
    
   <td><%=board.getUser_id() %></td>      
   <td><a href="boardcontent.jsp?board_num=<%=board.getBoard_num() %>" class=""><%=board.getBoard_title() %></a></td>      
   <td><%=board.getBoard_date() %></td>   
 
    </tr>

		<% } %>

  </tbody>
</table>
   
   

   </div>

   


	<%@ include file="/_footer.jsp"%>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>