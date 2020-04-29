<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des voies</title>
    <link rel="stylesheet" href="css/style.css" />
</head>
<body>
<p>
<p class="ajouter">
    <a href="<%=request.getContextPath()+response.encodeURL("/add-longueur")%>/${voirVoie.voieId}">Ajouter une longueur</a>
</p>
<h1>Liste des voies</h1>
<table>
    <tr>
        <td>Nom</td>
        <td>Descriptif</td>
        <td>relai</td>
        <td>nbRelai</td>
        <td>Nombre de longueurs</td>
    </tr>
    <tr>
        <td>${voirVoie.nom}</td>
        <td>${voirVoie.designation}</td>
        <td>${voirVoie.relai}</td>
        <td>${voirVoie.nbRelai}</td>
        <td>${voirVoie.longueurs}</td>
    </tr>
</table>
</p>
</body>
</html>
