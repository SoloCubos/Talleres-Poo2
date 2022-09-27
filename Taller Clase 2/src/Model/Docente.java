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
public class Docente extends Integrante{
    
    private String profesion;
    private int salario;
    private double estatura;
    private double peso;

    public Docente() {
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
            System.out.println("Peso Inferior al normal");
        }
        if(Imc >= 18.5 && Imc <= 24.9){
            System.out.println("Peso normal");
        }
        if(Imc >= 25.5 && Imc <= 29.9){
            System.out.println("Peso Superior al normal");
        }
        if(Imc >= 30.0){
            System.out.println("Obesidad");
        }
    }
    public void actualizarSalario(){
        System.out.println("Salario actualizado: " +  salario);
    }
    
}
