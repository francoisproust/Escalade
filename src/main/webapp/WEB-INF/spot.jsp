<%@ page import="jdk.nashorn.internal.objects.AccessorPropertyDescriptor" %>
<%@ page import="proust.dev.escalade.hibernate.entities.Spot" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des spots</title>
    <link rel="stylesheet" href="css/style.css" />
</head>
<body>
<p class="ajouter">
    <a href="<%=request.getContextPath()+response.encodeURL("/add-spot")%>">Ajouter un spot</a>
</p>
<p>
<h1>Liste des spots enregistrés</h1>
<table>
    <tr>
        <td>SpotId</td>
        <td>Nom</td>
        <td>Localisation</td>
        <td>Descriptif</td>
        <td>flagAsso</td>
        <td>utilisateur</td>
        <td>voir les secteurs</td>
        <td>ajouter secteur</td>
        <td>topos</td>
    </tr>
    <c:forEach items="${listerSpot}" var="listerSpot">
        <tr>
            <td>${listerSpot.spotId}</td>
            <td>${listerSpot.nom}</td>
            <td>${listerSpot.localisation}</td>
            <td>${listerSpot.descriptif}</td>
            <td>${listerSpot.flagAsso}</td>
            <td>${listerSpot.utilisateur.pseudo}</td>
            <td><a href="<%=request.getContextPath()+response.encodeURL("/voir-secteur")%>/${listerSpot.spotId}">ici</a></td>
            <td><a href="<%=request.getContextPath()+response.encodeURL("/add-secteur")%>/${listerSpot.spotId}">ici</a></td>
            <td>${listerSpot.topos}</td>
        </tr>
    </c:forEach>
</table>
</p>
</body>
</html>
