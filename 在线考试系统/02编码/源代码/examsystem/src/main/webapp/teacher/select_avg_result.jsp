<%--
  Created by IntelliJ IDEA.
  User: 老李头
  Date: 2019/11/21
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>
<div>
    <table width="600" border="1" cellspacing="0">
        <tr>
            <th>专业</th>
            <th>姓名</th>
            <th>试卷名</th>
            <th>成绩</th>
            <th>平均成绩</th>
        </tr>
        <c:choose>
            <c:when test="${ empty requestScope.avgMapList}">
                <tr>
                    <td colspan="7" align="center"><span style="color: #0000FF">未查询到数据</span></td>
                </tr>
            </c:when>
            <c:otherwise>
                <c:forEach items="${requestScope.avgMapList}" var="map">
                    <tr>
                        <td>${map.zyname}</td>
                        <td>${map.sname}</td>
                        <td>${map.sjname}</td>
                        <td>${map.score}</td>
                        <td>${map.avgScore}</td>
                    </tr>
                </c:forEach>
            </c:otherwise>
        </c:choose>
    </table>
    共查询到:<span style="color: #1f33ff">${fn:length(requestScope.avgMapList)}</span>条记录
</div>
</body>
</html>
