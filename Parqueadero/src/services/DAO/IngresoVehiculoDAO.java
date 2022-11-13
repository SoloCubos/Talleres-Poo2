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
            consulta = conexion.prepareStatement("SELECT * FROM ingreso WHERE placa = " + placa);        


            ResultSet rs = consulta.executeQuery();
            if(rs.next()){
                return true;
            }
            return false;
        }catch(SQLException | ClassNotFoundException ex){
            
        }return false;
    }
    public void guardar(IngresoVehiculo i){
      try{
         Connection conexion = Conexion.obtener();
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("INSERT INTO ingreso (placa, modelo, tipo, valor) "
                 + "VALUES(?, ?, ?, ?)");        
         
         consulta.executeUpdate();
      }catch(SQLException | ClassNotFoundException ex){
            
      }
    }
    
    public String totalizar(){
      try{
         Connection conexion = Conexion.obtener();
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("select "
                 + "sum(valor) as total, count(placa) as cantidad, tipo "
                 + "from ingreso group by tipo");        
         
         ResultSet rs = consulta.executeQuery();
         
         String total = "";
         if(rs.next()){
             total = total + "El total de carros es " + rs.getInt("cantidad") + " con un valor de " + rs.getInt("valor") + "";

         }
         
         if(rs.next()){
             total = total + ", el total de motos es " + rs.getInt("cantidad") + " con un valor de " + rs.getInt("valor") + "";

         }
         return total;
      }catch(SQLException | ClassNotFoundException ex){
            
      }
      return "Error al totalizar";
    }
    
    public void eliminar(){
      try{
         Connection conexion = Conexion.obtener();
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("DELETE FROM ingreso");        
         consulta.executeUpdate();
      }catch(SQLException | ClassNotFoundException ex){
            
      }
      
    }
}
