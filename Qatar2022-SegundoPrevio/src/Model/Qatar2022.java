/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Services.DAO.ContinenteDAO;
import Services.DAO.SeleccionDAO;
import java.util.ArrayList;

/**
 *
 * @author solan
 */
public class Qatar2022 {
    
    private static Qatar2022 instance;
    
    public static Qatar2022 getInstance(){
        if (instance == null){
            instance = new Qatar2022();
        }return instance;
    }
    
    public boolean registrarContinente(String id, String nombre){
        Continente c = new Continente();
        ContinenteDAO DAO = new ContinenteDAO();
        c.setId(Integer.parseInt(id));
        c.setNombre(nombre);
        
        return DAO.guardar(c);
    }
    
    public ArrayList<String> listaContinentes(){
        ArrayList<String> cA = new ArrayList<>();
        ContinenteDAO DAO = new ContinenteDAO();
        if (DAO.listaContinentes() != null){
            for (int i = 0; i < DAO.listaContinentes().size(); i++) {
                
                cA.add(DAO.listaContinentes().get(i).getId() + " - " + DAO.listaContinentes().get(i).getNombre());
            }
        }       
        return cA;
    }
    
    public boolean registrarSeleccion(String id, String nombre, String continenteId, String tecnico, String golesFavor, String golesContra, String partidosGanados, String partidosPerdidos, String partidosJugados){
        Seleccion s = new Seleccion();
        SeleccionDAO DAO = new SeleccionDAO();
        ContinenteDAO CDAO = new ContinenteDAO();
        Continente c = new Continente();
        
        c = CDAO.getContinente(Integer.parseInt(continenteId.charAt(0) + ""));
        
        s.setId(Integer.parseInt(id));
        s.setNombre(nombre);
        s.setContinente(c);
        s.setTecnico(tecnico);
        s.setGolesFavor(Integer.parseInt(golesFavor));
        s.setGolesContra(Integer.parseInt(golesContra));
        s.setPartidosGanados(Integer.parseInt(partidosGanados));
        s.setPartidosPerdidos(Integer.parseInt(partidosPerdidos));
        s.setPartidosJugados(Integer.parseInt(partidosJugados));
        
        return DAO.guardar(s);
    }
    
    public boolean acrualizarSeleccion(String id, String nombre, String continenteId, String tecnico, String golesFavor, String golesContra, String partidosGanados, String partidosPerdidos, String partidosJugados){
        
        Seleccion s = new Seleccion();
        SeleccionDAO DAO = new SeleccionDAO();
        ContinenteDAO CDAO = new ContinenteDAO();
        Continente c = new Continente();
        
        c = CDAO.getContinente(Integer.parseInt(continenteId.charAt(0) + ""));
        
        s.setId(Integer.parseInt(id));
        s.setNombre(nombre);
        s.setContinente(c);
        s.setGolesFavor(Integer.parseInt(golesFavor));
        s.setGolesContra(Integer.parseInt(golesContra));
        s.setPartidosGanados(Integer.parseInt(partidosGanados));
        s.setPartidosPerdidos(Integer.parseInt(partidosPerdidos));
        s.setPartidosJugados(Integer.parseInt(partidosJugados));
        
        return DAO.actualizar(s);
    }
    
    public ArrayList<String> listaSeleccionesCorta(){
        ArrayList<String> sA = new ArrayList<>();
        SeleccionDAO DAO = new SeleccionDAO();
        if (DAO.listaSelecciones() != null){
            for (int i = 0; i < DAO.listaSelecciones().size(); i++) {              
                sA.add(DAO.listaSelecciones().get(i).getId() + " - " + DAO.listaSelecciones().get(i).getNombre());
            }
        }  
        return sA;
    }
    
    public ArrayList<String> listaSeleccionesLarga(){
        ArrayList<String> sA = new ArrayList<>();
        SeleccionDAO DAO = new SeleccionDAO();
        if (DAO.listaSelecciones() != null){
            for (int i = 0; i < DAO.listaSelecciones().size(); i++) {               
                sA.add(DAO.listaSelecciones().get(i).toString());
            }
        }  
        return sA;
    }
    
    public boolean eliminarSeleccion(String id){
        SeleccionDAO DAO = new SeleccionDAO();
        return DAO.eliminar(Integer.parseInt(id.charAt(4) + ""));
    }
}
