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
    <title>Liste des secteurs</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<p class="ajouter">
    <a href="<%=request.getContextPath()+response.encodeURL("/add-secteur")%>">Ajouter un secteur</a>
</p>
<p>
<h1>Liste des Secteurs</h1>
<table>
    <tr>
        <td></td>
        <td>Nom</td>
        <td>Descriptif</td>
        <td>Spots</td>
        <td>nombre de voies</td>
    </tr>
    <c:forEach items="${listerSecteur}" var="listerSecteur">
        <tr>
            <td>${listerSecteur.spot}</td>
            <td>${listerSecteur.nom}</td>
            <td>${listerSecteur.designation}</td>
            <td></td>
        </tr>
    </c:forEach>
</table>
</p>
</body>
</html>
