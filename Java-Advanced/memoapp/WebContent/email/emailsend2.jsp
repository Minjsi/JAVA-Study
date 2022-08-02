<%@page import="java.util.*"%>
<%@page import="com.sun.javafx.collections.MappingChange.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
// 넘겨받은 변수 자리

Map<String, String> emailInfo = new HashMap<String, String>();
emaiInfo.put("from", request.getParameter("from")); // 보내는 사람
emaiInfo.put("to", request.getParameter("to")); // 받는 사람
emaiInfo.put("subject", request.getParameter("subject")); // 제목

// 내용은 html text 형태에 따라 다르게 설정
String content = request.getParameter("content"); // 이메일 내용
String format = request.getParameter("format"); // 이메일 형태

if (format.equals("text")) {
	emailInfo.put("content", content);
	emailInfo.put("format", "text/plain;charset=UTF-8");
} else if (format.equals("html")) {
	content = content.replace("\r\n", "<br>");
}
%>