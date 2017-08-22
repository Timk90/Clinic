<%--
  Created by IntelliJ IDEA.
  User: Tim
  Date: 21.08.2017
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"  language="java" %>
<html>
<script>
    function divShow(id){
        document.getElementById(id).style.display = 'block';
    }
    function divHide(id){
        document.getElementById(id).style.display = 'none';
    }

</script>
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
    <title>Title</title>
</head>
<body>
<h1>Заказывайте у нас на сайте!!! Он у нас самый крутой!</h1>
Вот , например, хлорсодержащие препараты:
<iframe width="560" height="315" src="https://www.youtube.com/embed/ey0VkOLFL48" frameborder="0" allowfullscreen></iframe>
<button onclick="window.location='divShow(div)'">Заказать</button>
<div id="div" class="menu"> <button onclick="window.location='divHide(div)'">Закрыть</button>Попались!</div>
</body>
</html>
