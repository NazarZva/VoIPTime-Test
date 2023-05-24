<style>
    <%@include file='/WEB-INF/views/css/page_style.css' %>
</style>
<html>
<head>
    <title>Processing</title>
    <script>
        setTimeout(function() {
            window.location.href = "${pageContext.request.contextPath}/operators/conversation/return";
        }, 15000);
    </script>
</head>
<body>
<h1>Please write the form below</h1>
<form id="conversationForm" method="post" action="${pageContext.request.contextPath}/operators/conversation">
    <table class="table_dark">
        <tr>
            <td>Operator #<input type="text" name="number"><br></td>
            <td> Do you want to process conversation?</td>
            <td><input type="submit" name="submit" value="Accept" /></td>
            <td><input type="submit" name="cancel" value="Not accept" /></td>
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
