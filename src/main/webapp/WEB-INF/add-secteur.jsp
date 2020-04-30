<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Ajouter Secteur</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<form:form method="post" name="add-secteur" modelAttribute="secteur" action="./${spotId}">

    <form:input type="text" path="nom" class="form-control form-control-sm mb-3" placeholder="Nom"
                autofocus="true"/>
    <form:input type="text" path="designation" class="form-control form-control-sm mb-3"
                placeholder="designation"/>
<input type="submit" class="btn btn-success" value="Ajouter"/>
<input type="reset" class="btn btn-danger" value="Reset"/>
<a class="btn btn-danger" href="/">Cancel</a>
</form:form>
</html>