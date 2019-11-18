<%--
  Created by IntelliJ IDEA.
  User: 小甜甜
  Date: 2019/11/16
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/course/add" method="post">
    <ul style="list-style: none">
        <li><h3>添加课程信息</h3></li>
        <li>课程名称:<input type="text" name="cname" required></li>
        <li>专业名称:<input type="text" name="zyname" required></li>
        <li>任课老师:<input type="text" name="tname" required></li>
        <li>添加时间:<input type="date" name="caddtime" required></li>
        <li>修改时间:<input type="date" name="cupdatetime" required></li>
        <li>添加人:<input type="text" name="caddperson" required></li>
        <li>修改人:<input type="text" name="cupdateperson" required></li>
        <input type="submit" value="确认添加">&nbsp;&nbsp;
        <input type="reset" value="重新填写">
    </ul>

</form>

</body>
</html>
