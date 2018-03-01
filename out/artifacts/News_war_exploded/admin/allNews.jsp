<%--
  Created by IntelliJ IDEA.
  User: CHEN JX
  Date: 2017/8/3
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path= request.getContextPath();
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
        <th>ID</th>
        <th>标题</th>
        <th>摘要</th>
        <th>内容</th>
        <th>发布时间</th>

        <th>发布者</th>
        <th>新闻类型</th>
        <th>操作</th>

    </tr>
    <c:forEach items="${requestScope.newsList}" var="news" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${news.id}</td>
            <td>${news.title}</td>
            <td>${news.abstracts}</td>
            <td>${news.content}</td>
            <td>${news.pubTime}</td>
            <td>
                ${news.admin.phone}
            </td>
            <td>
                ${news.articleType.name}
            </td>

            <td>
                <a href="<%=path%>/admin/news_info?news_id=${news.id}">查看详情</a>
            </td>
        </tr>
    </c:forEach>
</table>
    <a href="<%=path %>/admin/allNews?page=1">首页</a>
    <c:if test="${requestScope.nowPage > 1}">
    <a href="<%=path %>/admin/allNews?page=${requestScope.nowPage - 1}">上一页</a>
    </c:if>
    <c:if test="${requestScope.nowPage < requestScope.pageCount}">
    <a href="<%=path %>/admin/allNews?page=${requestScope.nowPage + 1}">下一页</a>
    </c:if>
<a href="<%=path %>/admin/allNews?page=${requestScope.pageCount}">尾页（当前第${requestScope.nowPage}页，共${requestScope.pageCount}页）</a>
<a href="admin.jsp">回到主页</a>
</body>
</html>
