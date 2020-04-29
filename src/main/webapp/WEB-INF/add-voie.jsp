<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Ajouter voie</title>
    <link rel="stylesheet" href="css/style.css" />
</head>
<body>
<form:form method="POST" modelAttribute="voie" action="add-voie">
    <form:input type="text" path="nom" class="form-control form-control-sm mb-3" placeholder="Nom"
                autofocus="true"/>
    <form:input type="text" path="designation" class="form-control form-control-sm mb-3" placeholder="designation"
                autofocus="true"/>
        <form:checkbox path="relai" value="oui"
                   placeholder="relai"/>
    <form:input type="text" path="nbRelai" class="form-control form-control-sm mb-3" placeholder="nbRelai"
                autofocus="true"/>

    <input type="submit" class="btn btn-success" value="Ajouter"/>
    <input type="reset" class="btn btn-danger" value="Reset"/>
    <a class="btn btn-danger" href="/">Cancel</a>
</form:form>
</body>