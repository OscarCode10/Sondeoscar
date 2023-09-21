package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelDAO.ParticipacionDAO;
import modelVO.ParticipacionVO;

@WebServlet(urlPatterns = {"/Participacion"})
public class ParticipacionController extends HttpServlet {

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
        String idParticipacion=request.getParameter("textIdParticipacion");
        String fechaGeneracion=request.getParameter("textFechaGeneracion");
        String numeroCertificacion=request.getParameter("textNumeroCertificacion");
        String respuestaPregunta=request.getParameter("textRespuestaPregunta");
        String idPreguntasTemasFK=request.getParameter("textIdPreguntasTemasFK");
        String idCiudadanoFK=request.getParameter("textIdCiudadanoFK");
        String opcion=request.getParameter("opcion");
        
        ParticipacionVO partiVO=new ParticipacionVO(idParticipacion, fechaGeneracion, numeroCertificacion, respuestaPregunta, idPreguntasTemasFK, idCiudadanoFK);
        ParticipacionDAO partiDAO=new ParticipacionDAO(partiVO);
        
        switch(opcion){
            case "Registrar":
                if (partiDAO.insertar()) {
                    request.getRequestDispatcher("PreguntasTemas?opcion=verSondeosC").forward(request, response);
                }else{
                    request.getRequestDispatcher("PreguntasTemas?opcion=registrar&textIdPreguntasTemas=${pre.getIdPreguntasTemas()}").forward(request, response);
                }
                break;
            case "verParticipaciones":
                List<ParticipacionVO> participacionesVO=partiDAO.verParticipaciones(idCiudadanoFK);
                if (participacionesVO!=null) {
                    request.setAttribute("participacionesVO", participacionesVO);
                    
                    request.getRequestDispatcher("vistas/participacion/verParticipacion.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("PreguntasTemas?opcion=verSondeosC").forward(request, response);
                }
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
