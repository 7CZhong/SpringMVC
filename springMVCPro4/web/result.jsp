<%--
  Created by IntelliJ IDEA.
  User: xiaoxi
  Date: 2019/7/4
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Result</h1><hr/>
    <fm:form modelAttribute="user" action="${pageContext.request.contextPath}/testUpdate2">
        姓名：<fm:input path="name"/><fm:errors path="name" cssStyle="color: red"/><br>
        年龄：<fm:input path="age" /><fm:errors path="age" cssStyle="color: red"/><br>
        性别：<fm:radiobutton path="gender" value="1" label="男"/>
        <fm:radiobutton path="gender" value="0" label="女"/><br>
        爱好：<fm:checkboxes path="hobby" items="${allhobbys}"/><br>
        宠物：<fm:select path="pet.id" items="${petList}" itemValue="id" itemLabel="name"/>
        <input type="submit" value="提交"><br>
    </fm:form>
</body>
</html>
