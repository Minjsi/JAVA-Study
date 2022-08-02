<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<% request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 목록 출력</title>
</head>
<body>
<%	// JDBC 드라이버 로딩
Class.forName("com.mysql.jdbc.Driver");
// DB연결
String url = "jdbc:mysql://localhost:3306/university";
String id = "root";
String pw = "yeasd3676!";

Connection conn = null; // 디비 연결 객체
PreparedStatement pstmt = null; // 디비에 전달할 SQL 구문객체
ResultSet rset = null; // DB에서 꺼내올 데이터들을 담을 객체

conn = DriverManager.getConnection(url, id, pw);

// 테이블에 데이터 넣기 SQL

String sql = "SELECT * FROM student"; // 테이블에서 데이터 가져오기
pstmt = conn.prepareStatement(sql);

rset = pstmt.executeQuery();

// 받아온 결과 출력 - html과 연결
%>
<form>
<table>
<caption>학생 목록</caption>
<tr>
<th>학번</th>
<th>이름</th>
<th>전공</th>
</tr>
<% 

while(rset.next()){
	String hakbun = rset.getString("hakbun");
	String name = rset.getString("name");
	String dept = rset.getString("dept");
%>
<tr>
	<td><%=hakbun %></td>
	<td><%=name %></td>
	<td><%=dept %></td>
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
</body>
</html>