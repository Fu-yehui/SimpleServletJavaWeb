<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>
<div style="text-align: center;">
    <h1>查询客户</h1>

    <table>
        <tr>
            <th>客户ID</th>
            <th>客户名称</th>
            <th>联系人</th>
            <th>电话号码</th>
            <th>邮箱地址</th>
            <th>操作</th>
        </tr>


            <tr>
                <th>${customer.id}</th>
                <th>${customer.name}</th>
                <th>${customer.contact}</th>
                <th>${customer.telephone}</th>
                <th>${customer.email}</th>
                <th>
                    <a href="${pageContext.request.contextPath}/customer_update?id=${customer.id}">编辑</a>
                    <a href="${pageContext.request.contextPath}/customer_delete?id=${customer.id}">删除</a>

                </th>
            </tr>

        <tr>

                <a href="/WEB-INF/view/customer_create.jsp">新建用户</a>
        </tr>

            <tr>
                <form action="${pageContext.request.contextPath}/customer">

                    <button type="submit">客户列表</button>
                </form>
            </tr>

    </table>
</div>
</body>
</html>
