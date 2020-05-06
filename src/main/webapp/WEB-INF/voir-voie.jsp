<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des voies</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<p>
<p class="ajouter">
    <a href="<%=request.getContextPath()+response.encodeURL("/add-voie")%>/${secteurId}">Ajouter une voie</a>
</p>
<h1>Liste des voies</h1>
<table>
    <tr>
        <td>Secteur</td>
        <td>Nom</td>
        <td>Descriptif</td>
        <td>relai</td>
        <td>nbRelai</td>
        <td>voir les longueurs</td>
    </tr>
    <c:forEach items="${voirVoie}" var="voirVoie">
        <tr>
            <td><a href="<%=request.getContextPath()+response.encodeURL("/voir-secteur")%>/${voirVoie.secteur.spot.spotId}">ici</a></td>
            <td>${voirVoie.nom}</td>
            <td>${voirVoie.designation}</td>
            <td>${voirVoie.relai}</td>
            <td>${voirVoie.nbRelai}</td>
            <td><a href="<%=request.getContextPath()+response.encodeURL("/voir-longueur")%>/${voirVoie.voieId}">ici</a></td>
        </tr>
    </c:forEach>
</table>
</p>
</body>
</html>
