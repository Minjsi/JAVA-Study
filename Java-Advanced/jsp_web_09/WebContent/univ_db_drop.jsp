<%@page import="com.mysql.cj.x.protobuf.MysqlxPrepare.Execute"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터베이스 생성</title>
</head>
<body>
<%
	// 드라이버 로드
	   try{
	   Class.forName("com.mysql.jdbc.Driver");
	   out.println("JDBC Driver loading 성공!! <br>");
	   
	   } catch (ClassNotFoundException err){
	      out.print("JDBC Driver loading 실패!! <br>");
	   }
	//드라이버로 DB연결
	String url = "jdbc:mysql://localhost:3306/";
	String id = "root";
	String pw = "yeasd3676!";
	
	Connection conn = null; // 연결 객체
	PreparedStatement pstmt = null; // 구문 객체

	try{
	   conn = DriverManager.getConnection(url, id, pw);
	   out.print("SQL DB 연결 성공  by 06 김수연<br>");
	   
	   // 작업 영역
	   // 1. db 생성
	   String sql = "DROP DATABASE university"; // DB 생성 sql 구문
	   
	   pstmt = conn.prepareStatement(sql); // 구문을 객체에 넣어서
	   
	   pstmt.executeUpdate(); // 구문 객체 실행
	   
	   out.print("university DB 삭제 성공!!<br>");
	   
	} catch (SQLException sqlerr){
	   out.print("university DB 삭제 성공!!<br>");
	   
	}finally {
		   // DB 연결 종료
		   if (conn != null){
			   try{
				   conn.close();
				   out.print("SQL 서버 연결 종료<bt>");
			   }catch (Exception conerr){
				   conerr.printStackTrace();
			   }
		   }
}


%>
</body>
</html>