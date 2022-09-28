/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author solan
 */
public class Transito {
    
    private ArrayList<Propietario> propietarios = new ArrayList<>();
    
    private String PlacaIntroducida;
    
    private static Transito instance;
    
    private Transito(){ 
    }
    
    public static Transito getInstance(){
        if(instance == null){
            instance = new Transito();
        }
        return instance;
    }
    
    public ArrayList<Propietario> getPropietarios() {
		return propietarios;
	}

	public String getPlacaIntroducida() {
		return PlacaIntroducida;
	}

	public void setPlacaIntroducida(String placa) {
		PlacaIntroducida = placa;
	}

	
}
