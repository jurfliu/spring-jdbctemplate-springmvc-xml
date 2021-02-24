<%--
  Created by IntelliJ IDEA.
  User: jurfl
  Date: 2021/2/20
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/account?action=findAll">测试查询</a>

<h3>账户录入页面</h3>

<form action="${pageContext.request.contextPath}/account?action=save" method="post">
    姓名：<input type="text" name="accountName" /><br/>
    金额：<input type="text" name="money" /><br/>
    <input type="submit" value="保存"/><br/>
</form>

</body>
</body>
</html>
