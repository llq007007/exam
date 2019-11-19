<%--
  Created by IntelliJ IDEA.
  User: 13248
  Date: 2019/11/19
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>修改结果</title>
</head>
<body>
<c:choose>
    <c:when test="${requestScope.rows==1}">
        <script>
            alert("修改成功");
            window.location.href="/teacher/queryQuestion.jsp";
        </script>
    </c:when>
    <c:when test="${requestScope.rows==-1}">
        <script>
            alert("修改失败");
            window.location.href="/teacher/queryQuestion.jsp";
        </script>
    </c:when>
    <c:otherwise>
        <script>
            alert("服务器异常");
            window.location.href="/teacher/queryQuestion.jsp";
        </script>
    </c:otherwise>
</c:choose>
</body>
</html>
