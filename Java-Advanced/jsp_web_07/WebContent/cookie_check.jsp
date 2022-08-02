<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie check</title>
</head>
<body>
<b>Cookie Check</b><br>
<%
Cookie[] cookies = request.getCookies();

if(cookies != null) {
	for (int i = 0; i < cookies.length; i++) {
		String name = cookies[i].getName();
		String value = cookies[i].getValue();
		
		out.print("Cookie Name : " + name + "<br>");
		out.print("Cookie Value : " + value + "<p>");
	}
}




%>

<p><a href="cookie_create.jsp">[Create Cookie]</a>
<p><a href="cookie_edit.jsp">[Edit Cookie]</a>
<p><a href="cookie_delete.jsp">[Delete Cookie]</a>
</body>
</html>