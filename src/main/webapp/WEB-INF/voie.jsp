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
    <title>Liste des voies</title>
    <link rel="stylesheet" href="style.css" />
</head>
<body>
<p class="ajouterVoie">
    <a href="<%=request.getContextPath()+response.encodeURL("/add-voie")%>">Ajouter une voie</a>
</p>
<p>
<h1>Liste des voies</h1>
<table>
    <tr>
        <td>Nom</td>
        <td>Descriptif</td>
        <td>relai</td>
        <td>nbRelai</td>
        <td>Nombre de longueurs</td>
    </tr>
    <c:forEach items="${listerVoie}" var="listerVoie">
        <tr>
            <td>${listerVoie.nom}</td>
            <td>${listerVoie.designation}</td>
            <td>${listerVoie.relai}</td>
            <td>${listerVoie.nbRelai}</td>
            <td>${listerVoie.longueurs}</td>
        </tr>
    </c:forEach>
</table>
</p>
</body>
</html>
