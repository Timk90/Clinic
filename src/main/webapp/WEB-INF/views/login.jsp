<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Tim
  Date: 21.08.2017
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"  language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
Войти в систему<br>
<form action="j_spring_security_check" method="post">
    <table>
        <tr><td>Логин: </td><td><input type="text" id="username" name="username" /></td></tr>
        <tr><td>Пароль: </td><td><input type="password" id="password" name="password" /></td></tr>
        <tr><td colspan="2"><input type="submit" value="Войти"/><tr><td>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </table>
</form>
<div style="color: red; font-weight: bold">${error}</div>
<div style="color: red; font-weight: bold">${logout}</div>

</body>
</html>
