<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이메일 전송 폼</title>
</head>
<body>

<form action = "emailsend.jsp" method = "post">
보내는 사람 <input type ="text" name = "from"><br><br>
받는 사람 <input type ="text" name = "to"><br><br>
제목 <input type ="text" name = "subject"><br><br>
형식
<input type ="radio" name = "format" value = "text" checked>TEXT
<input type="radio" name="format" value="html" checked>HTML<br><br>
본문 <textarea name="content" cols="60" row="10"></textarea><br><br>
<br>
<button type="submit">전송</button>
</form>
</body>
</html>