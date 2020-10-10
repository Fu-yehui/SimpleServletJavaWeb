<%--
  Created by IntelliJ IDEA.
  User: roger
  Date: 2020/10/8
  Time: 下午4:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户管理-更新客户</title>
</head>
<body>
<h1>更新客户界面</h1>

<form action="${pageContext.request.contextPath}/customer_update" method="post">

    <table>
        <tr>
            <th>客户ID</th>
            <th>客户名称</th>
            <th>联系人</th>
            <th>电话号码</th>
            <th>邮箱地址</th>
        </tr>


        <tr>

            <th>${customer.id} <input name="id"  type="hidden" value=${customer.id}></th>
            <th><input name="name" value=${customer.name}></th>
            <th><input name="contact" value=${customer.contact}></th>
            <th><input name="telephone" value=${customer.telephone}></th>
            <th><input name="email" value=${customer.email}></th>
        </tr>
        <tr>
            <button type="submit" >Update</button>
        </tr>
        <tr>
            <form action="${pageContext.request.contextPath}/customer">

                <button type="submit">客户列表</button>
            </form>
        </tr>
    </table>
</form>
</div>
</body>
</html>
