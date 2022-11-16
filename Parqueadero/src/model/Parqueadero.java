/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            return 0;
        }if(tipo.equals("Moto")){
            return 1;
        }else return 2;
    }
    
    public Boolean validarPlaca(String placa){
        IngresoVehiculoDAO iV = new IngresoVehiculoDAO();
        return iV.consultarPlaca(placa);
    }
    
    public Boolean ingresarVehiculo(String placa, String modelo, String fecha, String type){
        try {
            IngresoVehiculo i = new IngresoVehiculo();
        
            SimpleDateFormat fechaIngreso = new SimpleDateFormat("yyyy-MM-dd"); 

            i.setPlaca(placa);
            i.setModelo(Integer.parseInt(modelo));
            i.setTipo(tipo(type));
            i.setFecha((Date) fechaIngreso.parse(fecha));
            i.setValor(i.getValor());
        
            IngresoVehiculoDAO iV = new IngresoVehiculoDAO();

            iV.guardar(i);
            return true;
        } catch (ParseException ex) {
            Logger.getLogger(Parqueadero.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        }
    }
    
    public void reiniciar(){
        IngresoVehiculoDAO iV = new IngresoVehiculoDAO();
        iV.reinciar();
    }
    
    public String totalizar(){
        IngresoVehiculoDAO iV = new IngresoVehiculoDAO();
        return iV.totalizar();
    }
    
    public int[] cantVehiculos(){
        IngresoVehiculoDAO iV = new IngresoVehiculoDAO();
        
        int[] cV = new int[3];
        
        cV[0] = iV.cantCarros();
        cV[1] = iV.cantMotos();
        cV[2] = cV[0] + cV[1];
        
        return cV;
    }
}
