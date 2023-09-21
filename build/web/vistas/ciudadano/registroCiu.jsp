<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>
    
    <body>
        <style>
            body{
                background-color: #E9ECEF;
            }
            .bg-beige {
                background-color: #76ABD9;
                padding: 2rem;
                border-radius: 1rem;
            }
            .formu{
                color: #303030;
            }
        </style>
        <center><h1 class="formu">Formulario Registro</h1></center>
        <div class="container mt-4">
            <div class="d-flex justify-content-center bg-beige">
                <form method="post" action="Ciudadano">
                    <form method="post" action="Ciudadano">
                        <!--Tipo y numero de documento-->
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="">Tipo y número de documento</span>
                            </div>
                            <select class="custom-select" id="inputGroupSelect01" name="textTipoDocumento">
                                <option selected>Tipo de Documento</option>
                                <option value="C.C.">Cédula de ciudadanía</option>
                                <option value="T.I.">Tarjeta de identidad</option>
                                <option value="C.E.">Cédula de extranjería</option>
                            </select>
                            <input type="number" class="form-control" name="textNumeroDocumento" placeholder="Número de documento" required>
                        </div><br>
                        <!--Nombre Completo con apellidos-->
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="">Nombres y Apellidos</span>
                            </div>
                            <input type="text" class="form-control" name="textNombreCompleto" id="exampleFormControlInput1" placeholder="Nombre completo" required>
                            <input type="text" class="form-control" name="textApellidos" id="exampleFormControlInput1" placeholder="Apellidos" required>
                        </div><br>
                        <!--Genero-->
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <label class="input-group-text" for="">Género</label>
                            </div>
                            <select class="custom-select" name="textGenero">
                                <option selected>Género</option>
                                <option value="Hombre">Hombre</option>
                                <option value="Mujer">Mujer</option>
                                <option value="Intersexual">Intersexual</option>
                                <option value="Indefinido">Indefinido</option>
                                <option value="Prefieren no decir">Prefieren no decir</option>
                            </select>
                        </div>
                        <!--Telefonos Celular y fijo -->
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="">Teléfonos</span>
                            </div>
                            <input type="number" class="form-control" name="textTelefonoCelular" id="exampleFormControlInput1" placeholder="Teléfono celular" required>
                            <input type="number" class="form-control" name="textTelefonoFijo" id="exampleFormControlInput1" placeholder="Teléfono fijo" required>
                        </div><br>
                        <!--Correo -->
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="basic-addon3">Correo</span>
                            </div>
                            <input type="email" class="form-control" name="textCorreo" id="exampleFormControlInput1" placeholder="Correo" required>
                        </div>
                        <!--Contraseña-->
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="basic-addon3">Contraseña</span>
                            </div>
                            <input type="password" class="form-control" name="textClave" id="exampleFormControlInput1" placeholder="Contraseña" required>
                        </div>
                        <!--Municipio y direccion-->
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="">Ubicación</span>
                            </div>
                            <input type="text" class="form-control" name="textMunicipio" placeholder="Municipio" required>
                            <input type="text" class="form-control" name="textDireccion" placeholder="Dirección" required>
                            <input type="text" class="form-control" name="textBarrioVereda" placeholder="Barrio-Vereda" required>
                        </div><br>
                        <!--Fecha Nacimiento -->
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="basic-addon3">Fecha de Nacimiento</span>
                            </div>
                            <input type="date" class="form-control" name="textFechaNacimiento" placeholder="AAAA-MM-DD" required>
                        </div>
                        <!-- Etnia y condición de discapacidad -->
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="">Otros datos</span>
                            </div>
                            <input type="text" class="form-control" name="textEtnia" placeholder="Etnia" required>
                            <input type="text" class="form-control" name="textCondicionDiscapacidad" placeholder="Condicion de discapacidad" required>
                            <select class="custom-select" name="textRegimenAfiliacion">
                                <option selected>Tipo de Régimen de Afiliación</option>
                                <option value="Subsidiado">Subsidiado</option>
                                <option value="Contribuido">Contribuido</option>
                            </select>
                        </div><br>
                        <!--Estrato y nivel educativo-->
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="">Estrato y nivel educativo</span>
                            </div>
                            <input type="number" class="form-control" name="textEstrato" placeholder="Estrato de residencia" required>
                            <input type="text" class="form-control" name="textNivelEducativo" placeholder="Último nivel educativo" required>
                        </div><br>
                        <!--Acceso Teconologico-->
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="">Accesos Tecnológicos</span>
                            </div>
                            <select class="custom-select" name="textAccesoTecnologico">
                                <option selected>¿Cuenta con acceso a dispositivos tecnológicos?</option>
                                <option value="Si">Sí</option>
                                <option value="No">No</option>
                            </select>
                            <select class="custom-select" name="textCualAccesoTecnologico">
                                <option selected>Si, la respuesta fue afirmativa ¿cuál o cuáles?</option>
                                <option value="T-Movil">T-Movil</option>
                                <option value="Computador">Computador</option>
                                <option value="Tablet">Tablet</option>
                                <option value="Otro-¿Cuál">Otro-¿Cuál?</option>
                            </select>
                            <select class="custom-select" name="textConecitividadInternet">
                                <option selected>¿Cuenta con conectividad a internet?</option>
                                <option value="Si">Sí</option>
                                <option value="No">No</option>
                            </select>
                        </div><br>
                        <center><input type="submit" class="btn btn-secondary" name="opcion" value="Registrar"></center>
                    </form>
                </form>
            </div>
        </div>
    <a href="Ciudadano?opcion=Volver"><input type="submit" class="btn btn-primary" value="Volver"></a> 
    </body>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>

