<%--
  Created by IntelliJ IDEA.
  User: 陈阵
  Date: 2023/8/5
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br><br>
<h2>登录</h2>
<form action="${pageContext.request.contextPath}/login">
    姓名:<input name="name"><br>
    密码:<input type="password" name="pwd"><br>
    <input type="submit" value="登录">
</form>
<br>
${msg}
</body>
</html>
