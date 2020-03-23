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
        <td>Nom</td>
        <td>Localisation</td>
        <td>Descriptif</td>
        <td>flagAsso</td>
        <td>utilisateur</td>
        <td>Nombre de secteurs</td>
        <td>topos</td>
    </tr>
    <c:forEach items="${listerSpot}" var="listerSpot">
        <tr>
            <td>${listeUtilisateur.nom}</td>
            <td>${listeUtilisateur.localisation}</td>
            <td>${listeUtilisateur.descriptif}</td>
            <td>${listeUtilisateur.flagAsso}</td>
            <td>${listeUtilisateur.utilisateur}</td>
            <td>${listeUtilisateur.secteurs}</td>
            <td>${listeUtilisateur.topos}</td>
        </tr>
    </c:forEach>
</table>
</p>
<p>

</p>
</body>
</html>
