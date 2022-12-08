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
import java.util.ArrayList;

/**
 * Para actualizar los datos de un feligrés, se elimina el mismo, y se agrega nuevamente
 * 
 * @author Solan
 */
public class FeligresDAO {
    
    public Boolean existeFeligres(String cedula){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            
            consulta = conexion.prepareStatement("SELECT * FROM feligres WHERE cedula = " + cedula);        

            ResultSet rs = consulta.executeQuery();
            if(rs.getString(cedula)== "cedula"){
                return true;
            }else return false;
            
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex + " Error consultando existencia feligres");
        }return false;
    }
    
    public boolean guardar(Feligres f){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO feligres "
                                              + "(cedula, nombre, direccion, telefono, estrato, estado, diezmo) " + 
                                                 "VALUES(?, ?, ?, ?, ?, ? ,?)");  
            consulta.setString(1, f.getCedula());
            consulta.setString(2, f.getNombre());
            consulta.setString(3, f.getDireccion());
            consulta.setString(4, f.getTelefono());
            consulta.setInt(5, f.getEstrato());
            consulta.setString(6, f.getEstado());
            consulta.setInt(7, f.getDiezmo());
            
            consulta.executeUpdate();
            
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex + " Error guardando feligres");     
            return false;
        }
    }  
    
    public Feligres cargarDatosFeligres(String cedula){
        try{
            Feligres f = new Feligres();
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM feligres WHERE cedula = " + cedula);        
            ResultSet rs = consulta.executeQuery();
            
            if(rs.next()){
                f.setCedula(rs.getString("cedula"));
                f.setNombre(rs.getString("nombre"));
                f.setDireccion(rs.getString("direccion"));
                f.setTelefono(rs.getString("telefono"));
                f.setEstrato(rs.getInt("estrato"));
                f.setEstado(rs.getString("estado"));
                f.setDiezmo(rs.getInt("diezmo"));
            }
            return f;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex + " Error cargando feligres");
            return null;
        } 
    }
    
    public boolean Actualizar(Feligres f){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            
            consulta = conexion.prepareStatement("UPDATE feligres SET nombre = " + f.getNombre() + 
                                                                   ", direccion = " + f.getDireccion() + 
                                                                   ", telefono = " + f.getTelefono() +
                                                                   ", estrato = " + f.getEstrato() +
                                                                   ", estado = " + f.getEstado() + 
                                                                   ", diezmo = " + f.getDiezmo() +
                                                                   "WHERE cedula = " + f.getCedula());       
            
            consulta.executeUpdate();
            
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex + " Error actualizando feligres");
            return false;
        }
    }
    
    public ArrayList<Feligres> cargarFeligreses(){
        try{
            
            ArrayList<Feligres> fA = new ArrayList<>();
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM feligres");        
            ResultSet rs = consulta.executeQuery();
            
            
            while(rs.next()){
                Feligres f = new Feligres();
                f.setCedula(rs.getString("cedula"));
                f.setNombre(rs.getString("nombre"));
                f.setDireccion(rs.getString("direccion"));
                f.setTelefono(rs.getString("telefono"));
                f.setEstrato(rs.getInt("estrato"));
                f.setEstado(rs.getString("estado"));
                f.setDiezmo(rs.getInt("diezmo"));
                fA.add(f);
                System.out.println(f.toString());
            }
            return fA;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex + " Error cargando feligreses");
            return null;
        }
    }
    
    public boolean pagar(Feligres f){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            
            consulta = conexion.prepareStatement("UPDATE feligres SET estado = " + f.getEstado() + 
                                                                   ", diezmo = " + f.getDiezmo() +
                                                                   "WHERE cedula = " + f.getCedula());       
            
            consulta.executeUpdate();
            
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex + " Error pagando");
            return false;
        }
    }
    
    public boolean eliminar(String cedula){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("DELETE FROM feligres WHERE cedula = " + cedula);        
            consulta.executeUpdate();
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex + " Error eliminando feligres");
            return false;
        }
    }
    
    public int totalizar(){
        try{
            int totalDiezmos = 0;            
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM feligres");        
            ResultSet rs = consulta.executeQuery();
            
            while(rs.next()){
                
                totalDiezmos = totalDiezmos + rs.getInt("diezmo");
                
            }return totalDiezmos;
            
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex + " Error totalizando");
            return 0;
        }
    }
}
