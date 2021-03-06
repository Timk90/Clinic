<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tim
  Date: 21.08.2017
  Time: 21:13
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
    <title>Clients</title>
</head>
<body>
Cписок клиентов
<form action="/clients/search" method="post"><input type="text" name="searching"><input type="submit" value="Поиск"></form>
<table style="align-content: center">

    <tr id="table_head">
        <td>ФИО клиента</td>
        <td>Лечащий врач</td>
    </tr>
<c:forEach items="${clients}" var="client">
    <tr>
        <td>
            <a href="/clients/${client['id']}">
                <c:out value="${client['firstname']}"></c:out>
                <c:out value="${client['lastname']}"></c:out>
                <c:out value="${client['patronymic']}"></c:out>
            </a>
        </td>
        <%--<td><c:out value="${client['phone']}"></c:out></td>--%>
        <%--<td><c:out value="${client['polis']}"></c:out></td>--%>
        <td>
            <c:out value="${client['doctorFirstname']}"></c:out>
            <c:out value="${client['doctorLastname']}"></c:out>
        </td>
        <td>
            <button onclick="location.href='/clients/${client['id']}/delete'">Удалить</button>
        </td>
        <td>
            <button onclick="location.href='/clients/${client['id']}/update'">Изменить</button>
        </td>
    </tr>
</c:forEach>
</table>
<button onclick="location.href='/clients/add'">Добавить новую запись</button>
<a href="/welcome">Назад</a>
</body>
</html>
