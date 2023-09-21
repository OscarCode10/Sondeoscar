<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/login.css" rel="stylesheet" type="text/css"/>
        <title>Inicio</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor02" aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarColor02">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                          <a class="nav-link" href="Ciudadano?opcion=registrar">Formulario de registro</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="Ciudadano?opcion=login">Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Pricing</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">About</a>
                    </li>
                </ul>
                <form class="form-inline">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>
        <div class="jumbotron">
            <h1 class="display-4">Hola Ciudadanos</h1>
            <p class="lead">Podrás responder preguntas con temas específicos sobre nuestra sociedad</p>
            <hr class="my-4">
            <p>Queremos saber tu opinion sobre temas de nuestro país para mejorar.</p>
            <p class="lead">
                <a class="btn btn-primary btn-lg" href="Ciudadano?opcion=registrar" role="button">¿No tienes cuenta? Registraté</a>
                <a class="btn btn-primary btn-lg" href="Ciudadano?opcion=login" role="button">Inicia Sesión</a>
            </p>
        </div>        
        <h1>¿Te gusta el awa?</h1>
        <h3>No</h3>
        <div class="progress">
            <div class="progress-bar progress-bar-striped" role="progressbar" style="width: 30%" aria-valuenow="10" aria-valuemin="0" aria-valuemax="100">30%</div>
        </div><br>
        <h3>Si</h3>
        <div class="progress">
            <div class="progress-bar progress-bar-striped bg-success" role="progressbar" style="width: 75%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100">70%</div>
        </div><br>
        <img  class="rounded mx-auto d-block" src="resources/img/image-769467fc-616c-457e-b347-463953748604.jpeg" alt="Card image cap">
    </body>1
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>
