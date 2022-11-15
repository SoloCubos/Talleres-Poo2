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
            return false;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
        }return false;
    }
    
    public boolean guardar(IngresoVehiculo i){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO registro (placa, modelo, tipo, valor) " + 
                                                 "VALUES(" + i.getPlaca() + ", " + 
                                                             i.getModelo() + ", " + 
                                                             i.getTipo() + "," + 
                                                             i.getValor() + ")");        

            consulta.executeUpdate();
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return false;
        }
    }
    
    public String totalizar(){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("select "
                    + "sum(valor) as total, count(placa) as cantidad, tipo "
                    + "from registro group by tipo");        

            ResultSet rs = consulta.executeQuery();

            String total = null;
            if(rs.next()){
                total = "El total de carros es " + rs.getInt("cantidad") + " con un valor de " + rs.getInt("valor") + "";

            }
            if(rs.next()){
                total = total + ", el total de motos es " + rs.getInt("cantidad") + " con un valor de " + rs.getInt("valor") + "";

            }
            return total;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return "Error al totalizar";
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
}
