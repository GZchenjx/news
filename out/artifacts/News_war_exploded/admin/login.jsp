<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/8/3
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath(); %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
<form id="form">
    <input type="text" name="admin.phone" />
    <input type="password" name="admin.pwd" />
    <input type="button" value="登入" onclick="login();" />
</form>
</body>
<script src="<%=path %>/js/jquery.min.js"></script>
<script>
    function login() {
        $.post("<%=path %>/admin/login",
            $("#form").serialize(),
            function (data) {
                if (data.result.result === "success") {
                        window.location.href= "/admin/admin.jsp";
                } else {
                    alert(data.result.msg);
                }
            }, "json"
        );
    }
</script>
</html>
