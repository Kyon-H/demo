<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=session.getAttribute("user") %>登录成功.
<%
if(application.getAttribute("num")!=null){
%>
第<%=application.getAttribute("num") %>位访客
<%} %>
<br>
<a href="exit">退出登录</a>
</body>
</html>