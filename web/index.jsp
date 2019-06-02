<%--
  Created by IntelliJ IDEA.
  User: luis
  Date: 02/06/19
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Smash</title>
</head>
<body>

<select name="listapaises">
    <c:forEach items="${paises}" var="pais">
        <option value="${pais.country_id}">${pais.country}</option>
    </c:forEach>
</select>


</body>
</html>
