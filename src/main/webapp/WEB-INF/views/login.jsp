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
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <%--for Bootstrap--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <title>Login</title>
</head>
<body>
<div class="container">
    <h2 class="form-signin-heading">Войти в систему</h2>
<form action="j_spring_security_check" method="post"  class="form-signin">
    <table>
        <tr><td>Логин: </td><td><input type="text" id="username" name="username" placeholder="введите логин"/></td></tr>
        <tr><td>Пароль: </td><td><input type="password" id="password" name="password" placeholder="введите пароль"/></td></tr>
        <tr><td colspan="2">
            <%--<input  type="submit" value="Войти"/>--%>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
        <tr><td>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </table>
</form>
<div style="color: red; font-weight: bold">${error}</div>
<div style="color: red; font-weight: bold">${logout}</div>
</div>
<%--bootstrap--%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</body>
</html>
