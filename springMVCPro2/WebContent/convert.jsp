<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/convert" method="post">
	年龄:<input type="text" name="age"><br>
	生日:<input type="text" name="date"><br>
	姓名:<input type="text" name="name"><br>
	<input type="submit" value="提交">
</form>

</body>
</html>