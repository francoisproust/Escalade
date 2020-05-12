<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Ajouter spot</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
<form:form method="POST" modelAttribute="spot" action="add-spot">
    <form:input type="text" path="nom" class="form-control form-control-sm mb-3" placeholder="Nom"
                autofocus="true"/>

    <form:input type="text" path="localisation" class="form-control form-control-sm mb-3"
                placeholder="Localisation"/>

    <form:input type="text" path="utilisateur" class="form-control form-control-sm mb-3"
                placeholder="utilisateur"/>

    <form:input type="text" path="descriptif" class="form-control form-control-sm mb-3" placeholder="Descriptif"/>

    <form:input type="text" path="secteurs" class="form-control form-control-sm mb-3"
                placeholder="Nombre de secteurs"/>
    Membre de l'association:
    <form:checkbox path="flagAsso" value="oui"
                   placeholder="Flag Association"/>

    <input type="submit" class="btn btn-success" value="Ajouter"/>
    <input type="reset" class="btn btn-danger" value="Reset"/>
    <a class="btn btn-danger" href="/">Cancel</a>
</form:form>
</body>