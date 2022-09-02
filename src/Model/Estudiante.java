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
public class Estudiante extends Integrante{
    
    private Carrera carrera = new Carrera();
    private int semestre;
    private int creditosCursados;

    public Estudiante() {
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
    
    
    public void matricularProyectoGrado(){
     
        int creCarrera = 0;
        
        creCarrera = carrera.getCreditos();
        
        if((creditosCursados / creCarrera) * 100 >= 90 ){
            System.out.println("Estudiante " + getNombre() + ", ya puedes matricular Proyecto de Grado");
        }else{
            System.out.println("Estudiante " + getNombre() + ", NO puedes matricular Proyecto de grado");
        }
    }
}
