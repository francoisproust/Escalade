<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Les longueurs</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<p>
    <a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>
    <a href="<%=request.getContextPath()+response.encodeURL("/add-longueur")%>/${voieId}">Ajouter une longueur</a>
</p>
<p>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
<table>
    <tr>
        <td>Voir les voies</td>
        <td>Nom</td>
        <td>Descriptif</td>
        <td>Longueur</td>
        <td>nombre de spits</td>
        <td>cotation</td>
    </tr>
    <c:forEach items="${voirLongueur}" var="voirLongueur">
        <tr>
            <td><a href="<%=request.getContextPath()+response.encodeURL("/voir-voie")%>/${voirLongueur.voie.voieId}">ici</a></td>
            <td>${voirLongueur.nom}</td>
            <td>${voirLongueur.designation}</td>
            <td>${voirLongueur.tailleLongueur}</td>
            <td>${voirLongueur.spits}</td>
            <td>${voirLongueur.cotation.indice}</td>
        </tr>
    </c:forEach>
</table>
</p>
</body>
</html>
