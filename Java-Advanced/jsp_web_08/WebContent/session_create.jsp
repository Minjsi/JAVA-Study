<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Create</title>
</head>
<body>
<b>Session Property Create</b><br><br>
<%
session.setAttribute("id", "admin");
session.setAttribute("name", "06SooyeonKim");
out.print("Session Property Set Complete! <br>");

%>
<br>
Session ID : <%=session.getAttribute("id") %><br>
Session Name : <%=session.getAttribute("name") %><br>

<p><a href="session_check.jsp">[Session Check]</a>
</body>
</html>