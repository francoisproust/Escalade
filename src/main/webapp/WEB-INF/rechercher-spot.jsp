<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Rechercher spot</title>
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
            <form:form method="POST" modelAttribute="spotFormCriterias" action="rechercher-spot">
                <form:input type="text" path="localisation" class="form-control form-control-sm mb-3" placeholder="Localisation"
                            autofocus="true"/>


                <p>
                    cotation min:
                    <form:select path="cotationMin">
                        <c:forEach items="${listCotation}" var="cotation">
                            <form:option value="${cotation.cotationId}">${cotation.indice}</form:option>
                        </c:forEach>
                    </form:select>
                    </br>
                    cotation max:
                    <form:select path="cotationMax">
                        <c:forEach items="${listCotation}" var="cotation">
                            <form:option value="${cotation.cotationId}">${cotation.indice}</form:option>
                        </c:forEach>
                    </form:select>
                </p>
                <p>
                    Présence de plusieurs secteurs:
                    <form:checkbox path="multiSecteurs" value="oui"
                                   placeholder="Plusieurs secteurs?"/>
                </p>
                <form:input type="text" path="longueurMin" class="form-control form-control-sm mb-3" placeholder="Longueur minimale"/>

                <form:input type="" path="longueurMax" class="form-control form-control-sm mb-3" placeholder="Longueur maximale"/>

                <input type="submit" class="btn btn-success" value="Rechercher"/>
                <input type="reset" class="btn btn-danger" value="Reset"/>
                <a class="btn btn-warning" href="http://localhost:8080/Escalade/spot">Cancel</a>
            </form:form>
        </div>
    </div>
</div>
</body>