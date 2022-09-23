/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Usuario
 */
public class ProfesorPlanta extends Profesor{
    
    private int salario;
    private int puntos;
    private int valorPunto;

    public ProfesorPlanta() {
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getValorPunto() {
        return valorPunto;
    }

    public void setValorPunto(int valorPunto) {
        this.valorPunto = valorPunto;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public Departamento getDepartamento() {
        return departamento;
    }

    @Override
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int calcularSalario() {
        int totalSalario = 0;
        totalSalario = salario + (puntos*valorPunto);
        return totalSalario;
    }
    
    
}
