<%--
  Created by IntelliJ IDEA.
  User: CHEN JX
  Date: 2017/8/5
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%

    String path  = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tbody>所有新闻</tbody>
    <tr>
        <th>序号</th>
        <th>新闻标题</th>
        <th>新闻类型</th>
        <th>描述</th>
    </tr>
    <c:forEach items="${requestScope.articles}" var="article" varStatus="status">

    <tr>

        <td>${status.count}</td>
        <td>${article.title}</td>
        <td>${article.articleType.name}</td>
        <td>${article.abstracts}</td>
    </tr>
    </c:forEach>

</table>
</body>
</html>
