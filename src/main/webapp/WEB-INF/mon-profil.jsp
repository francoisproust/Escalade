<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Mon profil</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>

<p>
<h1 class="logo">
    <img src="css/logo.png">
</h1>

<p>
    <U>Mes informations personnelles:</U></br>
    Nom : ${utilisateur.nom} </br>
    Prénom : ${utilisateur.prenom} </br>
    Mail : ${utilisateur.email} </br>
</p>
<p>
    <U>Mes Topos</U></br>
    <table>
        <tr>
            <td>Nom</td>
            <td>ISBN</td>
            <td>Parution</td>
            <td>Disponible</td>
            <td>valider la réservation</td>
        </tr>
        <c:forEach items="${topos}" var="listerTopo">
            <tr>
                <td>${listerTopo.nom}</td>
                <td>${listerTopo.isbn}</td>
                <td><fmt:formatDate value="${listerTopo.parution}" pattern="MMMMM yyyy" /></td>
                <td>${listerTopo.disponibilite}</td>
                <td>
                    <c:if test="${listerTopo.disponibilite == 'En attente'}">
                        <c:set var="statut" value="indisponible"></c:set>
                        <a href="<%=request.getContextPath()+response.encodeURL("/reserver-topo")%>/${listerTopo.topoId}">valider</a>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
</p>
</body>
</html>
