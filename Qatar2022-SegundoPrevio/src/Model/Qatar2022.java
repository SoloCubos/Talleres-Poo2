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
    
    public boolean actualizarSeleccion(String id, String nombre, String continenteId, String tecnico, String golesFavor, String golesContra, String partidosGanados, String partidosPerdidos, String partidosJugados){
        
        Seleccion s = new Seleccion();
        SeleccionDAO DAO = new SeleccionDAO();
        ContinenteDAO CDAO = new ContinenteDAO();
        Continente c = new Continente();
        
        System.out.println(continenteId.charAt(0) + "");
        
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
    
    public ArrayList<String> mejoresEquiposDifGoles(){
        ArrayList<String> sA = new ArrayList<>();
        SeleccionDAO DAO = new SeleccionDAO();
        float promedioGoles = 0;
        if (DAO.listaSelecciones() != null){
            for (int i = 0; i < DAO.listaSelecciones().size(); i++) {              
                promedioGoles = (promedioGoles + (DAO.listaSelecciones().get(i).getGolesFavor() - DAO.listaSelecciones().get(i).getGolesContra())) / DAO.listaSelecciones().size();
            }
            for (int i = 0; i < DAO.listaSelecciones().size(); i++) {              
                if(DAO.listaSelecciones().get(i).getGolesFavor() - DAO.listaSelecciones().get(i).getGolesContra() > promedioGoles){
                    sA.add(DAO.listaSelecciones().get(i).toString());
                }
            }
        }if(!sA.isEmpty()) return sA;
        
        else return null;
    }
    
    public ArrayList<String> mejoresEquiposPartidosGanados(){
        ArrayList<String> sA = new ArrayList<>();
        SeleccionDAO DAO = new SeleccionDAO();
        float promedioPartidosGanados = 0;
        if (DAO.listaSelecciones() != null){
            for (int i = 0; i < DAO.listaSelecciones().size(); i++) {   
                
                promedioPartidosGanados = (promedioPartidosGanados + DAO.listaSelecciones().get(i).getPartidosGanados()) / DAO.listaSelecciones().size();
            }
            for (int i = 0; i < DAO.listaSelecciones().size(); i++) {    
                
                if(DAO.listaSelecciones().get(i).getPartidosGanados() > promedioPartidosGanados){
                    sA.add(DAO.listaSelecciones().get(i).toString());
                }
            }
        }if(!sA.isEmpty()) return sA;
        
        else return null;
    }
}
