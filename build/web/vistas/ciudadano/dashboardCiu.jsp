<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../sesionC.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Dashboard</title>
    </head>
    <body>
        <%
            String mensaje=(String)request.getAttribute("mensaje");
        %>
        
        <c:if test="${mensaje eq !null}">
            <script>
                alert(`${mensaje}`)
            </script>
        </c:if>
        <h1>Hola ciudadano</h1>
        <a href="Participacion?opcion=verParticipaciones&textIdCiudadanoFK=1" class="btn btn-primary">Ver mis participaciones</a>
        <div class="row">
            <c:forEach var="pre" items="${preguntasVOC}">
                <div class="col-sm-6">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">${pre.getTema()}</h5>
                            <p class="card-text">${pre.getPregunta()}</p>
                            <p class="card-text">${pre.getFechaFin()}</p>
                            <p class="card-text">${pre.getHoraFin()}</p>
                            <p class="card-text">${pre.getIdAdministradorFK()}</p>
                            <a href="PreguntasTemas?opcion=registrar&textIdPreguntasTemas=${pre.getIdPreguntasTemas()}" class="btn btn-primary">Responder</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>
