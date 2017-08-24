<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tim
  Date: 21.08.2017
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"  language="java" %>
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
    <title>Doctor form</title>
</head>
<body>
<h2>
<c:choose>
    <c:when test="${message.equals('Add')}">Добавить нового доктора</c:when>
    <c:when test="${message.equals('Update')}">Изменить информацию о докторе</c:when>
</c:choose>
</h2>
<table>
    <form:form modelAttribute="doctor" method="post" action="/checkDoctorForm" commandName="doctor">
        <tr>
            <td>Имя</td>
            <td><form:input path="firstname"></form:input></td>
            <td><form:errors cssStyle="color: red" path="firstname"></form:errors></td>
        </tr>
        <tr>
            <td>Фамилия</td>
            <td><form:input path="lastname"></form:input></td>
            <td><form:errors cssStyle="color: red" path="lastname"></form:errors></td>
        </tr>
        <tr>
            <td>Отчество</td>
            <td><form:input path="patronymic"></form:input></td>
            <td><form:errors cssStyle="color: red" path="patronymic"></form:errors></td>
        </tr>
        <tr>
            <td>Пароль</td>
            <td><form:password path="password"></form:password></td>
            <td><form:errors cssStyle="color: red" path="password"></form:errors></td>
        </tr>
        <tr>
            <td>Подтверждение пароля</td>
            <td><form:password path="passwordConfirmation" ></form:password></td>
            <td><form:errors cssStyle="color: red" path="passwordConfirmation" ></form:errors></td>
        </tr>
        <tr>
            <td>Специальность</td>
            <td><form:input path="speciality"></form:input></td>
            <td><form:errors cssStyle="color: red" path="speciality"></form:errors></td>
        </tr>
        <tr>
            <td>Kабинет</td>
            <td><form:input path="cabinet"></form:input></td>
            <td><form:errors cssStyle="color: red" path="cabinet"></form:errors></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" value="Сохранить"></td>
        </tr>
            <input type="hidden" name="message" value="${message}">
    </form:form>

</table>

<h1>Заказывайте у нас на сайте!!! Он у нас самый крутой!</h1>
Вот , например, хлорсодержащие препараты:
<iframe width="560" height="315" src="https://www.youtube.com/embed/ey0VkOLFL48" frameborder="0" allowfullscreen></iframe>

</body>
</html>
