<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tester
  Date: 16/08/2017
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"  language="java" %>
<html>
  <head>
    <title>Welcome</title>
  </head>
  <body>
  Добро пожаловать в систему, ${name}. <br>
  <a href="/clients">Показать список клиентов</a><br>
  <c:choose>
    <c:when test="${role.equals('admin')}"><a href="/doctors">Показать список врачей</a></c:when>
  </c:choose>
  <br>
  <button onclick="location.href='j_spring_security_logout'">Выйти</button>
  </body>
</html>
