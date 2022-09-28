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
public class Estudiante extends Integrante{
    
    private Carrera carrera = new Carrera();
    private int semestre;
    private int creditosCursados;

    public Estudiante() {
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

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCreditosCursados() {
        return creditosCursados;
    }
    
    public void setCreditosCursados(int creditosCursados) {
        this.creditosCursados = creditosCursados;
    }
    
    
    public Boolean matricularProyectoGrado(){
        boolean validar = false;
               
        if((creditosCursados / carrera.getCreditos()) * 100 >= 90 ){
            JOptionPane.showConfirmDialog(null, "Estudiante " + getNombre() + ", ya puedes matricular Proyecto de Grado", "Enhorabuena!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Estudiante " + getNombre() + ", ya puedes matricular Proyecto de Grado");
            validar =  true;
        }else{
            JOptionPane.showConfirmDialog(null, "Estudiante " + getNombre() + ", NO puedes matricular Proyecto de grado", "F!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            System.out.println("Estudiante " + getNombre() + ", NO puedes matricular Proyecto de grado");
            validar = false;
        }return validar;
    }
}
