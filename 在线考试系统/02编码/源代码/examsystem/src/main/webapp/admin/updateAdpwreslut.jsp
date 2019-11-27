<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <script src="/js/jquery.min.js"></script>
    <link rel="stylesheet" href="/css/skin/css/style.css" type="text/css" />
    <meta charset="UTF-8">
    <title>修改密码结果</title>
    <style>
        body {
            background-color: #1c77ac;
            background-image: url(/css/skin/images/light.png);
            background-repeat: no-repeat;
            background-position: center top;
            overflow: hidden;
        }
    </style>

</head>

<body>
<div id="mainBody">
    <div id="cloud1" class="cloud"></div>
    <div id="cloud2" class="cloud"></div>
</div>
<div class="logintop">
    <span>欢迎使用在线考试系统</span>
    <ul>
        <li>
            <a href="/pages/contact.jsp">联系我们</a>
        </li>
        <li>
            <a href="/pages/help.jsp">帮助</a>
        </li>
        <li>
            <a href="/pages/aboutus.jsp">关于在线考试系统</a>
        </li>
    </ul>
</div>
<div class="loginbody">
    <c:choose>
        <c:when test="${1==requestScope.rows}">
            <script>
                alert("修改成功，请重新登陆");
                window.location.href="AdminLogin.jsp"
            </script>
        </c:when>
        <c:otherwise>
            <script>
                alert("服务器返回未知异常,修改失败");
                window.location.href="/admin/adminmain.jsp"
            </script>
        </c:otherwise>
    </c:choose>
</div>

<div class="loginbm">版权所有&nbsp;&nbsp;&nbsp;&nbsp;java4班第二小组</div>
</body>
</html>

