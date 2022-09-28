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
public class Administrativo extends Integrante{
    
    private int anoIngreso;
    private int salario;

    public Administrativo() {
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

    public int getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void calcularVeterania(){
        int anoActual = 2022;
        int antiguedad = 0;
        antiguedad = anoActual - anoIngreso;
        
        System.out.println("El(la) trabajador(a) " + getNombre() + " " + getApellido() + " lleva " + antiguedad + " años trabajando en la UFPS");
    }
}
