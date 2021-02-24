<%--
  Created by IntelliJ IDEA.
  User: jurfl
  Date: 2021/2/20
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有的帐户</h3>
<table border="1" cellpadding="1" cellspacing="1" width="500px" >
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>金额</td>
    </tr>
<c:forEach items="${list}" var="account">
    <tr>
        <td>${account.id}</td>
        <td>${account.accountName}</td>
        <td>${account.money}</td>
    </tr>
</c:forEach>
</table>

</body>
</html>
