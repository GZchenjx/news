<%--
  Created by IntelliJ IDEA.
  User: CHEN JX
  Date: 2017/8/3
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="<%=path%>/admin/allNews">查询所有新闻</a>
    <a href="<%=path%>/admin/fenleiNews">查询新闻分类</a>
    <a href="<%=path%>/admin/addNews">添加新闻</a>
    <a href="#">添加新闻类别</a>
</body>
</html>
