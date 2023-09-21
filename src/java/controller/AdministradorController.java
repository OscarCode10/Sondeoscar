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
import modelDAO.AdministradorDAO;
import modelVO.AdministradorVO;

@WebServlet(name = "AdministradorController", urlPatterns = {"/Administrador"})
public class AdministradorController extends HttpServlet {

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
        String idAdministrador=request.getParameter("textIdAdministrador");
        String nombreCompletoAdministrador=request.getParameter("textNombreCompletoAdministrador");
        String apellidoAdministrador=request.getParameter("textApellidoAdministrador");
        String correoAdministrador=request.getParameter("textCorreoAdministrador");
        String pswdAdministrador=request.getParameter("textPswdAdministrador");
        String opcion=request.getParameter("opcion");
        
        AdministradorVO adminVO=new AdministradorVO(idAdministrador, nombreCompletoAdministrador, apellidoAdministrador, correoAdministrador, pswdAdministrador);
        AdministradorDAO adminDAO=new AdministradorDAO(adminVO);

        switch(opcion){
            case "Iniciar":
                if (adminDAO.inicioAdmin(correoAdministrador, pswdAdministrador)) {
                    HttpSession sesion=request.getSession(true);
                    AdministradorVO datosSesion=adminDAO.datosSesion(correoAdministrador);
                    sesion.setAttribute("datosSesion", datosSesion);
                    request.getRequestDispatcher("PreguntasTemas?opcion=verSondeosA").forward(request, response);
                }else{
                    request.getRequestDispatcher("vistas/login.jsp").forward(request, response);
                }
                break;
            case "registrar":
                request.getRequestDispatcher("vistas/preguntasTemas/registrarPre.jsp").forward(request, response);
                break;
            case "dashAdmin":
                request.getRequestDispatcher("vistas/administrador/dashboardAdmin.jsp").forward(request, response);
                break;
            case "volverDashA":
                request.getRequestDispatcher("PreguntasTemas?opcion=verSondeosA").forward(request, response);
                break;
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
