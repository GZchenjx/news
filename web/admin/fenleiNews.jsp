<%--
  Created by IntelliJ IDEA.
  User: CHEN JX
  Date: 2017/8/3
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>新闻分类</title>
</head>
<body>
<form action="<%=path%>/admin/fen">
    请选择新闻类型:<select name="articleType.id">
                    <option value="">军事新闻</option>
                    <option value="402880345da1c27c015da1c27d6b0000" >国际新闻</option>
                    <option name="tiyu">体育新闻</option>
                    <option name="yule">娱乐新闻</option>
                    <option name="keji">科技新闻</option>
                </select>
                <input type="submit" value="查询">
</form>
</body>
</html>
