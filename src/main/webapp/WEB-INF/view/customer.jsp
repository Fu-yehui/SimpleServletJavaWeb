<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: roger
  Date: 2020/10/9
  Time: 下午3:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户管理</title>
</head>
<body>
<div style="text-align: center;">
<h1>客户列表</h1>

<table>
    <tr>
        <form action="${pageContext.request.contextPath}/customer_search" method="get">
            <input name="search_id" />
            <button type="submit">Search</button>
        </form>
    </tr>
    <tr>
        <th>客户ID</th>
        <th>客户名称</th>
        <th>联系人</th>
        <th>电话号码</th>
        <th>邮箱地址</th>
        <th>操作</th>
    </tr>

    <c:forEach var="customer" items="${customerList}">
        <tr>
            <th>${customer.id}</th>
            <th>${customer.name}</th>
            <th>${customer.contact}</th>
            <th>${customer.telephone}</th>
            <th>${customer.email}</th>
            <th>

                <a href="${pageContext.request.contextPath}/customer_update?id=${customer.id}">Update</a>
                <a href="${pageContext.request.contextPath}/customer_delete?id=${customer.id}">Delete</a>

            </th>
        </tr>
    </c:forEach>
        <tr>
            <form action="${pageContext.request.contextPath}/customer_create" method="get">
                <button type="submit">Create</button>
            </form>

        </tr>

</table>
</div>
</body>
</html>
