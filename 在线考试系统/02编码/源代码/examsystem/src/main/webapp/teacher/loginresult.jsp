<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13248
  Date: 2019/11/21
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆结果</title>
</head>
<body>
<c:choose>
    <c:when test="${requestScope.exp=='exp'}">
        <script>
            alert("密码或用户名不正确");
            window.location.href="/teacher/teacherLogin.jsp";
        </script>
    </c:when>
    <c:otherwise>
        <script>
            alert("服务器异常");
            window.location.href="/teacher/teacherLogin.jsp";
        </script>
    </c:otherwise>
</c:choose>
</body>
</html>
