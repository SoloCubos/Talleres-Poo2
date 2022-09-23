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
 */
public class Transito {
    
    private ArrayList<Propietario> propietarios = new ArrayList<>();
    
    private String PlacaIntroducida;
    
    private static Transito instance;
    
    private Transito(){ 
    }
    
    public static Transito getInstance(){
        if(instance == null){
            instance = new Transito();
        }
        return instance;
    }
    
    public ArrayList<Propietario> getPropietarios() {
		return propietarios;
	}

	public String getPlacaIntroducida() {
		return PlacaIntroducida;
	}

	public void setPlacaIntroducida(String placa) {
		PlacaIntroducida = placa;
	}

	public void consultar(String placa){	
		//Si no existe
    	if(!existe(placa)) {
    		
    		JOptionPane.showMessageDialog(null, "El vehiculo identificado con la placa `" + placa + "´ no se encontró, por favor registrelo", "Error", 0);  		
    	}else //si ya existe o agregar otro
    		
			JOptionPane.showMessageDialog(null, "Tu Vehiculo ya esta registrado, a continuacion podras actualizar tus datos y/o los datos de tu vehiculo y/o registrar otro");
			
    }
	/*
    public boolean mostrarDatos(String placa){
        
        for (int i = 0; i < propietarios.size(); i++) {
            
            for(int j = 0; j < propietarios.get(i).getVehiculos().size(); j++){
    
                }
            }
        return false;
    }
    */
    
    public void agregarActualizar(String nombre, String apellido, String cedula, String celular, String correo,
    							  String placa, String marca, String linea,String modelo,String tipo) {
    	
    	Propietario p = new Propietario();
    	Vehiculo v = new Vehiculo();
    	
    	//si el vehiculo no existe y el propietario tampoco (agregar ambos)
    	
    	if(!existe(placa) && !propietarioExiste(placa, marca, linea, modelo, tipo)) {
    		//mostrarDatos(placa);
    		System.out.println("soy nuevo y mi carro tambien");
			p.setNombre(nombre);
	    	p.setApellidos(apellido);
	    	p.setCedula(cedula);
	    	p.setCelular(celular);
	    	p.setCorreo(correo);
        
	    	v.setPlaca(placa);
	    	v.setMarca(marca);
	    	v.setLinea(linea);
	    	v.setModelo(modelo);
	    	v.setTipo(tipo);
	    	
	    	p.addVehiculos(v);
	    	
	    	propietarios.add(p);
	    	
    	}//si no existe el vehiculo pero si el propietario (agregar otro vechiculo)
    	
    	if(!existe(placa) && propietarioExiste(placa, marca, linea,modelo, tipo)) {
    		for(int i = 0; i < propietarios.size(); i++) {
    			
    			if((propietarios.get(i).getNombre().equals(nombre)) &&
    		       (propietarios.get(i).getApellidos().equals(apellido)) &&
    		       (propietarios.get(i).getCedula().equals(cedula)) &&
    		       (propietarios.get(i).getCelular().equals(celular)) &&
    		  	   (propietarios.get(i).getCorreo().equals(correo))) {
    				System.out.println("quiero agregar otro carro");
    				v.setPlaca(placa);
    		    	v.setMarca(marca);
    		    	v.setLinea(linea);
    		    	v.setModelo(modelo);
    		    	v.setTipo(tipo);
    		    	
    				p.addVehiculos(v);
    			}
    		}//si el vechiculo ya existe y el propietario tambien (actualziar)
    		
    	}if(existe(placa) && propietarioExiste(placa, marca, linea,modelo, tipo)) {
    		for (int i = 0; i < propietarios.size(); i++) {
    			
    			for(int j = 0; j < propietarios.get(i).getVehiculos().size(); j++){
    				
    				propietarios.get(i).setNombre(nombre);
 		       		propietarios.get(i).setApellidos(apellido);
 		       		propietarios.get(i).setCedula(cedula);
 		       		propietarios.get(i).setCelular(celular);
 		  	   		propietarios.get(i).setCorreo(correo);
    				
 		  	   		propietarios.get(i).getVehiculos().get(j).setPlaca(placa);
 		  	   		propietarios.get(i).getVehiculos().get(j).setMarca(marca);
 		  	   		propietarios.get(i).getVehiculos().get(j).setLinea(linea);
 		  	   		propietarios.get(i).getVehiculos().get(j).setModelo(modelo);
 		  	   		propietarios.get(i).getVehiculos().get(j).setTipo(tipo);
    			}
    		}
    	}		
    }
    
    
    public boolean existe(String placa) {
    	
    	for (int i = 0; i < propietarios.size(); i++) {
			
			for(int j = 0; j < propietarios.get(i).getVehiculos().size(); j++){
          
				if(propietarios.get(i).getVehiculos().get(j).getPlaca().isBlank()){
					System.out.println("no existo");
					return false;
				}if(propietarios.get(i).getVehiculos().get(j).getPlaca().equals(placa)) {
					System.out.println("existo");
					return true;
				}
				
			}
		}
    	
		return false;	
    }
    
    public boolean propietarioExiste(String nombre, String apellido, String cedula, String celular, String correo) {
    	
    	for (int i = 0; i < propietarios.size(); i++) {
    		//Si no existe el propietario
    		if((propietarios.get(i).getNombre().isBlank()) &&
    		   (propietarios.get(i).getApellidos().isBlank()) &&
    		   (propietarios.get(i).getCedula().isBlank()) &&
    		   (propietarios.get(i).getCelular().isBlank()) &&
    		   (propietarios.get(i).getCorreo().isBlank())) {
    			System.out.println("no existo");
    			return false;
    		}else {//si ya existe el propietario
    			System.out.println("existo");
    			return true;
			}
		}
		return false;    	
    }
}
