<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include action tag</title>
</head>
<body>
<b>include multiple parameter</b><br>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:include page="inc_act_multiple.jsp">
	<jsp:param name="para1" value="p1 값1" />
	<jsp:param name="para1" value="p1 값2" />
	<jsp:param name="para1" value="p1 값3" />
	<jsp:param name="para2" value="p2 값" />
	<jsp:param name="para3" value="파라미터값" />
</jsp:include>
</body>
</html>