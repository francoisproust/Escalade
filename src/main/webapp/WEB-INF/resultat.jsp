<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Résultat</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>
<p>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
<p>
<h1>Résultat de la recherche</h1>
<table class="table">
    <tr>
        <td>Nom</td>
        <td>Localisation</td>
        <td>Descriptif</td>
        <td>flagAsso</td>
        <td>utilisateur</td>
        <td>voir les secteurs</td>
        <td>topos</td>
    </tr>
    <c:forEach items="${resultat}" var="resultat">
    <tr>
        <td><c:out value="${resultat.nom}"/></td>
        <td><c:out value="${resultat.localisation}"/></td>
        <td><c:out value="${resultat.descriptif}"/></td>
        <td><c:out value="${resultat.flagAsso}"/></td>
        <td><c:out value="${resultat.utilisateur.pseudo}"/></td>
        <td><a href="<%=request.getContextPath()+response.encodeURL("/voir-secteur")%>/${spotId}">ici</a></td>
        <td><c:out value="${resultat.topos}"/></td>
    </tr>
    </c:forEach>
</table>
</p>
</body>
</html>
