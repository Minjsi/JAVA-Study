<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Check</title>
</head>
<body>
<%
// 임시 고객정보 db
String user_id = "root";
String user_pw = "admin";
String user_name = "06김수연";

// 입력한 값을 받음
String cust_id = request.getParameter("cust_id");
String cust_pw = request.getParameter("cust_pw");
String cust_name = request.getParameter("cust_name");

// 디비에 있는 비번과 입력한 비번을 비교하여 로그인 승인
if(cust_id.equals(user_id) && cust_pw.equals(user_pw)) {
	session.setMaxInactiveInterval(600); // 10분
	session.setAttribute("cust_id", user_id);
	session.setAttribute("cust_pw", user_pw);
	
	out.print("<br>" + session.getAttribute("cust_id") +"("
			+ user_name + ")님 방문을 환영합니다.! </b><p>");
} else {
	out.print("로그인 후에 이용 가능합니다.<p>");
	// response.sendRedirect("login)forn.jsp");
}
%>
<a href="login_form.jsp">[로그인 하러 가기]</a><br>
<a href="logout.jsp">[로그아웃]</a>
</body>
</html>