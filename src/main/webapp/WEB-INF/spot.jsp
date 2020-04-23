<%@ page import="jdk.nashorn.internal.objects.AccessorPropertyDescriptor" %>
<%@ page import="proust.dev.escalade.hibernate.entities.Spot" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: S636789
  Date: 27/01/2020
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des spots</title>
    <link rel="stylesheet" href="style.css" />
</head>
<body>
<p class="ajouterSpot">
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
            <td><a href="<%=request.getContextPath()+response.encodeURL("/voir-secteur")%>">ici</a></td>
            <td>${listerSpot.topos}</td>
        </tr>
    </c:forEach>
</table>
</p>
</body>
</html>
