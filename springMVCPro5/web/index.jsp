<%--
  Created by IntelliJ IDEA.
  User: xiaoxi
  Date: 2019/7/10
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
      <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
  </head>
  <body>
  <a href="${pageContext.request.contextPath}/download/025.jpg">下载皮卡丘图片</a>
  <hr>
  <form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"><br>
    <input type="submit" value="上传">
  </form>
  <hr>
  <a href="${pageContext.request.contextPath}/exception">测试exception</a>
  <hr>
  <a href="${pageContext.request.contextPath}/local">测试本地化/国际化</a>

  </body>
</html>
