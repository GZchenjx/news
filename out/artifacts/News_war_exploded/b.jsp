<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: CHEN JX
  Date: 2017/8/6
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="/admins/a" method="post">
    <s:textfield name="name" label="用户名" required="true" requiredPosition="left" ></s:textfield>
    <s:password name="password" label="密码" required="true" requiredPosition="left"></s:password>
    <s:radio name="sex" list="#{1:'男',0:'女'}" label="性别" required="true" requiredPosition="left"></s:radio>
    <s:select list="{'请选择省份','江西','河南','河北'}" name="province" label="省份"></s:select>
    <s:checkbox list="{'篮球','足球','羽毛球','乒乓球'}" name="hobby" label="爱好"></s:checkbox>
    <s:textarea name="miaoshu" cols="30" rows="5"  label="描述"></s:textarea>
    <s:submit value="注册"></s:submit>
    <s:reset value="重置"></s:reset>
</s:form>

</body>
</html>
