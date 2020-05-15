<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Les amis de l'escalade</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<p>
    <a href="<%=request.getContextPath()+response.encodeURL("/login")%>">Se connecter</a>
    <a href="<%=request.getContextPath()+response.encodeURL("/creation-compte")%>">Créer un compte</a>
</p>
<h1 class="logo">
    <img src="css/logo.png">
</h1>
<p class="home">
    Bienvenue sur le site de notre association "les amis de l'escalade" qui a pour but de partager notre passion commune autour de l'escalade.<br/>
    Ce site a pour but de partager les différents spots que nous avons et pour les membres inscrits de vous mettre en relation pour partager vos topos. <br/>
    Bonne visite à tous!
</p>
<p>
    <a href="<%=request.getContextPath()+response.encodeURL("/spot")%>">Voir les spots</a>
</p>

</body>
</html>
