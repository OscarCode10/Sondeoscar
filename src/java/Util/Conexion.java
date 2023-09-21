package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public String user, password, urlDb, dataBase, driver;
    public Connection con;
    
    
    public Conexion(){
        user="root";
        password="";
        dataBase="senasoft2022";
        urlDb="jdbc:mysql://localhost:3306/"+dataBase;
        driver="com.mysql.jdbc.Driver";
        
        try{
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(urlDb, user, password);
            System.out.println("Conexión exitosa");
        }catch(Exception e){
            System.out.println("Error"+e.getMessage().toString());
        }
    }
    
    
    public Connection conectar(){
        return con;
    }
    
    public Connection cerrar() throws SQLException{
        con.close();
        con=null;
        return con;
    }
    
    public static void main(String[] args) {
        new Conexion();
    }
}