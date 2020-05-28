<%@ page import="jdk.nashorn.internal.objects.AccessorPropertyDescriptor" %>
<%@ page import="proust.dev.escalade.hibernate.entities.Topo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des Topos</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>
<p>
<h1 class="logo">
    <img src="css/logo.png">
</h1>
<table>
    <tr>
        <td>Nom</td>
        <td>ISBN</td>
        <td>Parution</td>
        <td>Disponible</td>
        <td>utilisateur</td>
    </tr>
    <c:forEach items="${listerTopo}" var="listerTopo">
        <tr>
            <td>${listerTopo.nom}</td>
            <td>${listerTopo.isbn}</td>
            <td>${listerTopo.parution}</td>
            <td>${listerTopo.disponibilite}</td>
            <td>${listerTopo.utilisateur.pseudo}</td>
        </tr>
    </c:forEach>
</table>
</p>
</body>
</html>
