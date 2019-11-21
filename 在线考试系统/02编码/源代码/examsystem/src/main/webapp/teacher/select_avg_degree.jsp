<%--
  Created by IntelliJ IDEA.
  User: 老李头
  Date: 2019/11/21
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询低于平均成绩的成绩单</title>
</head>
<body>
<form action="/teacher/select_avg" method="post">
    <ul style="list-style: none">
        <li><h3>低于平均成绩的成绩单</h3></li>
        <li>试卷名称:<input type="text" name="sjname" required></li>
        <li>
            <input type="submit" value="查询">&nbsp;&nbsp;
            <input type="reset" value="重新填写">
        </li>
    </ul>
</form>
</body>
</html>
