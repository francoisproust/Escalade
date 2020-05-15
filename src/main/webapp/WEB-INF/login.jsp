<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<form:form method="POST" modelAttribute="utilisateur" action="./login">
    <form:input type="text" path="pseudo" class="form-control form-control-sm mb-3"
                placeholder="Pseudo"/>

    <form:input type="password" path="password" class="form-control form-control-sm mb-3"
                placeholder="Mot De Passe"/>
    <input type="submit" class="btn btn-success" value="Se connecter"/>
    <input type="reset" class="btn btn-danger" value="Reset"/>
    <a class="btn btn-danger" href="./">Cancel</a>
</form:form>
<p>
    Créer un compte:
    <a href="<%=request.getContextPath()+response.encodeURL("/creation-compte")%>">ici</a>
</p>
</body>
</html>