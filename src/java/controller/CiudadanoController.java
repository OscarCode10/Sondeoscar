/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelDAO.CiudadanoDAO;
import modelVO.CiudadanoVO;

/**
 *
 * @author Jhon Herrera
 */
@WebServlet(name = "CiudadanoController", urlPatterns = {"/Ciudadano"})
public class CiudadanoController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String idCiudadano = request.getParameter("textIdCiudadano");
        String tipoDocumento = request.getParameter("textTipoDocumento");
        String numeroDocumento = request.getParameter("textNumeroDocumento");
        String nombreCompleto = request.getParameter("textNombreCompleto");
        String apellidos = request.getParameter("textApellidos");
        String genero = request.getParameter("textGenero");
        String telefonoCelular = request.getParameter("textTelefonoCelular");
        String telefonoFijo = request.getParameter("textTelefonoFijo");
        String correo = request.getParameter("textCorreo");
        String clave = request.getParameter("textClave");
        String municipio = request.getParameter("textMunicipio");
        String direccion = request.getParameter("textDireccion");
        String barrioVereda = request.getParameter("textBarrioVereda");
        String fechaNacimiento = request.getParameter("textFechaNacimiento");
        String etnia = request.getParameter("textEtnia");
        String condicionDiscapacidad = request.getParameter("textCondicionDiscapacidad");
        String estrato = request.getParameter("textEstrato");
        String nivelEducativo = request.getParameter("textNivelEducativo");
        String accesoTecnologico = request.getParameter("textAccesoTecnologico");
        String cualAccesoTecnologico = request.getParameter("textCualAccesoTecnologico");
        String conecitividadInternet = request.getParameter("textConecitividadInternet");
        String regimenAfiliacion = request.getParameter("textRegimenAfiliacion");
        String opcion = request.getParameter("opcion");

        CiudadanoVO ciuVO = new CiudadanoVO(idCiudadano, tipoDocumento, numeroDocumento, nombreCompleto, apellidos, genero, telefonoCelular, telefonoFijo, correo, clave, municipio, direccion,
                barrioVereda, fechaNacimiento, etnia, condicionDiscapacidad, estrato, nivelEducativo, accesoTecnologico, cualAccesoTecnologico, conecitividadInternet, regimenAfiliacion);
        CiudadanoDAO ciuDAO = new CiudadanoDAO(ciuVO);
        
        switch (opcion) {
            case "Volver":
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case "registrar":
                request.getRequestDispatcher("vistas/ciudadano/registroCiu.jsp").forward(request, response);
                break;
            case "Registrar":
                if (ciuDAO.insertar()) {
                    request.getRequestDispatcher("vistas/login.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("vistas/ciudadano/registroCiu.jsp").forward(request, response);
                }
                break;
            case "login":
                request.getRequestDispatcher("vistas/login.jsp").forward(request, response);
                break;
            case "Iniciar":
                if (ciuDAO.inicioSesion(correo, clave)) {
                    HttpSession sesion=request.getSession(true);
                    CiudadanoVO datosSesion=ciuDAO.datosSesion(correo);
                    sesion.setAttribute("datosSesion", datosSesion);
                    request.getRequestDispatcher("PreguntasTemas?opcion=verSondeosC").forward(request, response);
                } else {
                    request.getRequestDispatcher("vistas/login.jsp").forward(request, response);
                }
                break;
            case "volverDashC":
                request.getRequestDispatcher("PreguntasTemas?opcion=verSondeosC").forward(request, response);
                break;
            /*case "actualizar":
                if (ciuDAO.actualizar()) {
                    request.setAttribute("mensajeExito", "Actualización exitosa");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "Actualización incorrecta");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }*/
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
