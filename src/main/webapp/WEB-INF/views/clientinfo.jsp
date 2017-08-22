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
<head>
    <title>Client Info</title>
</head>
<body>
Информация о клиенте
<table>

    <tr>
        <td>ID</td>
        <td>Имя</td>
        <td>Фамилия</td>
        <td>Отчество</td>
        <td>Телефон</td>
        <td>Полис</td>
        <td>Лечащий врач</td>
    </tr>
    <c:forEach items="${selectedClient}" var="client">
    <tr>
        <td><c:out value="${client['id']}"></c:out></td>
        <td><c:out value="${client['firstname']}"></c:out></td>
        <td><c:out value="${client['lastname']}"></c:out></td>
        <td><c:out value="${client['patronymic']}"></c:out></td>
        <td><c:out value="${client['phone']}"></c:out></td>
        <td><c:out value="${client['polis']}"></c:out></td>
        <td>
            <c:out value="${client['doctorFirstname']}"></c:out>
            <c:out value="${client['doctorLastname']}"></c:out>
        </td>
    </tr>
    </c:forEach>
</table>
    <a href="/clients">Назад</a>

</body>
</html>
