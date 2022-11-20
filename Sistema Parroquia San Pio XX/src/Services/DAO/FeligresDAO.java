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
            System.out.println(ex);     
            return false;
        }
    }
   
    
    public Feligres mostrarDatosFeligres(String cedula){
        try{
            Feligres f = new Feligres();
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM registro WHERE cedula = " + cedula);        
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
            System.out.println(ex);
            return null;
        }
        
       
    }
    public ArrayList<Feligres> mostrarFeligreses(String cedula){
        try{
            Feligres f = new Feligres();
            ArrayList<Feligres> fA = new ArrayList<>();
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM registro");        
            ResultSet rs = consulta.executeQuery();
            
            
            while(rs.next()){
                f.setCedula(rs.getString("cedula"));
                f.setNombre(rs.getString("nombre"));
                f.setDireccion(rs.getString("direccion"));
                f.setTelefono(rs.getString("telefono"));
                f.setEstrato(rs.getInt("estrato"));
                f.setEstado(rs.getString("estado"));
                f.setDiezmo(rs.getInt("diezmo"));
                fA.add(f);
            }
            return fA;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return null;
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
