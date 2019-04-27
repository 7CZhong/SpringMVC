<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/first?id=1&name=itlike">发送请求</a>
	
	<hr>
	<a href="${pageContext.request.contextPath}/second?id=1&name=itlike">发送请求2</a>
	
	<hr>
	<form action="${pageContext.request.contextPath}/myform">
		user:<input type="text" name="user_name"><br>
		age:<input type="text" name="user_age"><br>
		<input type="submit" value="提交">
	</form>
	
	<hr>
	<form action="${pageContext.request.contextPath}/myform2">
		user:<input type="text" name="user_name"><br>
		age:<input type="text" name="user_age"><br>
		hobby:<input type="checkbox" name="hobby" value="basketball">basketball
		<input type="checkbox" name="hobby" value="football">football
		<input type="checkbox" name="hobby" value="baseball">baseball
		<br>
		-----Pet-----
		<br>
		name:<input type="text" name="pet.name"><br>
		color:<input type="text" name="pet.color"><br>
		<input type="submit" value="提交">
	</form>
	
</body>
</html>