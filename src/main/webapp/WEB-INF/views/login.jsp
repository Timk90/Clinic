<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Tim
  Date: 21.08.2017
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
Войти в систему
<form:form action="j_spring_security_check" >
    Логин: <form:input path="firstname"></form:input>
    Пароль: <form:password path="password"></form:password>
    <input type="submit" value="Войти"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form:form>
<div style="color: red; font-weight: bold">${error} ${logout}</div>
</body>
</html>
