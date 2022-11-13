/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Solan
 */
public class IngresoVehiculo {
    private String placa;
    private Integer modelo;
    private Integer tipo;
    private Date fecha;
    private Integer valor;

    public IngresoVehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getValor() {
        
        if(this.modelo < 2012){
            if (this.tipo == 1) { 
                valor = 2000;
            }else{
                valor = 1000;
            }
        }else{
            if (this.tipo == 1) { 
                valor = 2500;
                if (this.modelo == 2017){
                    valor = new Integer ((int) (valor*1.2));
                }
            }else{
                valor = 1200;
                if (this.modelo == 2017){
                    valor = new Integer ((int) (valor*1.1));
                }
            }    
        }return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    } 

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
   
}
