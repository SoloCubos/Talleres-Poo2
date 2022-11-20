/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Services.DAO.FeligresDAO;
import java.util.ArrayList;

/**
 * Clase Fachada
 * @author solan
 */
public class Parroquia {
    
    private int totalDiezmos;
    
    private static Parroquia instance;

    private Parroquia() {      
    }
    
    public static Parroquia getInstance(){
        if(instance == null)
            instance = new Parroquia();
        return instance;
    }
    
    public boolean cedulaExiste(String cedula){
        
        return false;
    }
    
    public boolean guardar(String cedula, String nombre, String direccion, String telefono, String estrato, String estado){
        Feligres f = new Feligres();
        
        f.setCedula(cedula);
        f.setNombre(nombre);
        f.setDireccion(direccion);
        f.setTelefono(telefono);
        f.setEstrato(Integer.parseInt(estrato));
        f.setEstado(estado);
        f.calcularDiezmo();
        
        FeligresDAO fD = new FeligresDAO();
 
        return fD.guardar(f);
    }
    
    public void eliminar(String cedula){
        
    }
    
    public String[] buscar(String cedula){
        String[] datos = new String[6];
        
            
        return datos;  
    }
    
    public void actualizar(String cedula, String nombre, String direccion, String telefono, String estrato, String estado){  
        
    }
    
    public int totalizar(){   
        return totalDiezmos;
    }
    
    public void pagar(String cedula){
        
    }
    
    public String consultar(String cedula){
        int diezmo = 0;
        
        totalDiezmos = totalDiezmos + diezmo;
        return "$" + diezmo;          
    }
    
    
    public ArrayList<String> resultados(){
        ArrayList<String> r = new ArrayList<>();
        
        return r; 
    }
}
