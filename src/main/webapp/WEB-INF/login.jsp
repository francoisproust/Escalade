<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
<form method="post" action="login">
    <label for="username"><font color="white">Pseudo : </font></label></br>
    <input type="text" name="username" id="username" /></br>
    <label for="password"><font color="white"> Password : </font></label></br>
    <input type="text" name="password" id="password" /></br>
    <input type="submit" />
</form>
<p>
    Créer un compte:
    <a href="<%=request.getContextPath()+response.encodeURL("/creation-compte")%>">ici</a>
</p>
</body>
</html>