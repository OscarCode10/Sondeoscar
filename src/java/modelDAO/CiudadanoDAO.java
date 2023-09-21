package modelDAO;

import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelVO.CiudadanoVO;

public class CiudadanoDAO extends Conexion implements Crud{
    private Connection con=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private boolean operacion=false;
    private String sql;
    
     private String idCiudadano, tipoDocumento, numeroDocumento, nombreCompleto, apellidos, genero, telefonoCelular, telefonoFijo, correo, clave, municipio,
            direccion, barrioVereda, fechaNacimiento, etnia, condicionDiscapacidad, estrato, nivelEducativo, accesoTecnologico, cualAccesoTecnologico, 
            conecitividadInternet, regimenAfiliacion;
    
    public CiudadanoDAO(CiudadanoVO ciuVO){
        super();
        try{
            con=this.conectar();
            idCiudadano=ciuVO.getIdCiudadano();
            tipoDocumento=ciuVO.getTipoDocumento();
            numeroDocumento=ciuVO.getNumeroDocumento();
            nombreCompleto=ciuVO.getNombreCompleto();
            apellidos=ciuVO.getApellidos();
            genero=ciuVO.getGenero();
            telefonoCelular=ciuVO.getTelefonoCelular();
            telefonoFijo=ciuVO.getTelefonoFijo();
            correo=ciuVO.getCorreo();
            clave=ciuVO.getClave();
            municipio=ciuVO.getMunicipio();
            direccion=ciuVO.getDireccion();
            barrioVereda=ciuVO.getBarrioVereda();
            fechaNacimiento=ciuVO.getFechaNacimiento();
            etnia=ciuVO.getEtnia();
            condicionDiscapacidad=ciuVO.getCondicionDiscapacidad();
            estrato=ciuVO.getEstrato();
            nivelEducativo=ciuVO.getNivelEducativo();
            accesoTecnologico=ciuVO.getAccesoTecnologico();
            cualAccesoTecnologico=ciuVO.getAccesoTecnologico();
            conecitividadInternet=ciuVO.getConecitividadInternet();
            regimenAfiliacion=ciuVO.getRegimenAfiliacion();
        } catch(Exception e){
            System.out.println("Error"+e.getMessage().toString());
        }
    }

    @Override
    public boolean insertar() {
        try{
            sql="insert into Ciudadano(tipoDocumento, numeroDocumento, nombreCompleto, apellidos, genero, telefonoCelular, telefonoFijo, correo, clave, municipio, direccion, barrioVereda, fechaNacimiento,"
                    + "etnia, condicionDiscapacidad, estrato, nivelEducativo, accesoTecnologico, cualAccesoTecnologico, conecitividadInternet, regimenAfiliacion) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1, tipoDocumento);
            ps.setString(2, numeroDocumento);
            ps.setString(3, nombreCompleto);
            ps.setString(4, apellidos);
            ps.setString(5, genero);
            ps.setString(6, telefonoCelular);
            ps.setString(7, telefonoFijo);
            ps.setString(8, correo);
            ps.setString(9, clave);
            ps.setString(10, municipio);
            ps.setString(11, direccion);
            ps.setString(12, barrioVereda);
            ps.setString(13, fechaNacimiento);
            ps.setString(14, etnia);
            ps.setString(15, condicionDiscapacidad);
            ps.setString(16, estrato);
            ps.setString(17, nivelEducativo);
            ps.setString(18, accesoTecnologico);
            ps.setString(19, cualAccesoTecnologico);
            ps.setString(20, conecitividadInternet);
            ps.setString(21, regimenAfiliacion);
            ps.executeUpdate();
            operacion=true;
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }finally{
            try {
                this.cerrar();
            } catch (Exception e) {
                System.out.println("Error" + e.toString()); 
            }
        }
        return operacion;
    }

    /*@Override
    public boolean actualizar() {
        try{
            sql="update Ciudadano tipoDocumento=?, numeroDocumento=?, nombreCompleto=?, apellidos=?, genero=?, telefonoCelular=?, telefonoFijo=?, correo=?, clave=?, municipio=?, direccion=?, barrioVereda=?, fechaNacimiento=?,"
                    + "etnia=?, condicionDiscapacidad=?, estrato=?, nivelEducativo=?, accesoTecnologico=?, cualAccesoTecnologico=?, conecitividadInternet=?, regimenAfiliacion=? where idUsuario=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, tipoDocumento);
            ps.setString(2, numeroDocumento);
            ps.setString(3, nombreCompleto);
            ps.setString(4, apellidos);
            ps.setString(5, genero);
            ps.setString(6, telefonoCelular);
            ps.setString(7, telefonoFijo);
            ps.setString(8, correo);
            ps.setString(9, clave);
            ps.setString(10, municipio);
            ps.setString(11, direccion);
            ps.setString(12, barrioVereda);
            ps.setString(13, fechaNacimiento);
            ps.setString(14, etnia);
            ps.setString(15, condicionDiscapacidad);
            ps.setString(16, estrato);
            ps.setString(17, nivelEducativo);
            ps.setString(18, accesoTecnologico);
            ps.setString(19, cualAccesoTecnologico);
            ps.setString(20, conecitividadInternet);
            ps.setString(21, regimenAfiliacion);
            ps.setString(22, idCiudadano);
            ps.executeUpdate();
            operacion=true;
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }finally{
            try {
                this.cerrar();
            } catch (Exception e) {
                System.out.println("Error" + e.toString()); 
            }
        }
        return operacion;
    }*/
    
    public boolean inicioSesion(String email, String pswd){
        try{
            sql="select * from Ciudadano where correo=? and clave=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,email);
            ps.setString(2, pswd);
            rs=ps.executeQuery();
            if(rs.next()){
                operacion=true;
            }
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }finally{
            try {
                //this.cerrar();
            } catch (Exception e) {
                System.out.println("Error" + e.toString()); 
            }
        }
        return operacion;
    }
    public CiudadanoVO datosSesion(String email){
       CiudadanoVO ciuVO=new CiudadanoVO();
       try {
           sql="select*from Ciudadano where correo=?";
           ps=con.prepareStatement(sql);
           ps.setString(1, email);
           rs=ps.executeQuery();
           if (rs.next()) {
               ciuVO=new CiudadanoVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                       rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),
                       rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20),
                       rs.getString(21), rs.getString(22));
           }
       } catch (Exception e) {
           System.out.println("Error "+e.getMessage().toString());
       }
       
       return ciuVO;
   }
}
