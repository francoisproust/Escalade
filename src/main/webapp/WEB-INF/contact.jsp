<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Mon contact</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
    <meta name="viewport" content="width=device-width,initial-scale=1" />
</head>
<body>
<a href="<%=request.getContextPath()+response.encodeURL("/")%>">Accueil</a>

<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
<p>
Le topo est est en attente de réservation, vous pouvez contacter: </br>
<c:out value="${email}"></c:out>
    </br>
Le contact validera ensuite la réservation.
</p>
</body>
</html>
