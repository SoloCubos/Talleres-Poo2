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
import java.util.ArrayList;
public class Departamento {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private ArrayList <Programa> programas;
    private ArrayList <ProfesorCatedra> docentesCatedra;
    private ArrayList <ProfesorOcacional> docentesOcacional;
    private ArrayList <ProfesorPlanta> docentesPlanta;

    public Departamento() {
        programas = new ArrayList<>();
        docentesCatedra = new ArrayList<>();
        docentesOcacional = new ArrayList<>();
        docentesPlanta = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    public void addProgramas(Programa programa) {
        this.programas.add(programa);
    }

    public ArrayList<ProfesorCatedra> getDocentesCatedra() {
        return docentesCatedra;
    }

    public void addDocentesCatedra(ProfesorCatedra docente) {
        this.docentesCatedra.add(docente);
    }
    
    public ArrayList<ProfesorOcacional> getDocentesOcacional() {
        return docentesOcacional;
    }

    public void addDocentesOcacional(ProfesorOcacional docente) {
        this.docentesOcacional.add(docente);
    }
    
    public ArrayList<ProfesorPlanta> getDocentesPlanta() {
        return docentesPlanta;
    }

    public void addDocentesPlanta(ProfesorPlanta docente) {
        this.docentesPlanta.add(docente);
    }
}
