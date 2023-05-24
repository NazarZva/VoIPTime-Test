<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file='/WEB-INF/views/css/page_style.css' %>
</style>
<html>
<head>
    <title>Conversations</title>
</head>
<body>
<h1>Conversations</h1>
<table class="table_dark">
    <tr>
        <th>ID</th>
        <th>Created Date</th>
        <th>Operator</th>
        <th>Status</th>
    </tr>
    <c:forEach var="conversation" items="${conversations}">
        <tr>
            <td><c:out value="${conversation.id}"/></td>
            <td><c:out value="${conversation.createdDate}"/></td>
            <td><c:out value="${conversation.operator.username}"/></td>
            <td><c:out value="${conversation.status}"/></td>
        </tr>
    </c:forEach>
</table>
<table class="table_dark">
    <tr>
        <td><a href="${pageContext.request.contextPath}/index">Menu</a></td>
    </tr>
</table>
</body>
</html>