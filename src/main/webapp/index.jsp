<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <style>
            body{
                background: #ccccff;
            } 
        </style>
    </head>
    <body>
        <div class="container text-center">
            <h1 class="text-center">Aplicación Web - Pokemón</h1>
            <a href="${pageContext.request.contextPath}/pokemon-lista" class="btn btn-warning py-3 my-3">Ver listado de pokemones</a>
            <img src="https://media.redadn.es/imagenes/pokemaster_319996.jpg" alt="pokemón" class="img-fluid">
        </div>
    </body>
</html>