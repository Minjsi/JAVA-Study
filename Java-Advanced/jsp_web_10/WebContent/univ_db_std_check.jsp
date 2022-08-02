<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록 체크</title>
<link rel="stylesheet" href="font.css">
</head>
<body>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%@ include file="univ_menu.jsp" %>
<div class="alert" role="alert" style="background-color: #FFDEAD;">
<p class ="text-centerq" >로그인 성공 </p>
</div>
<% 
// 객체 3 개
Connection conn = null; // 연결 객체
PreparedStatement pstmt = null; // 구문 객체
ResultSet rset = null; // 결과 객체

// JDBC 드라이버 로딩
Class.forName("com.mysql.jdbc.Driver");

// DB 연결
	String url = "jdbc:mysql://localhost:3306/university";
	String id = "root";
	String pw = "yeasd3676!";
	
	conn = DriverManager.getConnection(url, id, pw);
	
// DB 검색

	String hakbun = request.getParameter("hakbun");
	String sql = "SELECT * from student where hakbun = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, hakbun);
	rset = pstmt.executeQuery();
	
// 질의 결과 확인
	if (!rset.isBeforeFirst()) {
		/*response.sendRedirect("univ_db_std_form.jsp");*/
	out.print("<script>alert('존재하지 않는 학생 입니다 .<br> 다시 입력 하세요.');"
		+ "history.back();"
		+ "</script>");
	}
	else{
	out.print("학생 정보 검색 성공<br>");
	
	rset.next(); // 다음, 즉 첫 번째로 이동
	
	String db_hakbun = rset.getString("hakbun");
	String db_name = rset.getString("name");
	
	if (hakbun.equals(db_hakbun)) {
		session.setAttribute("hakbun", db_hakbun);
		session.setAttribute("name", db_name);
		
		out.print(session.getAttribute("hakbun") + "(" + session.getAttribute("name") + ") 님 방문을 환영합니다.<br>");
	}
	}
%>


<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>