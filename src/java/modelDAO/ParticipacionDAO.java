package modelDAO;

import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import modelVO.ParticipacionVO;

public class ParticipacionDAO extends Conexion implements Crud{
    
    private Connection con=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private boolean operacion=false;
    private String sql="";
        
    private String idParticipacion, fechaGeneracion, numeroCertificacion, respuestaPregunta, idPreguntasTemasFK, idCiudadanoFK;
    
    public ParticipacionDAO(ParticipacionVO partiVO){
        try {
            con=this.conectar();
        idParticipacion=partiVO.getIdParticipacion();
        fechaGeneracion=partiVO.getFechaGeneracion();
        numeroCertificacion=partiVO.getNumeroCertificacion();
        respuestaPregunta=partiVO.getRespuestaPregunta();
        idPreguntasTemasFK=partiVO.getIdPreguntasTemasFK();
        idCiudadanoFK=partiVO.getIdCiudadanoFK();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage().toString());
        }
    }
    @Override
    public boolean insertar() {
        try {
            Random random=new Random();
            int numCerti=random.nextInt(900000)+100000;
            sql="insert into Participacion(numeroCertificacion, respuestaPregunta, idPreguntasTemasFK, idCiudadanoFK) value(?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1, numeroCertificacion=String.valueOf(numCerti));
            ps.setString(2, respuestaPregunta);
            ps.setString(3, idPreguntasTemasFK);
            ps.setString(4, idCiudadanoFK);
            ps.executeUpdate();
            operacion=true;
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage().toString());
        }finally{
            try {
                this.cerrar();
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage().toString());
            }
        }
        return operacion;
    }
    
    public List<ParticipacionVO> verParticipaciones(String idCiudadanoFKContoller){
        List<ParticipacionVO> participacionesVO=new ArrayList<>();
        try {
            sql="select*from Participacion where idCiudadanoFK=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, idCiudadanoFKContoller);
            rs=ps.executeQuery();
            while (rs.next()) {
                ParticipacionVO partiVO=new ParticipacionVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6));
                participacionesVO.add(partiVO);
            }
            
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage().toString());
        }finally{
            try {
                this.cerrar();
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage().toString());
            }
        }
        return participacionesVO;
    }
}
