<%--
  Created by IntelliJ IDEA.
  User: xiaoxi
  Date: 2019/7/4
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"/>
  </head>
  <body>
    <img src="${pageContext.request.contextPath}/img/025.jpg"/><br/>
    <a href="${pageContext.request.contextPath}/testView">测试View</a>
    <hr/>
    <a href="${pageContext.request.contextPath}/testUpdate/18">测试update更新</a>
    <hr/>
    <input type="button" value="请求JSON数据" id="btn" />

    <script>
      $(function () {
        $('#btn').click(function () {
          alert('btn');
        });
      });
    </script>

  </body>
</html>
