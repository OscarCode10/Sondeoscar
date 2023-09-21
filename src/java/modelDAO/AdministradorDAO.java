package modelDAO;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelVO.AdministradorVO;

public class AdministradorDAO extends Conexion{
    private Connection con=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private boolean operacion=false;
    private String sql="";
    
    private String idAdministrador, nombreCompletoAdministrador, apellidoAdministrador, correoAdministrador, pswdAdministrador;
    
    public AdministradorDAO(AdministradorVO adminVO){
        super();
        try {
            con=this.conectar();
            idAdministrador=adminVO.getIdAdministrador();
            nombreCompletoAdministrador=adminVO.getNombreCompletoAdministrador();
            apellidoAdministrador=adminVO.getApellidoAdministrador();
            correoAdministrador=adminVO.getCorreoAdministrador();
            pswdAdministrador=adminVO.getPswdAdministrador();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage().toString());
        }
    }
    
    public boolean inicioAdmin(String correoA, String claveA){
        try {
            sql="select*from Administrador where correoAdministrador=? and pswdAdministrador=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, correoA);
            ps.setString(2, claveA);
            rs=ps.executeQuery();
            if(rs.next()){
                operacion=true;
            }
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage().toString());
        }finally{
            try {
                //this.cerrar();
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage().toString());
            }
        }
        return operacion;
    }
    
   public AdministradorVO datosSesion(String correoA){
       AdministradorVO adminVO=new AdministradorVO();
       try {
           sql="select*from Administrador where correoAdministrador=?";
           ps=con.prepareStatement(sql);
           ps.setString(1, correoA);
           rs=ps.executeQuery();
           if (rs.next()) {
               adminVO=new AdministradorVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
           }
       } catch (Exception e) {
           System.out.println("Error "+e.getMessage().toString());
       }
       
       return adminVO;
   }
}
