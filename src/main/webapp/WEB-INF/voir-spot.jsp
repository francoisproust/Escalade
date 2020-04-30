<%@ page import="jdk.nashorn.internal.objects.AccessorPropertyDescriptor" %>
<%@ page import="proust.dev.escalade.hibernate.entities.Spot" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${voirSpot.nom}</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<p class="ajouter">
    <a href="<%=request.getContextPath()+response.encodeURL("/add-secteur")%>/${spotId}">Ajouter un secteur</a>
</p>
<p>
<h1>${voirSpot.nom}</h1>
<table>
    <tr>
        <td>Nom</td>
        <td>Localisation</td>
        <td>Descriptif</td>
        <td>flagAsso</td>
        <td>utilisateur</td>
        <td>voir les secteurs</td>
        <td>topos</td>
    </tr>
    <tr>
        <td><c:out value="${voirSpot.nom}"/></td>
        <td><c:out value="${voirSpot.localisation}"/></td>
        <td><c:out value="${voirSpot.descriptif}"/></td>
        <td><c:out value="${voirSpot.flagAsso}"/></td>
        <td><c:out value="${voirSpot.utilisateur.pseudo}"/></td>
        <td><a href="<%=request.getContextPath()+response.encodeURL("/voir-secteur")%>/${spotId}">ici</a></td>
        <td><c:out value="${voirSpot.topos}"/></td>
    </tr>
</table>
</p>
</body>
</html>
