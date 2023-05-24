<style>
    <%@include file='/WEB-INF/views/css/page_style.css' %>
</style>
<html>
<head>
    <title>Add process</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/operators/add">
    <h1 class="table_dark">Add operator:</h1>
    <table class="table_dark">
        <tr>
            <td>Operator name:<input type="text" name="name"><br></td>
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
