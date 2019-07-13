<%--
  Created by IntelliJ IDEA.
  User: xiaoxi
  Date: 2019/7/11
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
    <title>local</title>
</head>
<body>
    <h1>local</h1>
    <a href="?language=zh_CN"><fmt:message key="language.cn"/></a>
    <a href="?language=en_US"><fmt:message key="language.en"/></a>

    <hr>

    <fmt:message key="name"/>
    <fmt:message key="welcome"/>
</body>
</html>
