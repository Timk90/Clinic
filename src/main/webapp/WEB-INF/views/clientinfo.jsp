<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tim
  Date: 21.08.2017
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    #table_head{
        font-weight: bold;
    }

</style>
<head>
    <title>Client Info</title>
</head>
<body>
Информация о клиенте
<table style="align-content: center">

    <tr id="table_head">
        <%--<td>ID</td>--%>
        <td>Имя</td>
        <td>Фамилия</td>
        <td>Отчество</td>
        <td>Телефон</td>
        <td>Полис</td>
        <td>Лечащий врач</td>
    </tr>
    <c:forEach items="${selectedClient}" var="doctor">
    <tr>
        <%--<td><c:out value="${doctor['id']}"></c:out></td>--%>
        <td><c:out value="${doctor['firstname']}"></c:out></td>
        <td><c:out value="${doctor['lastname']}"></c:out></td>
        <td><c:out value="${doctor['patronymic']}"></c:out></td>
        <td><c:out value="${doctor['phone']}"></c:out></td>
        <td><c:out value="${doctor['polis']}"></c:out></td>
        <td>
            <c:out value="${doctor['doctorFirstname']}"></c:out>
            <c:out value="${doctor['doctorLastname']}"></c:out>
        </td>
    </tr>
    </c:forEach>
</table>
<br>
<a href="/clients">Назад</a>

</body>
</html>
