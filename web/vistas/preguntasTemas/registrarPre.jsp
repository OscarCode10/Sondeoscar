<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../sesionA.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar preguntas</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <form action="PreguntasTemas" method="post">
            <h1>Registro de Temas</h1>
            <div class="form-group">
                <label>Tema</label><br>
                <input type="text" name="textTema" placeholder="Tema">
            </div>
            <div class="form-group">
                <label>Pregunta</label><br>
                <input type="text" name="textPregunta" placeholder="Pregunta">
            </div>
            <div class="form-group">
                <label>Fecha de inicio</label><br>
                <input type="date" name="textFechaInicio" placeholder="Fecha de inicio">
            </div>
            <div class="form-group">
                <label>Fecha fin</label><br>
                <input type="date" name="textFechaFin" placeholder="Fecha fin">
            </div>
            <div class="form-group">
                <label>Hora de inicio</label><br>
                <input type="time" name="textHoraInicio" placeholder="Hora de inicio">
            </div>
            <div class="form-group">
                <label>Hora de fin</label><br>
                <input type="time" name="textHoraFin" placeholder="Hora de fin">
            </div>
            <div class="form-group">
                <label>Opciones de respuesta</label><br>
                <select name="textOpcionesRespuesta">
                    <option value="No">No</option>
                    <option value="Sí">Sí</option>
                </select>
            </div>
            <div class="form-group">
                <input type="hidden" name="textIdAdministradorFK" value="${idAdministrador}">
            </div>
            <input type="submit" name="opcion" value="Registrar">
        </form>
        <a href="Administrador?opcion=volverDashA"><input type="submit" class="btn btn-primary" value="Volver"></a>
    </body>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>
