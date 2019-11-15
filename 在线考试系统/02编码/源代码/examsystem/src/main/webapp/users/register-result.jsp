<%--
  Created by IntelliJ IDEA.
  User: 13248
  Date: 2019/11/5
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>注册结果</title>
</head>
<body>
<c:choose>
    <c:when test="${rows==1}">
        <script>
            alert("注册成功");
            window.location.href="/index.jsp";
        </script>
    </c:when>
    <c:when test="${rows==-1}">
        <script>
            alert("注册失败");
            window.location.href="/users/user-register.jsp";
        </script>
    </c:when>
    <c:otherwise>
        <script>
            alert("服务器返回未知状态");
            window.location.href="/users/user-register.jsp";
        </script>
    </c:otherwise>
</c:choose>
</body>
</html>
