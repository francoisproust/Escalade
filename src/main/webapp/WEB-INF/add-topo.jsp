<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des Topos</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>
<p>
<h1 class="logo">
    <img src="css/logo.png">
</h1>
    <form:form method="POST" modelAttribute="topo" action="add-topo">
        <form:input type="text" path="nom" class="form-control form-control-sm mb-3" placeholder="Nom"
                    autofocus="true"/>

        <form:input type="text" path="isbn" class="form-control form-control-sm mb-3"
                    placeholder="ISBN"/>

        <form:input type="date" path="parution" class="form-control form-control-sm mb-3" placeholder="Date de Parution"/>
        <input type="submit" class="btn btn-success" value="Ajouter"/>
        <input type="reset" class="btn btn-danger" value="Reset"/>
        <a class="btn btn-danger" href="./">Cancel</a>
    </form:form>
</body>
</html>
