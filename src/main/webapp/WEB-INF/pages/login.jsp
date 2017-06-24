<%--
  Created by IntelliJ IDEA.
  User: victor
  Date: 24/06/2017
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form action="/loginG" method="get">
    <input type="text" id="username" name="username" placeholder="username">
    <input type="password" id="password" name="password" placeholder="password">
    <button type="submit">login</button>
</form>
<a href="/signup" type="button">sign up</a>
</body>
</html>
