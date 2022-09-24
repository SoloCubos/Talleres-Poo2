/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgregacionComposicion;

/**
 *
 * @author solan
 */
public class Vendedor {
    
    private int codigo;
    private String nombre;

    public Vendedor() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }           
}
