<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalle Pokemón</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <style>
            body{
                background: #ccffcc;
            } 
        </style>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center text-capitalize">${nombre}</h1>
            <div class="row">
                <div class="col-xs-12 col-sm-7 col-md-9 col-lg-7">
                    <img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${id}.png" alt="${nombre}" class="img-fluid">                    
                </div>                
                <div class="col-xs-12 col-sm-5 col-md-3 col-lg-5">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">${id}</h5>
                            <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                            <p class="card-text">Peso: ${peso}</p>
                            <p class="card-text">Altura: ${altura}</p>
                            <p class="card-text">Tipo: </p>
                            <ul>
                                <c:forEach items="${tipos}" var="tipo">
                                    <li>${tipo.type.name}</li>
                                </c:forEach>
                            </ul>
                            <p class="card-text">Estadísticas: </p>
                            <ul>
                                <c:forEach items="${estadisticas}" var="estadistica">
                                    <li>${estadistica.stat.name}</li>
                                </c:forEach>
                            </ul>
                            <p class="card-text">Habilidades </p>
                            <ul>
                                <c:forEach items="${habilidades}" var="habilidad">
                                    <li>${habilidad.ability.name}</li>
                                </c:forEach>
                            </ul>
                            <a href="${pageContext.request.contextPath}/pokemon-evolucion?id=1" class="btn btn-warning">Ver evolución</a>
                        </div>
                    </div>
                </div>                
            </div>
            <p><a href="${pageContext.request.contextPath}/pokemon-lista" class="btn btn-danger">Ver listado de pokemones</a></p>
        </div>
    </body>
</html>
