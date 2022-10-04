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
public class Pedido {
    private String referencia;
    private ArrayList<Contenedor> contenedores;

    public Pedido() {
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public ArrayList<Contenedor> getContenedores() {
        return contenedores;
    }

    public void addContenedor(Contenedor contenedor) {
        this.contenedores.add(contenedor);
    }
    
    
}
