/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import services.Conexion;
import model.*;
/**
 *
 * @author Solan
 */
public class IngresoVehiculoDAO {

    public Boolean consultarPlaca(String placa){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM registro WHERE placa = " + placa);        


            ResultSet rs = consulta.executeQuery();
            if(rs.next()){
                return true;
            }
            
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
        }return false;
    }
    
    public boolean guardar(IngresoVehiculo i){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO registro (placa, fecha, modelo, tipo, valor) " + 
                                                 "VALUES(?, ?, ?, ?, ?)");  
            
            consulta.setString(1, i.getPlaca());
            consulta.setDate(2, i.getFecha());
            consulta.setInt(3, i.getModelo());
            consulta.setInt(4, i.getTipo());
            consulta.setInt(5, i.getValor());
            
            consulta.executeUpdate();
            
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            //System.out.println(ex);
            
            return false;
        }
    }
    
    public String totalizar(){
        try{
            String total = null;      
            total = "El total de carros es " + cantCarros() + " con un valor de " + gananciaCarros() + ", "
                  + "el total de motos es " + cantMotos() + " con un valor de " + gananciaMotos() + "";
            return total;
        }catch(Exception ex){
            System.out.println(ex);
            return "Error al Totalizar";
        }
       
    }
    
    public boolean reinciar(){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("DELETE FROM registro");        
            consulta.executeUpdate();
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return false;
        }
    }
    
    public int cantCarros(){
        int c = 0;
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM registro WHERE tipo = '0'");   
            ResultSet rs = consulta.executeQuery();
            
            while(rs.next()){
                c++;
            }
            
            return c;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return 0;
        }
    }
    
    public int gananciaCarros(){
        int c = 0;
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM registro WHERE tipo = '0'");   
            ResultSet rs = consulta.executeQuery();
            
            while(rs.next()){
                c = c + rs.getInt("valor");
            }
            
            return c;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return 0;
        }
    }
    
    public int cantMotos(){
        int c = 0;
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM registro WHERE tipo = '1'");   
            ResultSet rs = consulta.executeQuery();
            
            while(rs.next()){
                c++;
            }
            
            return c;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return 0;
        }
    }
    
    public int gananciaMotos(){
        int c = 0;
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM registro WHERE tipo = '1'");   
            ResultSet rs = consulta.executeQuery();
            
            while(rs.next()){
                c = c + rs.getInt("valor");
            }
            
            return c;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return 0;
        }
    }
}
