package modelDAO;

import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelVO.PreguntasTemasVO;

public class PreguntasTemasDAO extends Conexion implements Crud{

    private Connection con=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private boolean operacion=false;
    private String sql="";
    
    private String idPreguntasTemas, tema, pregunta, fechaInicio, fechaFin, horaInicio, horaFin, opcionesRespuesta, idAdministradorFK;
    
    public PreguntasTemasDAO(PreguntasTemasVO preVO){
        try {
            con=this.conectar();
            idPreguntasTemas=preVO.getIdPreguntasTemas();
            tema=preVO.getTema();
            pregunta=preVO.getPregunta();
            fechaInicio=preVO.getFechaInicio();
            fechaFin=preVO.getFechaFin();
            horaInicio=preVO.getHoraInicio();
            horaFin=preVO.getHoraFin();
            opcionesRespuesta=preVO.getOpcionesRespuesta();
            idAdministradorFK=preVO.getIdAdministradorFK();
            
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage().toString());
        }
    }
    
    @Override
    public boolean insertar() {
        try {
            sql = "insert into PreguntasTemas(tema, pregunta, fechaInicio, fechaFin, horaInicio, horaFin, opcionesRespuesta, idAdministradorFK) value(?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, tema);
            ps.setString(2, pregunta);
            ps.setString(3, fechaInicio);
            ps.setString(4, fechaFin);
            ps.setString(5, horaInicio);
            ps.setString(6, horaFin);
            ps.setString(7, opcionesRespuesta);
            ps.setString(8, idAdministradorFK);
            ps.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage().toString());
        } finally{
            try {
                this.cerrar();
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage().toString());
            }
        }
        return operacion;
    }
    public List<PreguntasTemasVO> verPreguntas() {
        List<PreguntasTemasVO> preguntasVO=new ArrayList<>();
        try {
            sql = "select*from PreguntasTemas";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                PreguntasTemasVO preVO=new PreguntasTemasVO();
                preVO.setIdPreguntasTemas(rs.getString("idPreguntasTemas"));
                preVO.setTema(rs.getString("tema"));
                preVO.setPregunta(rs.getString("pregunta"));
                preVO.setFechaInicio(rs.getString("fechaInicio"));
                preVO.setFechaFin(rs.getString("fechaFin"));
                preVO.setHoraInicio(rs.getString("horaInicio"));
                preVO.setHoraFin(rs.getString("horaFin"));
                preVO.setOpcionesRespuesta(rs.getString("opcionesRespuesta"));
                preVO.setIdAdministradorFK(rs.getString("idAdministradorFK"));
                preguntasVO.add(preVO);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage().toString());
        } finally{
            try {
                this.cerrar();
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage().toString());
            }
        }
        return preguntasVO;
    }
    public PreguntasTemasVO verPorId(String idPreguntasTemasController) {
        try {
            sql = "select*from PreguntasTemas where idPreguntasTemas=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, idPreguntasTemasController);
            rs=ps.executeQuery();
            if (rs.next()) {
                idPreguntasTemas = rs.getString("idPreguntasTemas");
                tema = rs.getString("tema");
                pregunta = rs.getString("pregunta");
                fechaInicio = rs.getString("fechaInicio");
                fechaFin = rs.getString("fechaFin");
                horaInicio = rs.getString("horaInicio");
                horaFin = rs.getString("horaFin");
                opcionesRespuesta = rs.getString("opcionesRespuesta");
                idAdministradorFK = rs.getString("idAdministradorFK");
                return new PreguntasTemasVO(idPreguntasTemas, tema, pregunta, fechaInicio, fechaFin, horaInicio, horaFin, opcionesRespuesta, idAdministradorFK);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage().toString());
        } finally{
            try {
                this.cerrar();
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage().toString());
            }
        }
        return null;
    }
}
