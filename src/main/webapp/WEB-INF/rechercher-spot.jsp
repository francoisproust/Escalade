<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Rechercher spot</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
<form:form method="POST" modelAttribute="spotFormCriterias" action="rechercher-spot">
    <form:input type="text" path="localisation" class="form-control form-control-sm mb-3" placeholder="Localisation"
                autofocus="true"/>

    <form:select path="cotationMin">
        <c:forEach items="${listCotation}" var="cotation">
            <form:option value="${cotation.cotationId}">${cotation.indice}</form:option>
        </c:forEach>
    </form:select>

    <form:select path="cotationMax">
        <c:forEach items="${listCotation}" var="cotation">
            <form:option value="${cotation.cotationId}">${cotation.indice}</form:option>
        </c:forEach>
    </form:select>

    <form:checkbox path="multiSecteurs" value="oui"
                   placeholder="Plusieurs secteurs?"/>


    <form:input type="text" path="longueurMin" class="form-control form-control-sm mb-3" placeholder="Longueur minimale"/>

    <form:input type="" path="longueurMax" class="form-control form-control-sm mb-3" placeholder="Longueur maximale"/>

    <input type="submit" class="btn btn-success" value="Ajouter"/>
    <input type="reset" class="btn btn-danger" value="Reset"/>
    <a class="btn btn-danger" href="./">Cancel</a>
</form:form>
</body>