<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../main.css">
<title>회원가입</title>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Black+And+White+Picture&family=Gowun+Batang&family=Nanum+Pen+Script&display=swap')
	;
</style>
<meta charset="UTF-8">
<link rel="stylesheet" href="main.css">
</head>
<body>
	<%!// 선언문
	String title = "회원가입";%>
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


	<div class="container" align="Center">
		<form action="useradddb.jsp" method="post">
*는 필수 입력 항목입니다.
			<table class="type03">
				<tr>
					<th scope="row">아이디*</th>
					<td><div class="col-sm-8">
							<input type="text" name="uid" class="form-control"><input
								type="reset" class="btn btn-secondary" value="중복확인">
						</div></td>
				</tr>
				<tr>
					<th scope="row">패스워드*</th>
					<td>내용이 들어갑니다.</td>
				</tr>
				<tr>
					<th scope="row">패스워드확인*</th>
					<td>내용이 들어갑니다.</td>
				</tr>
				<tr>
					<th scope="row">성별</th>
					<td>내용이 들어갑니다.</td>
				</tr>
				<tr>
					<th scope="row">생일</th>
					<td>내용이 들어갑니다.</td>
				</tr>
				<tr>
					<th scope="row">연락처*</th>
					<td>내용이 들어갑니다.</td>
				</tr>
				<tr>
					<th scope="row">주소*</th>
					<td>내용이 들어갑니다.</td>
				</tr>
				<tr>
					<th scope="row">등록일</th>
					<td>내용이 들어갑니다.</td>
				</tr>
			</table>

		</form>



		<%@ include file="/_footer.jsp"%>


		<!-- JavaScript Bundle with Popper -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
			crossorigin="anonymous"></script>
</body>
</html>