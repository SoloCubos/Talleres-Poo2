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
public class Grupo {
    private Asignatura Materia;
    private String id;
    private int capacidad;
    private ArrayList<Horario> horarios;

    public Grupo() {
        horarios = new ArrayList<>();
    }

    public Asignatura getMateria() {
        return Materia;
    }

    public void setMateria(Asignatura Materia) {
        this.Materia = Materia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void addHorarios(Horario horario) {
        this.horarios.add(horario);
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", capacidad=" + capacidad + ", horarios=" + horarios.toString() + '}';
    }
}
