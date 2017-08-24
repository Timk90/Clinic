<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Tim
  Date: 24.08.2017
  Time: 0:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    .menu{
        width: 100%;
        height: 100%;
        opacity: 80;
        background: #27b533;
        text-align: center;
        color: red;

    }

</style>

<head>
    <title>Client form</title>
</head>
<body>
<h2>${message}</h2>
<table>
    <form:form modelAttribute="client" action="/checkClientForm" commandName="client">
        <tr>
            <td>Имя</td>
            <td><form:input path="firstname"></form:input></td>
            <td><form:errors path="firstname"></form:errors></td>
        </tr>
        <tr>
            <td>Фамилия</td>
            <td><form:input path="lastname"></form:input></td>
            <td><form:errors path="lastname"></form:errors></td>
        </tr>
        <tr>
            <td>Отчество</td>
            <td><form:input path="patronymic"></form:input></td>
            <td><form:errors path="patronymic"></form:errors></td>
        </tr>
        <tr>
            <td>Пароль</td>
            <td><form:input path="password"></form:input></td>
            <td><form:errors path="password"></form:errors></td>
        </tr>
        <tr>
            <td>Подтверждение пароля</td>
            <td><input type="password" name="passwordConfirmation" /></td>
            <td><input type="password" name="passwordConfirmation" /></td>
        </tr>
        <tr>
            <td>Специальность</td>
            <td><form:input path="speciality"></form:input></td>
            <td><form:errors path="speciality"></form:errors></td>
        </tr>
        <tr>
            <td>Kабинет</td>
            <td><form:input path="cabinet"></form:input></td>
            <td><form:errors path="cabinet"></form:errors></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" value="Сохранить"></td>
        </tr>
    </form:form>

</table>

</body>
</html>
