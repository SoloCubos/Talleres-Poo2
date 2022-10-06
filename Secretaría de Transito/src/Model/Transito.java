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
    
    private String placaIntroducida;
    private String cedulaIntroducida;
    
    private static Transito instance;
    
    private Transito(){ 
        this.propietarios = new ArrayList<>();
    }
    
    public static Transito getInstance(){
        if(instance == null){
            instance = new Transito();
        }return instance;
    }

    public ArrayList<Propietario> getListaPropietarios() {
        return propietarios;
    }

    public String getPlacaIntroducida() {
            return placaIntroducida;
    }

    public void setPlacaIntroducida(String placa) {
            placaIntroducida = placa;
    }

    public String getCedulaIntroducida() {
        return cedulaIntroducida;
    }

    public void setCedulaIntroducida(String cedulaIntroducida) {
        this.cedulaIntroducida = cedulaIntroducida;
    }
    
    public void consultar(String placa, String cedula){	
        setPlacaIntroducida(placa);
        setCedulaIntroducida(cedula);
        if(placa!=null){
            if(!existePlaca(placa)) {	//Si no existe
                JOptionPane.showMessageDialog(null, "El vehiculo identificado con la placa `" + placa + " no se encontro, por favor registrelo", "Error", 0);  		
            }else //si ya existe o agregar otro
                JOptionPane.showMessageDialog(null, "Tu Vehiculo ya esta registrado, a continuacion podras actualizar tus datos y/o los datos de tu vehiculo y/o registrar otro", "Continuar", 1);
        }if(cedula!=null){
            if(!existePropietario(cedula)) {	//Si no existe
                JOptionPane.showMessageDialog(null, "La persona identificada con la cedula `" + cedula + " no se encontro, por favor registrese", "Error", 0);  		
            }else //si ya existe o agregar otro
                JOptionPane.showMessageDialog(null, "Ya te encuentras registrado, a continuación podrás actualizar tus datos y/o agregar vehiculos", "Continuar", 1);
        }
    }
    public ArrayList<String> listaPlacas(String cedula){
        ArrayList<String> lista = new ArrayList<>();
        if (cedula!=null) {
            for (int i = 0; i < propietarios.size(); i++) {
                if(propietarios.get(i).getCedula().equals(cedula)){
                    for (int j = 0; j < propietarios.get(i).getVehiculos().size(); j++) {
                        lista.add(propietarios.get(i).getVehiculos().get(j).getPlaca());
                    }
                }
            }
        }return lista;        
    }
    
    public void agregar(String nombre, String apellido, String cedula, String celular, String correo,
                        String placa, String marca, String linea, String modelo, String tipo){
        Vehiculo v = new Vehiculo();
        Propietario p = new Propietario();
        if(!existePlaca(placa) && !existePropietario(cedula)){
            
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
            v.setPropietario(p);
            p.addVehiculos(v);
            propietarios.add(p);
            JOptionPane.showMessageDialog(null, "Datos agregados con exito", "Continuar", 1);
        }if(!existePlaca(placa) && existePropietario(cedula)){
            v.setPlaca(placa);
            v.setMarca(marca);
            v.setLinea(linea);
            v.setModelo(modelo);
            v.setTipo(tipo);
            for (int i = 0; 1 < propietarios.size(); i++){
                if(propietarios.get(i).getCedula().equals(cedula)){
                    v.setPropietario(propietarios.get(i));
                    propietarios.get(i).addVehiculos(v);
                }
            }JOptionPane.showMessageDialog(null, "Nuevo Vehiculo Agregado con exito", "Continuar", 1);
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
