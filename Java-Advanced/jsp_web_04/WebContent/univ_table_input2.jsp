<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<% request.setCharacterEncoding("utf-8");%>
<%
	// JDBC 드라이버 로딩
Class.forName("com.mysql.jdbc.Driver");
// DB연결
String url = "jdbc:mysql://localhost:3306/university";
String id = "root";
String pw = "yeasd3676!";

Connection conn = null; // 디비 연결 객체
PreparedStatement pstmt = null; // 디비에 전달할 SQL 구문객체

conn = DriverManager.getConnection(url, id, pw);


// 테이블에 데이터 넣기 SQL
String lab_addr = request.getParameter("lab_addr");
String name = request.getParameter("name");
String dept = request.getParameter("dept");
String email = request.getParameter("email");
String website = request.getParameter("website");

String sql = "INSERT INTO professor VALUES(?,?,?,?,?)"; // 넣는 데이터 종류 수만큼 물음표 삽입
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, lab_addr);
pstmt.setString(2, name);
pstmt.setString(3, dept);
pstmt.setString(4, email);
pstmt.setString(5, website);
pstmt.executeUpdate();



// DB 연결 종료
if (pstmt != null)
	pstmt.close();
if (conn != null)
	conn.close();

out.print("DB 데이터 삽입 성공 by 06김수연");

response.sendRedirect("univ_table_input2.html");
%>