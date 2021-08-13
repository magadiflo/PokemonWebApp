<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de pokemones</title>
    </head>
    <body>
        <h1>Listado de pokemones</h1>

        <c:forEach items="${listadoPokemones}" var="pokemon">
            <p>${pokemon.number}° ${pokemon.name} - ${pokemon.url}</p>
        </c:forEach>

        <c:if test="${offsetAnterior != null}">
            <a href="${pageContext.request.contextPath}/pokemon-lista?offset=${offsetAnterior}">Anterior</a>
        </c:if>
        <c:if test="${offsetSiguiente != null}">
            <a href="${pageContext.request.contextPath}/pokemon-lista?offset=${offsetSiguiente}"">Siguiente</a>
        </c:if>            

    </body>
</html>
