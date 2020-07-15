<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: S636789
  Date: 27/01/2020
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>longueur</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<p class="ajouter">
    <a href="<%=request.getContextPath()+response.encodeURL("add-longueur")%>">Ajouter une longueur</a>
</p>
<p>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
<table>
    <tr>
        <td>Nom</td>
        <td>Désignation</td>
        <td>Longueur</td>
        <td>Spits</td>
        <td>Cotation</td>
    </tr>
    <c:forEach items="${listeLongueur}" var="listeLongueur">
        <tr>
            <td>${listeUtilisateur.nom}</td>
            <td>${listeUtilisateur.designation}</td>
            <td>${listeUtilisateur.tailleLongueur}</td>
            <td>${listeUtilisateur.spits}</td>
            <td>${listeUtilisateur.cotation}</td>
        </tr>
    </c:forEach>
</table>
</p>
<p>

</p>
</body>
</html>
