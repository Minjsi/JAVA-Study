<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jdbc.*" %>
<%
request.setCharacterEncoding("utf-8");

String memo = request.getParameter("memo"); // 전 페이지에서 입력한 메모 내용 받기
String uid = "test"; // 임시 작성자 test 설정해서 

MemoDAO dao = new MemoDAO(); // 객체 생성 ?? 메서드 호출하기 위해

dao.insert(memo, uid); // 메모삽입 메서드 호출

response.sendRedirect("main.jsp"); // 메모 db에 삽입 후에 다시 main 으로 돌아가 메모 목록 보기

%>