<%@page import="modelVO.CiudadanoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SesionC</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <%
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
            response.setDateHeader("Expires", 0);
        %>
        <%
            HttpSession encontrarSession=request.getSession();
            if(encontrarSession.getAttribute("datosSesion")!=null){
                CiudadanoVO ciuVO=new CiudadanoVO();
                ciuVO=(CiudadanoVO)encontrarSession.getAttribute("datosSesion");
                request.setAttribute("ciuVO", ciuVO);
                String idCiudadano=ciuVO.getIdCiudadano();
                request.setAttribute("idCiudadano", idCiudadano);
            }else{
                request.getRequestDispatcher("../login.jsp").forward(request, response);
            }
        %>
        <form method="post" action="Sesiones">
            <input type="submit" class="btn btn-primary" value="Cerrar Sesión">
        </form>
    </body>
</html>
