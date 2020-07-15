<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des Topos</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
    <meta name="viewport" content="width=device-width,initial-scale=1" />
</head>
<body>
<a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>
<p>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
<div class="container-fluid">
    <div class="container">
        <div class="row">
            <form:form method="POST" modelAttribute="topo" action="add-topo">
                <form:input type="text" path="nom" class="form-control form-control-sm mb-3" placeholder="Nom"
                            autofocus="true"/>

                <form:input type="text" path="isbn" class="form-control form-control-sm mb-3"
                            placeholder="ISBN"/>

                <form:input type="date" path="parution" class="form-control form-control-sm mb-3" placeholder="Date de Parution"/>
                <input type="submit" class="btn btn-success" value="Ajouter"/>
                <input type="reset" class="btn btn-danger" value="Reset"/>
                <a class="btn btn-warning" href="./">Cancel</a>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
