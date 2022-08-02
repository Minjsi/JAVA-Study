<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Property Check</title>
</head>
<body>
<b>Session Property Check</b><br><br>
Session ID : <%=session.getAttribute("id") %><br>
Session Name : <%=session.getAttribute("name") %><br>

<p><a href="session_create.jsp">[Session Create]</a><br>
<p><a href="session_delete.jsp">[Session Delete]</a>
</body>
</html>