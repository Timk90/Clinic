<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tim
  Date: 21.08.2017
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
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
Список врачей
<form action="/doctors/search" method="post"><input type="text" name="searching"><input type="submit" value="Поиск"></form>
<table style="align-content: center">

    <tr id="table_head">
        <td>ФИО доктора</td>
        <td>кабинет</td>
    </tr>
    <c:forEach items="${doctors}" var="doctor">
        <tr>
            <td>
                <a href="/doctors/${doctor['id']}">
                    <c:out value="${doctor['firstname']}"></c:out>
                    <c:out value="${doctor['lastname']}"></c:out>
                    <c:out value="${doctor['patronymic']}"></c:out>
                </a>
            </td>
                <%--<td><c:out value="${client['phone']}"></c:out></td>--%>
                <%--<td><c:out value="${client['polis']}"></c:out></td>--%>
            <td>
                <c:out value="${doctor['cabinet']}"></c:out>
            </td>
            <td>
                <button onclick="location.href='/doctors/${doctor['id']}/delete'">Удалить</button>
            </td>
            <td>
                <button onclick="location.href='/doctors/${doctor['id']}/update'">Изменить</button>
            </td>
        </tr>
    </c:forEach>
</table>
<button onclick="location.href='/doctors/add'">Добавить новую запись</button>
<a href="/welcome">Назад</a>
</body>
</html>
