<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>action tag</title>
</head>
<body>
<b>forward multiple parameter</b>
<%
String msg="forward multiple parameter";
request.setCharacterEncoding("UTF-8");

%>
<jsp:forward page="inc_act_simple.jsp">
	<jsp:param name="para1" value="p1 값" />
	<jsp:param name="para2" value="p2 값" />
	<jsp:param name="para3" value="파라미터 3 값" />
</jsp:forward>

<p>forward multiple parameter</p>
message print : <%=msg %>
</body>
</html>