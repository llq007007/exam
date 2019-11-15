<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <meta charset="UTF-8">
    <style>
        li{
            margin-top: 20px;
        }
    </style>
</head>
<body style="text-align: center;">
<div style="margin-top: 100px">
    <form action="/user/login" method="post">
        <ul style="list-style: none">
            <li><h3>请登录使用论坛</h3></li>
            <li>用户名：<input type="text" name="username" required></li>
            <li>密码：<input type="text" name="password" required style="margin-left: 15px"></li>
            <li>
                <input type="submit" value="登录">&nbsp;&nbsp;
                <input type="button" onclick="zhuce()" value="注册">
            </li>
        </ul>
    </form>
</div>

<script>
    function zhuce() {
        window.location.href='/users/user-register.jsp';
    }
</script>
</body>
</html>

