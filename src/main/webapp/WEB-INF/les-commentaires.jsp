<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Mon profil</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>
<p>
<h1 class="logo">
    <img src="css/logo.png">
</h1>
<p>
    <U>Les Commentaires</U></br>
    <table>
        <tr>
            <td>voir le site</td>
            <td>Commentaire</td>
            <td>modifier le commentaire</td>
            <td>supprimer le commentaire?</td>
        </tr>
        <c:forEach items="${lesCommentaires}" var="commentaires">
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
