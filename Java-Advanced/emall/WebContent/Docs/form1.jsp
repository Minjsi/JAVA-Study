<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<form action="form1db.jsp">  
   취 미 : 독서<input type="checkbox" name="hobby" value = "독서" checked>
               운동<input type="checkbox" name="hobby" value = "운동" >
               영화<input type="checkbox" name="hobby" value = "영화" >          
 <br>
<!--  <textarea cols="상자 너비" rows="상자 높이"></textarea>   -->            
               
<textarea cols="30" rows="3"></textarea>            
               
 <input type="submit" value="전송">
 <input type="reset" value="취소">              
               
 </form>
</html>