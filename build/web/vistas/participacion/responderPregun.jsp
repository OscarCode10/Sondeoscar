<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../sesionC.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Responder Pregunta</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <form action="Participacion" method="post">
            <h1>${preguntaVO.getTema()}</h1>
            <h2>${preguntaVO.getPregunta()}</h2>
            <div class="form-group">
                <label>Respuesta</label>
                <input type="text" name="textRespuestaPregunta" placeholder="Respuesta" required>
            </div>
            <div class="form-group">
                <input type="hidden" name="textIdPreguntasTemasFK" value="${preguntaVO.getIdPreguntasTemas()}" readonly>
            </div>
            <div class="form-group">
                <input type="hidden" name="textIdCiudadanoFK" value="${idCiudadano}">
            </div>
            <input type="submit" name="opcion" class="btn btn-primary" value="Registrar">
        </form>
        <a href="Ciudadano?opcion=volverDashC"><input type="submit" class="btn btn-primary" value="Volver"></a>
    </body>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>
