<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de pokemones</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <style>
            body{
                background: #ffcccc;
            } 
        </style>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center my-3">Listado de Pokemones</h1>
            <div class="row p-5">
                <c:forEach items="${listadoPokemones}" var="pokemon">
                    <div class="col-xs-12 col-sm-6 col-md-3 col-lg-2">
                        <div class="card">
                            <img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${pokemon.number}.png" class="card-img-top" alt="${pokemon.name}">
                            <div class="card-body">
                                <h5 class="card-title text-center text-capitalize">${pokemon.name}</h5>
                                <a href="${pageContext.request.contextPath}/pokemon-detalle?id=${pokemon.number}" class="btn btn-primary">Ver detalle</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <div class="text-center">
                <div class="btn-group">
                    <c:if test="${offsetAnterior != null}">
                        <a href="${pageContext.request.contextPath}/pokemon-lista?offset=${offsetAnterior}" class="btn btn-primary">Anterior</a>
                    </c:if>
                    <c:if test="${offsetSiguiente != null}">
                        <a href="${pageContext.request.contextPath}/pokemon-lista?offset=${offsetSiguiente}" class="btn btn-primary">Siguiente</a>
                    </c:if>
                </div>                
            </div>
        </div>
    </body>
</html>
