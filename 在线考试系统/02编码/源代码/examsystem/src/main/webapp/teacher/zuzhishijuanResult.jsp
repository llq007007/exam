<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: 13248
  Date: 2019/11/27
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>在线考试系统</title>
</head>
<body>
<c:choose>
    <c:when test="${1==requestScope.rows}">
        <script type="text/javascript">
            alert("组织试卷成功");
            window.location.href="/teacher/teachermain.jsp";
        </script>
    </c:when>
    <c:when test="${-1==requestScope.rows}">
        <script type="text/javascript">
            alert("组织试卷失败,服务器异常");
            window.location.href="/teacher/Zuzhishijuan.jsp";
        </script>
    </c:when>
    <c:otherwise>
        <script type="text/javascript">
            alert("组织试卷失败,服务器返回未知的状态");
            window.location.href="/teacher/Zuzhishijuan.jsp";
        </script>
    </c:otherwise>
</c:choose>
</body>
</html>
