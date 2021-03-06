<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Mon profil</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
    <meta name="viewport" content="width=device-width,initial-scale=1" />
</head>
<body>
<a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>
<c:if test="${utilisateur.typeUser.libelleUser == 'administrateur' || utilisateur.typeUser.libelleUser == 'amis'}">
    <a href="<%=request.getContextPath()+response.encodeURL("/les-commentaires")%>">Les commentaires</a>
</c:if>
<p>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>

<p>
    <U>Mes informations personnelles:</U></br>
    Nom : ${utilisateur.nom} </br>
    Prénom : ${utilisateur.prenom} </br>
    Mail : ${utilisateur.email} </br>
</p>
<p>
    <U>Mes Topos</U></br>
    <table class="table">
        <tr>
            <td>Nom</td>
            <td>ISBN</td>
            <td>Parution</td>
            <td>Disponible</td>
            <td>valider la réservation</td>
            <td>rendre disponible</td>
        </tr>
        <c:forEach items="${topos}" var="listerTopo">
            <tr>
                <td>${listerTopo.nom}</td>
                <td>${listerTopo.isbn}</td>
                <td><fmt:formatDate value="${listerTopo.parution}" pattern="MMMMM yyyy" /></td>
                <td>${listerTopo.disponibilite}</td>
                <td>
                    <c:if test="${listerTopo.disponibilite == 'En attente'}">
                        <a href="<%=request.getContextPath()+response.encodeURL("/reserver-topo")%>/${listerTopo.topoId}">valider</a>
                    </c:if>
                </td>
                <td>
                    <c:if test="${listerTopo.disponibilite == 'En attente' || listerTopo.disponibilite == 'Réservé' }">
                        <a href="<%=request.getContextPath()+response.encodeURL("/dispo-topo")%>/${listerTopo.topoId}">valider</a>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
</p>
<p>
    <U>Mes Commentaires</U></br>
    <table class="table">
        <tr>
            <td>voir le site</td>
            <td>Commentaire</td>
            <td>modifier le commentaire</td>
            <td>supprimer le commentaire?</td>
        </tr>
        <c:forEach items="${commentaire}" var="commentaires">
            <tr>
                <td><a href="<%=request.getContextPath()+response.encodeURL("/voir-spot")%>/${commentaires.spotId}">ici</a></td>
                <td>${commentaires.description}</td>
                <td><a href="<%=request.getContextPath()+response.encodeURL("/modifier-commentaire")%>/${commentaires.comId}">ici</a></td>
                <td><a href="<%=request.getContextPath()+response.encodeURL("/supprimer-commentaire")%>/${commentaires.comId}">ici</a></td>
            </tr>
        </c:forEach>
    </table>
</p>
</body>
</html>
