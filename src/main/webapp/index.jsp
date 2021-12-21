<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("msg")!=null){
%>
<font color="red">
<%=session.getAttribute("msg") %>
</font>
<%} %>
<form action="check" method="post">
姓名<input type="text" name="user"><br>
<input type="submit" value="登录">
</form>
</body>
</html>