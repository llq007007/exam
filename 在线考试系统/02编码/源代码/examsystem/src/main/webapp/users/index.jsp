<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户</title>
    <meta charset="UTF-8">
    <style>登录
        li{
            margin-top: 20px;
        }
    </style>
</head>
<body>
<form action="/user/login" method="post">
    <ul style="list-style: none">
        <li><h3>欢迎使用</h3></li>
        <li>用户名：<input type="text" name="username" required></li>
        <li>密码：<input type="text" name="password" required></li>
        <li>
            <input type="submit" value="登录">&nbsp;&nbsp;
            <input type="button" onclick="zhuce()" value="注册">
        </li>
    </ul>
</form>
<script>
    function zhuce() {
        window.location.href='/users/user-register.jsp';
    }
    真帅
//
//
//
</script>
</body>
</html>

