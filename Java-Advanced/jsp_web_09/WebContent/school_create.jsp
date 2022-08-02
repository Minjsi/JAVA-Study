<%@page import="com.mysql.cj.x.protobuf.MysqlxPrepare.Execute"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%
	// 드라이버 로드
	   Class.forName("com.mysql.jdbc.Driver");

	//드라이버로 DB연결
	String url = "jdbc:mysql://localhost:3306/";
	String id = "root";
	String pw = "yeasd3676!";
	
	Connection conn = null; // 연결 객체
	PreparedStatement pstmt = null; // 구문 객체


	   conn = DriverManager.getConnection(url, id, pw);
	   
	   // 작업 영역
	   // 1. db 생성
	   String sql = "CREATE DATABASE school"; // DB 생성 sql 구문
	   
	   pstmt = conn.prepareStatement(sql); // 구문을 객체에 넣어서
	   
	   pstmt.executeUpdate(); // 구문 객체 실행
	   
	   

		   // DB 연결 종료
		   if (conn != null){

				   conn.close();
			   }


%>