<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String gender = request.getParameter("gender");
String email = request.getParameter("email");
String birthday = request.getParameter("birthday");
String nickname = request.getParameter("nickname");
%>
성별 : <%=gender%><br>
이메일 : <%=email %><br>
생일 : <%=birthday %><br>
닉넴 : <%=nickname%><br>
</body>
</html>