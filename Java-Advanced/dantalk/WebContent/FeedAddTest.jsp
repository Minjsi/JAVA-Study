<%@page import="jdbc.FeedDAO"%>
<%@page import="util.FileUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="jdbc.*"%>  
<%@ page import = "java.util.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "org.apache.commons.fileupload.*" %>
<%@ page import = "org.apache.commons.fileupload.disk.*" %>
<%@ page import = "org.apache.commons.fileupload.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FeedAddTest</title>
</head>
<body>
<%
// 추출한 변수 값 초기화
String uid = null;
String ucon = null;
String ufname = null;
byte[] ufile = null; // 조각조각낸다. 

request.setCharacterEncoding("utf-8");

ServletFileUpload sfu = new ServletFileUpload(new DiskFileItemFactory());
List items = sfu.parseRequest(request);
Iterator iter = items.iterator();

while(iter.hasNext()){
	FileItem item = (FileItem) iter.next();
	String name = item.getFieldName();
	if(item.isFormField()){
		// 텍스트 추출
		String value = item.getString("utf-8");
		if(name.equals("uid")) uid = value;
		else if (name.equals("ucon")) ucon = value;
	}else {
		// 사진 추출
		if (name.equals("uimage")) {
			ufname = item.getName();
			ufile = item.get();
			
			String root = application.getRealPath(java.io.File.separator);
			FileUtil.saveImage(root, ufname, ufile);
		}
	}
}
FeedDAO dao = new FeedDAO();
if (dao.insert(uid, ucon, ufname)) {
   response.sendRedirect("main.jsp");
}
%>

<hr>
</body>
</html>