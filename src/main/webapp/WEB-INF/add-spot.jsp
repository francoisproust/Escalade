<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Ajouter spot</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
    <meta name="viewport" content="width=device-width,initial-scale=1" />
</head>
<body>
<h1 class="logo">
    <img src="<%=request.getContextPath()%>/css/logo.png">
</h1>
    <div class="container-fluid">
        <div class="container">
            <div class="row">
            <form:form method="POST" modelAttribute="spot" action="add-spot">
                <form:input type="text" path="nom" class="form-control form-control-sm mb-3" placeholder="Nom"
                            autofocus="true"/>

                <form:input type="text" path="localisation" class="form-control form-control-sm mb-3"
                            placeholder="Localisation"/>

                <form:input type="text" path="descriptif" class="form-control form-control-sm mb-3" placeholder="Descriptif"/>

                <form:input type="text" path="secteurs" class="form-control form-control-sm mb-3"
                            placeholder="Nombre de secteurs"/>
                <p>
                    <c:if test="${type == 'administrateur' || type == 'amis'}">
                        Membre de l'association:
                        <form:checkbox path="flagAsso" value="oui" placeholder="Flag Association"/>
                    </c:if>
                </p>
                <input type="submit" class="btn btn-success" value="Ajouter"/>
                <input type="reset" class="btn btn-danger" value="Reset"/>
                <a class="btn btn-warning" href="http://localhost:8080/Escalade/spot">Cancel</a>
            </form:form>
            </div>
        </div>
    </div>
</body>