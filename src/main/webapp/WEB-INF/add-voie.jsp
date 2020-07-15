<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Ajouter une voie</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
<div class="container-fluid">
    <div class="container">
        <div class="row">
            <form:form method="post" modelAttribute="voie" action="./${secteurId}">
                <form:input type="text" path="nom" class="form-control form-control-sm mb-3" placeholder="Nom"
                            autofocus="true"/>
                <form:input type="text" path="designation" class="form-control form-control-sm mb-3" placeholder="designation"
                            autofocus="true"/>
                <p>
                    Présence de relai:
                    <form:checkbox path="relai" value="oui" placeholder="relai"/>
                    (si coché "oui")
                </p>
                <form:input type="text" path="nbRelai" class="form-control form-control-sm mb-3" placeholder="nbRelai"
                            autofocus="true"/>

                <input type="submit" class="btn btn-success" value="Ajouter"/>
                <input type="reset" class="btn btn-danger" value="Reset"/>
                <a class="btn btn-warning" href="http://localhost:8080/Escalade/voir-voie/${secteurId}">Cancel</a>
            </form:form>
        </div>
    </div>
</div>
</body>