<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="Util.Conexion"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            File reporte = new File(application.getRealPath("ParticipacionCiu.jasper"));
            Map<String, Object> parametros = new HashMap<String, Object>();

            String idCiudadanoFK = request.getParameter("idCiudadanoFK");
            String idPreguntasTemasFK = request.getParameter("idPreguntasTemasFK");
            parametros.put("idCiudadanoFK", idCiudadanoFK);
            parametros.put("idPreguntasTemasFK", idPreguntasTemasFK);

            Conexion con = new Conexion();
            Connection objetoConexion = con.conectar();
            byte[] bytes = JasperRunManager.runReportToPdf(reporte.getPath(), parametros, objetoConexion);
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
            response.setHeader("Content-Disposition", "attachment; filename=\"reporte.pdf\";");
            ServletOutputStream salida = response.getOutputStream();
            salida.write(bytes, 0, bytes.length);
            salida.flush();
            salida.close();
        %>
    </body>
</html>
