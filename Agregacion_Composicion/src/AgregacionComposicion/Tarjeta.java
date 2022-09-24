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
public class Tarjeta {
    
    private int codigo;
    private double limite;

    public Tarjeta() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "codigo=" + codigo + ", limite=" + limite + '}';
    }
    
    
    
}
