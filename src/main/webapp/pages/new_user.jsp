<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New User</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/newuser" method="post">
    <input type="text" name="id">
    <input type="text" name="name">
    <input type="text" name="password">
    <button type="submit">Регистрация</button>
</form>
</body>
</html>
