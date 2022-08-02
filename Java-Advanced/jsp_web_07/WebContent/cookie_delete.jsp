<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie delete</title>
</head>
<body>
<b>cookie delete</b><br>
<%
Cookie[] cookies = request.getCookies();

if( cookies != null ) {
	for(int i = 0; i < cookies.length ; i++) {
		if(cookies[i].getName().equals("id")) {
			cookies[i].setMaxAge(0); // 쿠키 생존기간 0으로 설정
			response.addCookie(cookies[i]);
			out.print("cookie information delete complete");
		}
	}
} else {
	out.print("No cookie info");
}
%>
<p><a href="cookie_check.jsp">[Check Cookie]</a>
</body>
</html>