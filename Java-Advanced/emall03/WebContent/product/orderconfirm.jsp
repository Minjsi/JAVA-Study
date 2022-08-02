<%@page import="jdbc.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String uid = (String) session.getAttribute("id");
	if (uid == null) {
		response.sendRedirect("../user/login.jsp");
		return;
	} //세션 정보를 확인해서 로그인 상태인지 확인한후 진입 허용 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 컨펌</title>
</head>
<body>

</body>
</html>