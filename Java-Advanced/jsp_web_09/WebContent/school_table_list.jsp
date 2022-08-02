<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<% request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 목록 출력</title>
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- On tables -->
<table class="table-primary">...</table>
<table class="table-secondary">...</table>
<table class="table-success">...</table>
<table class="table-danger">...</table>
<table class="table-warning">...</table>
<table class="table-info">...</table>
<table class="table-light">...</table>
<table class="table-dark">...</table>

<!-- On rows -->
<tr class="table-primary">...</tr>
<tr class="table-secondary">...</tr>
<tr class="table-success">...</tr>
<tr class="table-danger">...</tr>
<tr class="table-warning">...</tr>
<tr class="table-info">...</tr>
<tr class="table-light">...</tr>
<tr class="table-dark">...</tr>

<!-- On cells (`td` or `th`) -->
<tr>
  <td class="table-primary"><%=sabun %></td>
  <td class="table-secondary"><%=name %></td>
  <td class="table-success"><%=part %></td>
  <td class="table-danger">...</td>
  <td class="table-warning">...</td>
  <td class="table-info">...</td>
  <td class="table-light">...</td>
  <td class="table-dark">...</td>
</tr>
<%	// JDBC 드라이버 로딩
Class.forName("com.mysql.jdbc.Driver");
// DB연결
String url = "jdbc:mysql://localhost:3306/school";
String id = "root";
String pw = "yeasd3676!";

Connection conn = null; // 디비 연결 객체
PreparedStatement pstmt = null; // 디비에 전달할 SQL 구문객체
ResultSet rset = null; // DB에서 꺼내올 데이터들을 담을 객체

conn = DriverManager.getConnection(url, id, pw);

// 테이블에 데이터 넣기 SQL

String sql = "SELECT * FROM emp"; // 테이블에서 데이터 가져오기
pstmt = conn.prepareStatement(sql);

rset = pstmt.executeQuery();

// 받아온 결과 출력 - html과 연결
%>
<form>
<table>
<caption>직원 목록</caption>
<tr>
<th>사번</th>
<th>이름</th>
<th>부서</th>
</tr>
<% 

while(rset.next()){
	String sabun = rset.getString("sabun");
	String name = rset.getString("name");
	String part = rset.getString("part");
%>
<tr>
	<td><%=sabun %></td> 
	<td><%=name %></td>
	<td><%=part %></td>
<%
}
%>

</table>
</form>

<%



// DB 연결 종료
if (pstmt != null)
	pstmt.close();
if (conn != null)
	conn.close();


%>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>