/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 * Clase Fachada
 * @author solan
 */
public class Parroquia {
    private ArrayList<Feligres> f = new ArrayList<>();
    
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
    
    public void guardar(String cedula, String nombre, String direccion, String telefono, String estrato, String estado){
        Feligres efe = new Feligres();
        
        efe.setCedula(cedula);
        efe.setNombre(nombre);
        efe.setDireccion(direccion);
        efe.setTelefono(telefono);
        efe.setEstrato(Integer.parseInt(estrato));
        efe.setEstado(estado);
        efe.calcularDiezmo();
        
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
        for (int i = 0; i < f.size(); i++) {
            if(f.get(i).getCedula().equals(cedula)){
                f.get(i).setEstado("Cumplido");
                f.get(i).setDiezmo(0);
            }
            
        }
    }
    
    public String consultar(String cedula){
        int diezmo = 0;
        for (int i = 0; i < f.size(); i++) {
            if(f.get(i).getCedula().equals(cedula)){
                f.get(i).calcularDiezmo();
                diezmo = f.get(i).getDiezmo();
                totalDiezmos = totalDiezmos + diezmo;
            }        
        }return "$" + diezmo;
    }
    
    public ArrayList<String> resultados(){
        ArrayList<String> r = new ArrayList<>();
        for (int i = 0; i < f.size(); i++) {
            r.add(i, f.get(i).toString());
        }return r; 
    }
    
    public boolean existe(String cedula){
        boolean e =  false;
        for (int i = 0; i < f.size() && e == false; i++) {
            if(f.get(i).getCedula().equals(cedula)){
                e = true;
            }      
        }System.out.println(e);
        return e;
    }
}
