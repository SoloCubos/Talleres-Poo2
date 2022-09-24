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
public class Main {
    
    private Cliente cliente;

    public Main() {
        this.cliente = new Cliente();
    }
    
    public void Cargar(){
        cliente.setCodigo(69);
        cliente.setNombre("Juan");
        
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.setCodigo(565648796);
        tarjeta.setLimite(50);
        
        cliente.setTarjeta(tarjeta);
        
        cliente.getVendedor().setCodigo(59);
        cliente.getVendedor().setNombre("Marcos");
        
    }
    
    public void Imprimir(){
        System.out.println(cliente.toString());
    }
    
    public static void main(String[] args){
        Main m = new Main();
        m.Cargar();
        m.Imprimir();
    }
    
}
