<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tim
  Date: 21.08.2017
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"  language="java" %>
<html>
<style>
    #table_head{
        font-weight: bold;
    }
</style>
<head>
    <title>Title</title>
</head>
<body>
Информация о докторе
<table style="align-content: center">

    <tr id="table_head">
        <td>Имя</td>
        <td>Фамилия</td>
        <td>Отчество</td>
        <td>Специализация</td>
        <td>Кабинет</td>
    </tr>
    <c:forEach items="${selectedDoctor}" var="doctor">
        <tr>
            <td><c:out value="${doctor['firstname']}"></c:out></td>
            <td><c:out value="${doctor['lastname']}"></c:out></td>
            <td><c:out value="${doctor['patronymic']}"></c:out></td>
            <td><c:out value="${doctor['speciality']}"></c:out></td>
            <td><c:out value="${doctor['cabinet']}"></c:out></td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="/doctors">Назад</a>
</body>
</html>
