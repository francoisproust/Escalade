<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Les Commentaires</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
<p>
    <U>Les Commentaires</U></br>
    <table class="table">
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
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
</body>
</html>
