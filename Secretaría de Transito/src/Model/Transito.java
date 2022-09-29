/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author solan
 * Clase Fachada
 */
public class Transito {
    
    public ArrayList<Propietario> propietarios = new ArrayList<>();
    
    private String PlacaIntroducida;
    
    private static Transito instance;
    
    private Transito(){ 
        this.propietarios = new ArrayList<>();
    }
    
    public static Transito getInstance(){
        if(instance == null){
            instance = new Transito();
        }
        return instance;
    }

    public String getPlacaIntroducida() {
            return PlacaIntroducida;
    }

    public void setPlacaIntroducida(String placa) {
            PlacaIntroducida = placa;
    }
    
    public void consultar(String placa){	
        setPlacaIntroducida(placa);
    	if(!existePlaca(placa)) {	//Si no existe
            JOptionPane.showMessageDialog(null, "El vehiculo identificado con la placa `" + placa + " no se encontro, por favor registrelo", "Error", 0);  		
    	}else //si ya existe o agregar otro
            JOptionPane.showMessageDialog(null, "Tu Vehiculo ya esta registrado, a continuacion podras actualizar tus datos y/o los datos de tu vehiculo y/o registrar otro", "Continuar", 1);
			
    }
    
    
    public void agregar(String nombre, String apellido, String cedula, String celular, String correo,
                        String placa, String marca, String linea, String modelo, String tipo){
        Vehiculo v = new Vehiculo();
        Propietario p = new Propietario();
        if(!existePlaca(placa) || !existePropietario(cedula)){
            v.setPlaca(placa);
            v.setMarca(marca);
            v.setLinea(linea);
            v.setModelo(modelo);
            v.setTipo(tipo);
            
            p.setNombre(nombre);
            p.setApellidos(apellido);
            p.setCedula(cedula);
            p.setCelular(celular);
            p.setCorreo(correo);
            p.addVehiculos(v);
            propietarios.add(p);
            
        }if(!existePlaca(placa) || existePropietario(cedula)){
            v.setPlaca(placa);
            v.setMarca(marca);
            v.setLinea(linea);
            v.setModelo(modelo);
            v.setTipo(tipo);
            for (int i = 0; 1 < propietarios.size(); i++){
                if(propietarios.get(i).getCedula().equals(cedula)){
                    propietarios.get(i).addVehiculos(v);
                }
            }
        }
    }
       
    public boolean existePlaca(String placa) {
        boolean e = false;
        for (int i = 0; i < propietarios.size(); i++) {
            for(int j = 0; j < propietarios.get(i).getVehiculos().size(); j++){
                if(!propietarios.get(i).getVehiculos().get(j).getPlaca().equals(placa)){
                    System.out.println("Placa no existe");
                    e = false;
                }if(propietarios.get(i).getVehiculos().get(j).getPlaca().equals(placa)) {
                    System.out.println("Placa existe");
                    e = true;
                }
            }
        }return e;	
    }
    
    public boolean existePropietario(String cedula){
        boolean e =  false;
        for (int i = 0; i < propietarios.size(); i++) {
            if(!propietarios.get(i).getCedula().equals(cedula)){
                System.out.println("propietario no existe");
                e = false;
            }if(propietarios.get(i).getCedula().equals(cedula)){
                System.out.println("propietario existe");
                e = true;
            }
        } return e;
    }
}
