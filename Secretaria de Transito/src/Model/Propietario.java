/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author solan
 */
public class Propietario {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String celular;
    private String correo;
    private ArrayList<Vehiculo> vehiculos;
	

    public Propietario() {
        vehiculos = new ArrayList<>();
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void addVehiculos(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", cedula=" + cedula + ", celular=" + celular + ", correo=" + correo + ", vehiculos=" + vehiculos.toString() + '}';
    }
}
