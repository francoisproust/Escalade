<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Les amis de l'escalade</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
    <meta name="viewport" content="width=device-width,initial-scale=1" />

    <a href="<%=request.getContextPath()+response.encodeURL("/login")%>">Se connecter</a>
    <a href="<%=request.getContextPath()+response.encodeURL("/creation-compte")%>">Créer un compte</a>
    <a href="<%=request.getContextPath()+response.encodeURL("/mon-profil")%>">Mon compte</a>
    <a href="<%=request.getContextPath()+response.encodeURL("/add-topo")%>">Ajouter un Topo</a>
</head>
<body>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
    <div class="container-fluid">
            <div class="row">
                <article >
                    Bienvenue sur le site de notre association "les amis de l'escalade" qui a pour but de partager notre passion commune autour de l'escalade.
                    Ce site a pour but de partager les différents spots que nous avons et pour les membres inscrits de vous mettre en relation pour partager vos topos.
                    Bonne visite à tous!
                </article>
            </div>
    </div>
</body>
<footer>
    <a href="<%=request.getContextPath()+response.encodeURL("/topo")%>">Voir les topos</a>
    <a href="<%=request.getContextPath()+response.encodeURL("/spot")%>">Voir les spots</a>
</footer>
</html>
