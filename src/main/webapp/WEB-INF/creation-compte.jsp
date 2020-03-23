<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Création compte</title>
    <link rel="stylesheet" href="style.css" />
</head>
<body>
    <form:form method="POST" modelAttribute="utilisateur" action="/creation-compte">
        <form:input type="text" path="nom" class="form-control form-control-sm mb-3" placeholder="Nom"
                    autofocus="true"/>

        <form:input type="text" path="prenom" class="form-control form-control-sm mb-3"
                    placeholder="Prenom"/>

        <form:input type="text" path="email" class="form-control form-control-sm mb-3" placeholder="Mail"/>

        <form:input type="text" path="pseudo" class="form-control form-control-sm mb-3"
                    placeholder="Pseudo"/>

        <form:input type="text" path="password" class="form-control form-control-sm mb-3"
                    placeholder="Mot De Passe"/>
        <input type="submit" class="btn btn-success" value="Ajouter"/>
        <input type="reset" class="btn btn-danger" value="Reset"/>
        <a class="btn btn-danger" href="/">Cancel</a>
    </form:form>
</body>
</html>
