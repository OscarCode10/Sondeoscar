package modelVO;

public class PreguntasTemasVO {

    public PreguntasTemasVO() {
    }
    private String idPreguntasTemas, tema, pregunta, fechaInicio, fechaFin, horaInicio, horaFin, opcionesRespuesta, idAdministradorFK;

    public String getIdPreguntasTemas() {
        return idPreguntasTemas;
    }

    public void setIdPreguntasTemas(String idPreguntasTemas) {
        this.idPreguntasTemas = idPreguntasTemas;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getOpcionesRespuesta() {
        return opcionesRespuesta;
    }

    public void setOpcionesRespuesta(String opcionesRespuesta) {
        this.opcionesRespuesta = opcionesRespuesta;
    }

    public String getIdAdministradorFK() {
        return idAdministradorFK;
    }

    public void setIdAdministradorFK(String idAdministradorFK) {
        this.idAdministradorFK = idAdministradorFK;
    }

    public PreguntasTemasVO(String idPreguntasTemas, String tema, String pregunta, String fechaInicio, String fechaFin, String horaInicio, String horaFin, String opcionesRespuesta, String idAdministradorFK) {
        this.idPreguntasTemas = idPreguntasTemas;
        this.tema = tema;
        this.pregunta = pregunta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.opcionesRespuesta = opcionesRespuesta;
        this.idAdministradorFK = idAdministradorFK;
    }
}
