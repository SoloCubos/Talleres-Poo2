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
public abstract class Profesor {
    protected String codigo;
    protected String nombre;
    protected String titulo;
    protected Departamento departamento;
    

    public Profesor() {
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public abstract int calcularSalario();

    @Override
    public String toString() {
        return "Profesor{" + "codigo=" + codigo + ", nombre=" + nombre + ", titulo=" + titulo + ", departamento=" + departamento.toString() + '}';
    }
    
    
}