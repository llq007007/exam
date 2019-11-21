<%--
  Created by IntelliJ IDEA.
  User: 老李头
  Date: 2019/11/21
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加成绩</title>
    <script  src="/js/jquery.min.js"></script>
</head>
<body>
<form action="/teacher/insert_score" method="post">
    <ul style="list-style: none">
        <li><h3>添加成绩</h3></li>
        <li>员工编号:<input type="text" name="empNo" required></li>
        <li>员工姓名:<input type="text" name="empName" required></li>
        <li>
            <c:if test="${ not empty requestScope.depList}">
                <input type="submit" value="添加成绩">&nbsp;&nbsp;
                <input type="reset" value="重新填写">
            </c:if>
        </li>
    </ul>

</form>


</body>
</html>
