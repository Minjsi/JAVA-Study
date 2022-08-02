<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "dbconnclose.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기</title>
</head>
<body>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%
	String id = request.getParameter("id");

Connection conn = null;
Statement stmt = null;
ResultSet rset = null;

conn = DbConnClose.getConnection();

String sql = "SELECT * FROM board WHERE board_id = ?";
stmt = conn.createStatement();
	stmt.setInt(1, id);
rset = stmt.executeQuery(sql);

String board_id = rset.getString("board_id");
String board_name = rset.getString("board_name");
String board_title = rset.getString("board_title");
String board_content = rset.getString("board_content");
String board_join_date = rset.getString("board_join_date");
%>

<table>
<caption>글 상세보기</caption>

<tr>
<th>&nbsp; 이름 &nbsp;</th>
<td><%=board_name %></td>
</tr>

<tr>
	<th>&nbsp; 제목 &nbsp;</th>
	<td><%=board_title %></td>
</tr>


<tr>
	<th>&nbsp; 내용&nbsp;</th>
	<td><%=board_content %></td>
</tr>

<tr>
	<th>&nbsp; 작성일&nbsp;</th>
	<td><%=board_join_date %></td>
</tr>

</table>


<%
DbConnClose.resourceClose(rset, stmt, conn);
%>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>