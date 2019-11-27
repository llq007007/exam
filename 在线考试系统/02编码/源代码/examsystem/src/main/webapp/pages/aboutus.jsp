<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <script src="/js/jquery.min.js"></script>
    <link rel="stylesheet" href="/css/skin/css/style.css" type="text/css" />
    <meta charset="UTF-8">
    <title>欢迎使用在线考试系统-关于我们</title>
    <style>
        body {
            background-color: #1c77ac;
            background-image: url(/css/skin/images/light.png);
            background-repeat: no-repeat;
            background-position: center top;
            overflow: hidden;
        }
        p{
            font-size: 20px;
        }
        #text1{
            text-align: left;
            white-space: normal;
            text-indent:40px;
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
                    <a href="#">关于在线考试系统</a>
                </li>
            </ul>
        </div>
        <div class="center-block" style="text-align: center;padding-top:160px ;padding-left: 100px;padding-right: 100px;">
                <h2 style="font-size:25px;color: #afc5d2;">关于在线考试系统</h2>
                <div style="height: 50px;"></div>
                <div id="text1">
                    <p>在线考试由青软实训Java4班第二小分队自主研发而成，仅支持在线网络考试。应用于学校，教育机构等发布考试场景。 </p>
                    <p>系统结构历经多天不断的反复检验与系统连续改进、创新，已集成强大的考试功能体系。包括自动判题，成绩统计分析，大批量数据导入导出等众多功能，高度的可配置性和灵活性使得它可以被应用于教育领域。
                        系统自从开发以来，已修复500+，已导入试题 1000+，客户满意度98.56%，性价比远超同行业其它软件。</p>
                    <p>考试系统特别说明：</p>
                    <p>使用在线考试系统过程中，出现任何问题， 请及时点右上角的联系我们进行反馈，对于有效反馈我们将送上精美礼物一份，欢迎各位用户积极参与！</p>
                </div>
                <div style="height: 50px;"></div>
                <button type="button" class="btn bg-default" onclick="history.back(-1);">返回</button>
        </div>
        <div class="loginbm">版权所有&nbsp;&nbsp;&nbsp;&nbsp;java4班第二小组</div>
</body>
</html>

