<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Ajouter longueur</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
    <form:form method="POST" modelAttribute="longueur" action="./${voieId}">
        <form:input type="text" path="nom" class="form-control form-control-sm mb-3" placeholder="Nom"
                    autofocus="true"/>

        <form:input type="text" path="designation" class="form-control form-control-sm mb-3"
                    placeholder="Désignation"/>

        <form:input type="text" path="tailleLongueur" class="form-control form-control-sm mb-3" placeholder="Longueur"/>

        <form:input type="text" path="spits" class="form-control form-control-sm mb-3"
                    placeholder="nombre de spits"/>
        <form:select path="cotation">
                <c:forEach items="${listCotation}" var="cotation">
                 <form:option value="${cotation.cotationId}">${cotation.indice}</form:option>
                </c:forEach>
        </form:select>
        <input type="submit" class="btn btn-success" value="Ajouter"/>
        <input type="reset" class="btn btn-danger" value="Reset"/>
        <a class="btn btn-danger" href="/">Cancel</a>
    </form:form>
</body>