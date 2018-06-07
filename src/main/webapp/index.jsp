<%--
  Created by IntelliJ IDEA.
  User: betterman
  Date: 2018/6/7
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="/login" method="post">
    账号:<input type="text" name="username">
    密码:<input type="password" name="password">
    <input type="submit" value="登录">
    <input type="submit" value="注册">
</form>
</body>
</html>
