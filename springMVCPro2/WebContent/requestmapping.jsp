<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/testrequestmapping1">请求方式1requestmapping</a><br>
<a href="${pageContext.request.contextPath}/testrequestmapping2">请求方式2requestmapping</a><br>
<a href="${pageContext.request.contextPath}/testparams?name=7czhong&age=21">请求方式3params</a><br>
<a href="${pageContext.request.contextPath}/testheaders">请求方式4headers</a><br>
<a href="${pageContext.request.contextPath}/testant/7czhong/pikachu/test">请求方式5ant</a><br>
<a href="${pageContext.request.contextPath}/rest/1">请求方式6rest</a><br>
<a href="${pageContext.request.contextPath}/testHeader">请求方式7Header</a><br>

<form action="${pageContext.request.contextPath}/testMethod" method="post">
	<input type="submit" value="测试Method">
</form>
<br>
<form action="${pageContext.request.contextPath}/testRestForm/100" method="post">
	<input type="hidden" name="_method" value="put">
	<input type="submit" value="测试RestForm">
</form>

</body>
</html>