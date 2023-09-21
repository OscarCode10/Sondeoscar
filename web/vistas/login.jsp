<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="resources/css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <center>
        <input type="submit" class="btn btn-primary" name="" id="ciudadano" value="Ciudadano">
        <input type="submit" class="btn btn-primary" name="" id="administrador" value="Administrador"><br>
        </center>
        <!--Ciudadano -->
        <div class="ciuda">
            <div class="container mt-4">
                <center><h1>Iniciar Sesión Ciudadano</h1></center>
                <div class="d-flex justify-content-center">
                    <form method="post" action="Ciudadano">
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="basic-addon3">Correo Ciudadano</span>
                            </div>
                            <input type="email" name="textCorreo" class="form-control" aria-describedby="emailHelp" placeholder="Correo">
                        </div>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="basic-addon3">Contraseña Ciudadano</span>
                            </div>
                            <input type="password" name="textClave" class="form-control" placeholder="Contraseña">
                        </div>
                        <input type="submit" class="btn btn-primary" name="opcion" value="Iniciar">
                    </form>
                </div>
            </div>
        </div>
        <!--Administrador -->
        <div class="admin">
            <div class="container mt-4">
                <center><h1>Iniciar Sesión Administrador</h1></center>
                <div class="d-flex justify-content-center">
                    <form method="post" action="Administrador">
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="basic-addon3">Correo Administrador</span>
                            </div>
                            <input type="email" name="textCorreoAdministrador" class="form-control" aria-describedby="emailHelp"  placeholder="Correo">
                        </div>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="basic-addon3">Contraseña Administrador</span>
                            </div>
                            <input type="password" name="textPswdAdministrador" class="form-control" placeholder="Contraseña">
                        </div>
                        <input type="submit" class="btn btn-primary" name="opcion" value="Iniciar">
                    </form>
                </div>
            </div>
        </div>
        <a href="Ciudadano?opcion=Volver"><input type="submit" class="btn btn-primary" value="Volver"></a> 
    </body>
    <script src="resources/js/login.js" type="text/javascript"></script>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>
