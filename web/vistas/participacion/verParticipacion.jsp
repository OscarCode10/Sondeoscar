<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../sesionC.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Participaciones</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <h1>Tus participaciones</h1>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">Fecha de Participacion</th>
                    <th scope="col">Número de Certificacíon</th>
                    <th scope="col">Pregunta</th>
                    <th scope="col">PDF</th>
                </tr>
            </thead>
            <c:forEach var="partiVO" items="${participacionesVO}">
                <tbody>
                    <tr>
                        <th scope="row">${partiVO.getNumeroCertificacion()}</th>
                        <td>${partiVO.getFechaGeneracion()}</td>
                        <td>${partiVO.getIdPreguntasTemasFK()}</td>
                        <td>
                            <form method="get" action="vistas/reportes/participacion.jsp" target="_blank">
                                <input type="hidden" name="idCiudadanoFK" value="${partiVO.getIdCiudadanoFK()}">
                                <input type="hidden" name="idPreguntasTemasFK" value="${partiVO.getIdPreguntasTemasFK()}">
                                <input type="submit" class="btn btn-primary" value="Generar Certificado"> 
                            </form>
                        </td>
                    </tr>
                </tbody>
            </c:forEach>
        </table>
        <a href="Ciudadano?opcion=volverDashC"><input type="submit" class="btn btn-primary" value="Volver"></a>
    </body>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>
