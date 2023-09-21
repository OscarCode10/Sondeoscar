package modelVO;

import java.util.HashSet;

public class AdministradorVO {

    public AdministradorVO() {
    }
    private String idAdministrador, nombreCompletoAdministrador, apellidoAdministrador, correoAdministrador, pswdAdministrador;

    public AdministradorVO(String idAdministrador, String nombreCompletoAdministrador, String apellidoAdministrador, String correoAdministrador, String pswdAdministrador) {
        this.idAdministrador = idAdministrador;
        this.nombreCompletoAdministrador = nombreCompletoAdministrador;
        this.apellidoAdministrador = apellidoAdministrador;
        this.correoAdministrador = correoAdministrador;
        this.pswdAdministrador = pswdAdministrador;
    }
    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreCompletoAdministrador() {
        return nombreCompletoAdministrador;
    }

    public void setNombreCompletoAdministrador(String nombreCompletoAdministrador) {
        this.nombreCompletoAdministrador = nombreCompletoAdministrador;
    }

    public String getApellidoAdministrador() {
        return apellidoAdministrador;
    }

    public void setApellidoAdministrador(String apellidoAdministrador) {
        this.apellidoAdministrador = apellidoAdministrador;
    }

    public String getCorreoAdministrador() {
        return correoAdministrador;
    }

    public void setCorreoAdministrador(String correoAdministrador) {
        this.correoAdministrador = correoAdministrador;
    }

    public String getPswdAdministrador() {
        return pswdAdministrador;
    }

    public void setPswdAdministrador(String pswdAdministrador) {
        this.pswdAdministrador = pswdAdministrador;
    }
}
