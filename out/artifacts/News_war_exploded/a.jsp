<%--
  Created by IntelliJ IDEA.
  User: CHEN JX
  Date: 2017/8/6
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
        String path = request.getContextPath();
%>
<html>
<head>
    <title>登入</title>
</head>
<body>
<form action="<%=path%>/admins/log" method="post">
    邮箱：<input type="text" name="phone"/>
    密码：<inpuy type="password" name="pwd"/>
    <input type="checkbox" name="hobby" value="reading"/>阅读
    <input type="checkbox" name="hobby" value="runing"/>跑步
    <input type="checkbox" name="hobby" value="swiming"/>游泳
    <input type="submit"/>
</form>
</body>
</html>
