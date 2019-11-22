<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <script src="/js/jquery.min.js"></script>
    <link rel="stylesheet" href="/css/skin/css/style.css" type="text/css" />
    <meta charset="UTF-8">
    <title>欢迎使用在线考试系统-系统登录</title>
    <style>
        body {
            background-color: #1c77ac;
            background-image: url(/css/skin/images/light.png);
            background-repeat: no-repeat;
            background-position: center top;
            overflow: hidden;
        }
                              button {
                                  width: 160px!important;
                                  height: 120px!important;
                                  font-size:28px!important ;
                                  padding-left:0px!important ;
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
            <a href="#">联系我们</a>
        </li>
        <li>
            <a href="#">帮助</a>
        </li>
        <li>
            <a href="#">关于在线考试系统</a>
        </li>
    </ul>
</div>
<div class="center-block" style="text-align: center;padding-top:160px ;">
    <button type="button"  style="height: 50px" onclick="window.location.href='/student/studentLogin.jsp'">学生登录</button>
    <button type="button"  onclick="window.location.href='/teacher/teacherLogin.jsp'">教师登录</button>
    <button type="button"  onclick="window.location.href='admin/AdminLogin.jsp'">管理员登录</button>
</div>
<div class="loginbm">版权所有&nbsp;&nbsp;&nbsp;&nbsp;java4班第二小组</div>
</body>
</html>

