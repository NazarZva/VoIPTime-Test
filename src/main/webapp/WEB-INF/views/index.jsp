<style>
    <%@include file='/WEB-INF/views/css/page_style.css' %>
</style>
<html>
<head>
    <title>My team</title>
</head>
<body>
<form method="post" id="redirect"></form>
<h1 class="table_dark">Hello, user</h1>
<table class="table_dark">
    <tr>
        <th>Redirect to</th>
    </tr>
    <tr><td><a href="${pageContext.request.contextPath}/generation/start">Start generating conversations</a></td></tr>
    <tr><td><a href="${pageContext.request.contextPath}/operators/add">Add operator</a></td></tr>
    <tr><td><a href="${pageContext.request.contextPath}/operators/conversation">Get conversation</a></td></tr>
    <tr><td><a href="${pageContext.request.contextPath}/users/close-conversation">Close conversation</a></td></tr>
    <tr><td><a href="${pageContext.request.contextPath}/conversations/by-operator">Get conversation by operator</a></td></tr>
</table>
</body>
</html>