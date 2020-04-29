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
    <title>utilisateur</title>
    <link rel="stylesheet" href="css/style.css" />
</head>
<body>
    <p>
        bonjour je suis une JSP et je liste les utilisateurs de ma BDD
    </p>
    <p>
        <table>
            <tr>
                <td>pseudo</td>
                <td>nom</td>
                <td>prénom</td>
                <td>mail</td>
            </tr>
        <c:forEach items="${listeUtilisateur}" var="listeUtilisateur">
            <tr>
                <td>${listeUtilisateur.pseudo}</td>
                <td>${listeUtilisateur.nom}</td>
                <td>${listeUtilisateur.prenom}</td>
                <td>${listeUtilisateur.email}</td>
            </tr>
        </c:forEach>
        </table>
    </p>
    <p>

    </p>
</body>
</html>
