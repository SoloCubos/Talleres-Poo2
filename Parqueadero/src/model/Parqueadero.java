/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Solan
 */
public class Parqueadero {
    public static Integer tipo(String tipo){
        if(tipo.equals("Carro")){
            return 1;
        }if(tipo.equals("Moto")){
            return 2;
        }else return 3;
    }
    
    public static Boolean validarAuto(IngresoVehiculo i){
        if(i.getPlaca().length()==6 && i.getTipo()==1){
            return true;
        }if(i.getPlaca().length()==5 && i.getTipo()==2){
            return true;
        }else {
            return false;
        }
    }
}
