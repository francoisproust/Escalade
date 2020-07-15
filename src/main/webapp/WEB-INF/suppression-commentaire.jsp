<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Mon profil</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
    <meta name="viewport" content="width=device-width,initial-scale=1" />
</head>
    <p>
        <a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>
    </p>
    <h1 class="logo">
        <img src="<%=request.getContextPath()%>/css/logo.png">
    </h1>
    <p>
        Le commentaire est supprimé </br>
        <a href="<%=request.getContextPath()+response.encodeURL("/mon-profil")%>">revenir sur mon compte</a>
    </p>
</body>
</html>
