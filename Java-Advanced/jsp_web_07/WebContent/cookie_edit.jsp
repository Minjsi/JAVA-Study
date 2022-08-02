<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie edit</title>
</head>
<body>
<b>cookie edit</b><br>
<%
Cookie cookie = new Cookie("id", "후훗..");
cookie.setMaxAge(300); // 초 단위 5분
response.addCookie(cookie);

out.print("cookie edit complete<br>");
%>
<br>
Cookie Name : <%=cookie.getName() %><br>
Cookie Value : <%=cookie.getValue() %><br>
Cookie Validity time : <%=cookie.getMaxAge() %>초<br>

<p><a href="cookie_check.jsp">[check cookie]</a>
</body>
</html>