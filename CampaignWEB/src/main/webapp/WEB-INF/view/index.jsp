<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Илья Корчан
  Date: 06.05.2019
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
     <title>Рейтинг студентов</title>
    </head>

    <body>
        <h1><p align="center">Рейтинг на <c:out value="${requestScope.currentDate}"/></p></h1>


        <c:forEach var="students" items="${requestScope.students}">
            <ul>
                <li>Имя: <c:out value="${students.name}"/></li>
                <li>Фамилия: <c:out value="${students.surname}"/></li>
                <li>Средний балл: <c:out value="${students.getRatingMark()}"/></li>
                <li>Льготы: <c:out value="${students.privileges ? 'Да' : 'Нет'}"/></li>
            </ul>
            <hr/>
        </c:forEach>
    </body>
</html>
