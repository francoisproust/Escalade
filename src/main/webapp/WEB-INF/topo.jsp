<%@ page import="jdk.nashorn.internal.objects.AccessorPropertyDescriptor" %>
<%@ page import="proust.dev.escalade.hibernate.entities.Topo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des Topos</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
    <meta name="viewport" content="width=device-width,initial-scale=1" />
</head>
<body>
<a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>
<p>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
<table class="table">
    <tr>
        <td>Nom</td>
        <td>ISBN</td>
        <td>Parution</td>
        <td>Disponible</td>
        <td>utilisateur</td>
        <td>réserver le topo</td>
    </tr>
    <c:forEach items="${listerTopo}" var="listerTopo">
        <tr>
            <td>${listerTopo.nom}</td>
            <td>${listerTopo.isbn}</td>
            <td><fmt:formatDate value="${listerTopo.parution}" pattern="MMMMM yyyy" /></td>
            <td>${listerTopo.disponibilite}</td>
            <td>${listerTopo.utilisateur.pseudo}</td>
            <td>
                <c:if test="${listerTopo.disponibilite == 'disponible'}">
                    <a href="<%=request.getContextPath()+response.encodeURL("/reserver-topo")%>/${listerTopo.topoId}">Réserver</a>
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
</p>
</body>
</html>
