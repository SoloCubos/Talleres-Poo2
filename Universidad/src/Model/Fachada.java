/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author estudiante
 */
public class Fachada {
    private static Fachada instance;
    
    public static Fachada getInstance(){
        if(instance == null)
            instance = new Fachada();
        return instance;
    }
}
