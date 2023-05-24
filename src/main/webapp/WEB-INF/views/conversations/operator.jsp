<style>
    <%@include file='/WEB-INF/views/css/page_style.css' %>
</style>
<html>
<head>
    <title>Processing</title>
</head>
<body>
<h1>Choose operator whose conversations you want get</h1>
<form method="post" action="${pageContext.request.contextPath}/conversations/by-operator">
    <table class="table_dark">
        <tr>
            <td>Operator #<input type="text" name="operatorId"><br></td>
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
