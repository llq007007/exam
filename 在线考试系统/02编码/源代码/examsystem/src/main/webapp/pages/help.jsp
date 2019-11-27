<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <script src="/js/jquery.min.js"></script>
    <link rel="stylesheet" href="/css/skin/css/style.css" type="text/css" />
    <meta charset="UTF-8">
    <title>欢迎使用在线考试系统-帮助</title>
    <style>
        body {
            background-color: #1c77ac;
            background-image: url(/css/skin/images/light.png);
            background-repeat: no-repeat;
            background-position: center top;
            overflow: hidden;
        }
        p{
            font-size: 15px;
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
                    <a href="contact.jsp">联系我们</a>
                </li>
                <li>
                    <a href="help.jsp">帮助</a>
                </li>
                <li>
                    <a href="aboutus.jsp">关于在线考试系统</a>
                </li>
            </ul>
        </div>
        <div class="center-block" style="text-align: center;padding-top:160px ;">
                <h2 style="font-size:25px;color: #afc5d2;">帮助文档</h2>
                <div style="height: 50px;"></div>
            <div class="md-content">
                <p>欢迎您使用在线考试系统帮助文档</p>
                <p>如果您使用在线考试系统过程中，对某一部分有疑问， 请点右上角的联系我们， 有专业客服24小时在线服务，为您答疑解惑！</p>
                <p>我们竭诚为您服务!</p>
                <a><img  src="${pageContext.request.contextPath}https://www.youkaoshi.cn/help/assets/images/smile.jpg" alt="微笑服务" /></a>
            </div>
        </div>
        <div ><button type="button" class="btn bg-default" onclick="history.back(-1);">返回</button></div>

        <div class="loginbm">版权所有&nbsp;&nbsp;&nbsp;&nbsp;java4班第二小组</div>
</body>
</html>

