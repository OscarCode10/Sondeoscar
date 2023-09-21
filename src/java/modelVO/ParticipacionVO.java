package modelVO;

public class ParticipacionVO {
    
    private String idParticipacion, fechaGeneracion, numeroCertificacion, respuestaPregunta, idPreguntasTemasFK, idCiudadanoFK;
    
    public ParticipacionVO() {
    }

    public ParticipacionVO(String idParticipacion, String fechaGeneracion, String numeroCertificacion, String respuestaPregunta, String idPreguntasTemasFK, String idCiudadanoFK) {
        this.idParticipacion = idParticipacion;
        this.fechaGeneracion = fechaGeneracion;
        this.numeroCertificacion = numeroCertificacion;
        this.respuestaPregunta = respuestaPregunta;
        this.idPreguntasTemasFK = idPreguntasTemasFK;
        this.idCiudadanoFK = idCiudadanoFK;
    }

    public String getIdParticipacion() {
        return idParticipacion;
    }

    public void setIdParticipacion(String idParticipacion) {
        this.idParticipacion = idParticipacion;
    }

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getNumeroCertificacion() {
        return numeroCertificacion;
    }

    public void setNumeroCertificacion(String numeroCertificacion) {
        this.numeroCertificacion = numeroCertificacion;
    }

    public String getRespuestaPregunta() {
        return respuestaPregunta;
    }

    public void setRespuestaPregunta(String respuestaPregunta) {
        this.respuestaPregunta = respuestaPregunta;
    }

    public String getIdPreguntasTemasFK() {
        return idPreguntasTemasFK;
    }

    public void setIdPreguntasTemasFK(String idPreguntasTemasFK) {
        this.idPreguntasTemasFK = idPreguntasTemasFK;
    }

    public String getIdCiudadanoFK() {
        return idCiudadanoFK;
    }

    public void setIdCiudadanoFK(String idCiudadanoFK) {
        this.idCiudadanoFK = idCiudadanoFK;
    }
}
