<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="person" class="study.Person" scope="request"/>
아이디 : <%=person.getId()%>
<br>
이 름 : <%=person.getName()%> 
<br>
<%
person.setId(201801166);
person.setName("김수연");

%>

<jsp:include page="javabeans4person.jsp"/>

</body>
</html>