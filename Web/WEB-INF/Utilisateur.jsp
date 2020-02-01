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
    <title>Utilisateur</title>
</head>
<body>
    <p>
        bonjour je suis une JSP
    </p>
    <p>
        <%
            //String attribut = (String) request.getAttribute("laVariableJsp");
            Object monUtilisateur = request.getAttribute("monUtilisateur");
            out.println(monUtilisateur.pseudo);
        %>

    </p>
</body>
</html>
