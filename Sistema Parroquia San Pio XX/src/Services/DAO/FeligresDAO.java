/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.DAO;

import Model.Feligres;
import Services.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Solan
 */
public class FeligresDAO {
    public Boolean buscarCedula(String cedula){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            
            consulta = conexion.prepareStatement("SELECT * FROM registro WHERE cedula = " + cedula);        

            ResultSet rs = consulta.executeQuery();
            if(rs.next()){
                return true;
            }
            
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
        }return false;
    }
    
    public boolean guardar(Feligres f){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO registro "
                                              + "(cedula, nombre, direccion, telefono, estrato, estado, diezmo) " + 
                                                 "VALUES(?, ?, ?, ?, ?, ? ,?)");  
            
            
            
            consulta.executeUpdate();
            
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            //System.out.println(ex);
            
            return false;
        }
    }
    
    public String totalizar(){
        try{
            return "";
        }catch(Exception ex){
            System.out.println(ex);
            return "Error al Totalizar";
        }
        
       
    }
    
    public boolean eliminar(String cedula){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("DELETE FROM registro WHERE cedula = " + cedula);        
            consulta.executeUpdate();
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return false;
        }
    }
}
