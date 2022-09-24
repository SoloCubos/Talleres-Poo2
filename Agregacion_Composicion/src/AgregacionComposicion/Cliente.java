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
public class Cliente {
    
    private int codigo;
    private String nombre;
    
    private Tarjeta tarjeta;
    private Vendedor vendedor;

    public Cliente() {
        vendedor = new Vendedor();
    }

    public Cliente(int codigo, String nombre, Tarjeta tarjeta, Vendedor vendedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    
        vendedor = new Vendedor();
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

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", tarjeta=" + tarjeta.toString() + ", vendedor=" + vendedor + '}';
    }
  
}