<%--
  Created by IntelliJ IDEA.
  User: 13248
  Date: 2019/11/4
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>用户注册</title>
    <meta charset="UTF-8">
    <style>
    li{
        margin-top: 20px;
    }
    </style>
</head>
<body style="text-align: center">
<form action="/user/register" method="post" style="margin-top: 100px">
    <ul style="list-style: none">
        <li>用户注册</li>
        <li>用户名：<input type="text" name="username" required></li>
        <li>密码：<input type="password" name="password" required style="margin-left: 15px"></li>
        <li>
            <input type="submit" value="立即注册">&nbsp;&nbsp;
            <input type="button" onclick="denglu()" value="返回登录">
        </li>
    </ul>
</form>
<script>
    function denglu() {
        window.location.href='/users/index.jsp';
    }
</script>
</body>
</html>
