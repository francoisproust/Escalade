<%@ page import="jdk.nashorn.internal.objects.AccessorPropertyDescriptor" %>
<%@ page import="proust.dev.escalade.hibernate.entities.Secteur" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Les secteurs</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<p>
    <a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>
    <a href="<%=request.getContextPath()+response.encodeURL("/add-secteur")%>/${spotId}">Ajouter un secteur</a>
</p>
<p>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
</p>
<p>
    <U>Liste des secteurs du site:</U></br></br>
    <table>
        <tr>
            <td>Spot</td>
            <td>Nom</td>
            <td>Descriptif</td>
            <td>Voir les voies</td>
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
<p>
    <U>Commentaires:</U></br>
    </br>
    <table>
        <tr>
            <td>Date</td>
            <td>Commentaire</td>
        </tr>
        <c:forEach items="${commentaire}" var="commentaire">
            <tr>
                <td><fmt:formatDate value="${commentaire.date}" pattern="MMMMM yyyy" /></td>
                <td>${commentaire.description}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="<%=request.getContextPath()+response.encodeURL("/add-commentaire")%>/${spotId}">Ajouter un commentaire</a></br>
</p>
</body>
</html>
