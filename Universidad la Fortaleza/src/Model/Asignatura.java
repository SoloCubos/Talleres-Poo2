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
public class Asignatura {
    private String codigo;
    private String nombre;
    private int creditos;
    private Programa programa;
    private ArrayList<Grupo> grupos;

    public Asignatura() {
        grupos = new ArrayList<>();
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void addGrupos(Grupo grupos) {
        this.grupos.add(grupos);
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + ", grupos=" + grupos.toString() + '}';
    }
    
    
    
}