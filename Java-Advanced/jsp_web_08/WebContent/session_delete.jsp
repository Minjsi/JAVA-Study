<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Delete</title>
</head>
<body>
<b>Session Property Delete</b><br><br>
Session ID : <%=session.getAttribute("id") %><br>
Session Name : <%=session.getAttribute("name") %><br><br>
<b>Session Property Delete Complete!</b><br><br>
<%
session.removeAttribute("id");
session.removeAttribute("name");
%>
Session ID : <%=session.getAttribute("id") %><br>
Session Name : <%=session.getAttribute("name") %><br>
<p><a href="session_check.jsp">[Session Check]</a>
</body>
</html>