/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Solan
 */
public class Contenedor {
    private String referencia;
    private int volumen;
    private ArrayList<Producto> productos;

    public Contenedor() {
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProductos(Producto producto) {
        this.productos.add(producto);
    }
    
    
}
