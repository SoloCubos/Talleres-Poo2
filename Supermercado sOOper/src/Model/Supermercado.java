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
public class Supermercado {//Clase Fachada
    private ArrayList<Pedido> pedidos;
    private ArrayList<Contenedor> contenedores;
    
    private static Supermercado instance;
    
    public static Supermercado getInstance(){
        if(instance == null)
            instance = new Supermercado();
        return instance;
    }

    public Supermercado() {
        pedidos = new ArrayList<>();
    }
    
    public void agregarBolsas(String referencia, String volumen, String peso, String ancho, String alto){
        Bolsa b = new Bolsa();
        b.setReferencia(referencia);
        b.setVolumen(Integer.parseInt(volumen));
        //b.set
        b.setAncho(ancho);
        
        contenedores.add(b);
    }
    
}
