/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author solan
 */
public class Docente extends Integrante{
    
    private String profesion;
    private int salario;
    private double estatura;
    private double peso;

    public Docente() {
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
    
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void calcularImc(){

        double Imc = 0;
        
        Imc = peso/(estatura * estatura);
        
        if(Imc < 18.5){
            JOptionPane.showConfirmDialog(null, "OJO FLACUCHENTO!!!", "Peso Inferior al Normal", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            System.out.println("Peso Inferior al normal");
        }
        if(Imc >= 18.5 && Imc <= 24.9){
            JOptionPane.showConfirmDialog(null, "Estas Saludable!", "Peso Normal", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Peso normal");
        }
        if(Imc >= 25.5 && Imc <= 29.9){
            JOptionPane.showConfirmDialog(null, "OJO GORDITO!!!", "Peso Superior al Normal", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            System.out.println("Peso Superior al normal");
        }
        if(Imc >= 30.0){
            JOptionPane.showConfirmDialog(null, "PONGASE A DIETA!!!", "Obesidad", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            System.out.println("Obesidad");
        }
    }
    
}
