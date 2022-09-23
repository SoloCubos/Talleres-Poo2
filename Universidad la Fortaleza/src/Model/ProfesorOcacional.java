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
public class ProfesorOcacional extends Profesor{
    
    private int salario;
    private int puntosSalariales;
    private int valorPunto;

    public ProfesorOcacional() {
    }
 
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getPuntosSalariales() {
        return puntosSalariales;
    }

    public void setPuntosSalariales(int puntosSalariales) {
        this.puntosSalariales = puntosSalariales;
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
        int totalSalario;
        totalSalario = salario + (puntosSalariales*valorPunto);
        return totalSalario;
    }

    
    
}
