<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evolución Pokemón</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
         <style>
            body{
                background: #ccccff;
            } 
        </style>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">Cadena de evolución</h1>
            <div class="row">
                <c:forEach items="${grupoEvolucion}" var="pokemon">
                    <div class="col-md-4">
                        <div class="card">
                            <img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${pokemon.number}.png" class="card-img-top" alt="${pokemon.name}">
                            <div class="card-body">
                                <h5 class="card-title">${pokemon.name}</h5>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <p><a href="${pageContext.request.contextPath}/pokemon-lista" class="btn btn-danger">Ver listado de pokemones</a></p>
        </div>
    </body>
</html>
