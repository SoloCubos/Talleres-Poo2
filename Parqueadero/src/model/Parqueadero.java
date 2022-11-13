/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Date;
import services.DAO.IngresoVehiculoDAO;

/**
 * Clase Fachada, contiene las funciones del negocio
 * @author Solan
 */
public class Parqueadero {
    
    private static Parqueadero instance;
    
    public static Parqueadero getInstance(){
        if (instance == null) 
            instance = new Parqueadero();
        return instance;
    }
    
    public int tipo(String tipo){
        if(tipo.equals("Carro")){
            return 1;
        }if(tipo.equals("Moto")){
            return 2;
        }else return 0;
    }
    
    public Boolean validarPlaca(String placa){
        IngresoVehiculoDAO iV = new IngresoVehiculoDAO();
        return iV.consultarPlaca(placa);
    }
    
    public Boolean ingresarVehiculo(String placa, String modelo, Date fecha, String tipo){
        
        return false;
    }
}
