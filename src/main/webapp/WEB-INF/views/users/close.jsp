<style>
    <%@include file='/WEB-INF/views/css/page_style.css' %>
</style>
<html>
<head>
    <title>Processing</title>
</head>
<body>
<h1>Choose conversation, that you want close</h1>
<form method="post" action="${pageContext.request.contextPath}/users/close-conversation">
    <table class="table_dark">
        <tr>
            <td>Conversation #<input type="text" name="conversationId"><br></td>
            <td><input type="submit" name="submit" value="Accept" /></td>
        </tr>
    </table>
</form>
<table class="table_dark">
    <tr>
        <td><a href="${pageContext.request.contextPath}/index">Menu</a></td>
    </tr>
</table>
</body>
</html>
