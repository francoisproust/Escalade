<%@ page import="jdk.nashorn.internal.objects.AccessorPropertyDescriptor" %>
<%@ page import="proust.dev.escalade.hibernate.entities.Secteur" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des secteurs</title>
    <link rel="stylesheet" href="css/style.css" />
</head>
<body>
<p class="ajouter">
    <a href="<%=request.getContextPath()+response.encodeURL("/add-secteur")%>/${spotId}">Ajouter un secteur</a>
</p>
<p>
<h1>Liste des Secteurs</h1>
<table>
    <tr>
        <td>Spot</td>
        <td>Nom</td>
        <td>Descriptif</td>
        <td>nombre de voies</td>
    </tr>
    <c:forEach items="${voirSecteur}" var="voirSecteur">
        <tr>
            <td><a href="<%=request.getContextPath()+response.encodeURL("/voir-spot")%>/${voirSecteur.spot.spotId}">ici</a></td>
            <td>${voirSecteur.nom}</td>
            <td>${voirSecteur.designation}</td>
            <td><a href="<%=request.getContextPath()+response.encodeURL("/voir-voie")%>/${voirSecteur.secteurId}">ici</a></td>
        </tr>
    </c:forEach>
</table>
</p>
</body>
</html>
