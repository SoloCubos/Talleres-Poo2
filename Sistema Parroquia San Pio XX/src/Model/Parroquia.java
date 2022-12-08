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
        
        FeligresDAO fD = new FeligresDAO();
        if(fD.existeFeligres(cedula)){
            return true;
        }else return false;
    }
    
    public boolean guardar(String cedula, String nombre, String direccion, String telefono, String estrato, String estado){
        
        if(!cedulaExiste(cedula)){
            
            Feligres f = new Feligres();
            f.setCedula(cedula);
            f.setNombre(nombre);
            f.setDireccion(direccion);
            f.setTelefono(telefono);
            f.setEstrato(Integer.parseInt(estrato));
            f.setEstado(estado);
            f.setDiezmo(f.getDiezmo());

            FeligresDAO fD = new FeligresDAO();

            return fD.guardar(f);
        }else return false;
        
    }
    
    public boolean eliminar(String cedula){
        if(!cedulaExiste(cedula)){
            
            FeligresDAO fD = new FeligresDAO();
            
            return fD.eliminar(cedula);
        }else return false;
    }
    
    public String[] buscar(String cedula){
        String[] datos = new String[6];
        FeligresDAO fD = new FeligresDAO();
        Feligres f = fD.cargarDatosFeligres(cedula);
        
        datos[0] = f.getCedula();
        datos[1] = f.getNombre();
        datos[2] = f.getDireccion();
        datos[3] = f.getTelefono();
        datos[4] = f.getEstrato() + "";
        datos[5] = f.getEstado();
   
        return datos;  
    }
    
    public void actualizar(String cedula, String nombre, String direccion, String telefono, String estrato, String estado){  
        
    }
    
    public int totalizar(){
        FeligresDAO fD = new FeligresDAO();
        return fD.totalizar();
    }
    
    public void pagar(String cedula){
        
    }
    
    public String consultar(String cedula){
        
        FeligresDAO fD = new FeligresDAO();
        Feligres f = fD.cargarDatosFeligres(cedula);
        
        int diezmo = 0;
        
        if(cedulaExiste(cedula)){
            diezmo = f.getDiezmo();
        }else return "El feligres no existe";
        
        return "$ " + diezmo;          
    }
    
    
    public ArrayList<String> resultados(){
        ArrayList<String> r = new ArrayList<>();
        FeligresDAO fD = new FeligresDAO();
        Feligres f = new Feligres();
        System.out.println(fD.cargarFeligreses().size());
        for (int i = 0; i < fD.cargarFeligreses().size(); i++) {
            r.add(fD.cargarFeligreses().get(i).toString());
            System.out.println("Resultados: " + fD.cargarFeligreses().get(i).toString());
        }
        
        return r; 
    }
}
