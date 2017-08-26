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
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <%--for Bootstrap--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <title>Doctor list</title>
</head>
<body>
Список врачей
<form action="/doctors/search" method="post"><input type="text" name="searching"><input type="submit" value="Поиск"></form>
<table style="align-content: center" class="table table-striped">
    <thead>
    <tr>
    <%--<tr id="table_head">--%>
        <td>ФИО доктора</td>
        <td>кабинет</td>
    </tr>
    </thead>
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

<%--bootstrap--%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

</body>
</html>
