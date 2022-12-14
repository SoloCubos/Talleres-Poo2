/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author solan
 */
public class Feligres {
    
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private int estrato;
    private String estado;
    private int diezmo;

    public Feligres() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDiezmo() {
        if(getEstado().equals("Deudor")){
            if(getEstrato() <= 1){
                diezmo = 250000;
            }if(getEstrato() > 1 && getEstrato() <= 3){
                diezmo = 500000;
            }if(getEstrato() > 3){
                diezmo = 1000000;
            }
        }
        return diezmo;
    }

    public void setDiezmo(int diezmo) {
        this.diezmo = diezmo;
    }
  
    public String toString(){       
        return "Feligrés: " + getNombre() + ". CC: " + getCedula() + ". Estado: " + getEstado();
    }
}
