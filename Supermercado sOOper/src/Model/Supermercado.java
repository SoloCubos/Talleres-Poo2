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
public class Supermercado {
    private ArrayList<Pedido> pedidos;
    
    private static Supermercado instance;
    
    public Supermercado getInstance(){
        if(instance == null)
            instance = new Supermercado();
        return instance;
    }
    
}
