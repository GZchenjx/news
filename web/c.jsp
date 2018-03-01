<%--
  Created by IntelliJ IDEA.
  User: CHEN JX
  Date: 2017/8/16
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <li>
        用户名：<s:property value="name"/>
    </li>
    <li>
        密码：<s:property value="password"/>
    </li>
    <li>
        性别：<s:if test="sex==0">女</s:if>
        <s:else>男</s:else>
    </li>
    <li>
        省份：<s:property value="province"/>
    </li>
    <li>
        爱好：<s:property value="hobby"/>
    </li>
    <li>
        描述：<s:property value="miaoshu"/>
    </li>
</ul>
</body>
</html>
