<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evolución Pokemón</title>
    </head>
    <body>
        <h1>Evolución de Pokemón</h1>

        <c:forEach items="${grupoEvolucion}" var="pokemon">
            <p>${pokemon.number}° ${pokemon.name}</p>
        </c:forEach>
    </body>
</html>
