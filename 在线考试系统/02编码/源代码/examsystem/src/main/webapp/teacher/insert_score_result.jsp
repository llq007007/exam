<%--
  Created by IntelliJ IDEA.
  User: 老李头
  Date: 2019/11/21
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加成绩结果</title>
</head>
<body>
<c:choose>
    <c:when test="${1==param.rows}">
        <span style="color:rgb(0,0,255)">添加成功</span>
    </c:when>
    <c:when test="${-1==param.rows}">
        <span style="color:rgb(255,0,0)">添加失败,服务器异常</span>
    </c:when>
    <c:otherwise>
        <span style="color:rgb(219,99,48)">添加成绩,服务器返回未知的状态</span>
    </c:otherwise>
</c:choose>
<a href="/teacher/add_emp.jsp">继续添加</a>
</body>
</html>
