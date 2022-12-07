/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.DAO;

import Model.Continente;
import Model.Seleccion;
import Services.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author solan
 */
public class SeleccionDAO {
    public boolean guardar(Seleccion s){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO seleccion (id, nombre, continente_id, tecnico, goles_favor, goles_contra, partidos_ganados, partidos_perdidos, partidos_jugados) " + 
                                                 "VALUES(?, ?, ?, ?, ?, ?, ? ,? ,?)");  
            
            consulta.setInt(1, s.getId());
            consulta.setString(2, s.getNombre());
            consulta.setInt(3, s.getContinente().getId());
            consulta.setString(4, s.getTecnico());
            consulta.setInt(5, s.getGolesFavor());
            consulta.setInt(6, s.getGolesContra());
            consulta.setInt(7, s.getPartidosGanados());
            consulta.setInt(8, s.getPartidosPerdidos());
            consulta.setInt(9, s.getPartidosJugados());
            
            
            consulta.executeUpdate();
            
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            
            return false;
        }
    }
    
    public boolean eliminar(int id){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("DELETE FROM seleccion WHERE id = " + id);        
            consulta.executeUpdate();
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return false;
        }
    }
    
    public boolean actualizar(Seleccion s){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            
            consulta = conexion.prepareStatement("UPDATE seleccion SET nombre = " + s.getNombre() + 
                                                                    ", continente_id = " + s.getContinente().getId() +
                                                                    ", tecnico = " + s.getTecnico() +
                                                                    ", goles_favor = " + s.getGolesFavor() + 
                                                                    ", goles_contra = " + s.getGolesContra() +
                                                                    ", partidos_ganados = " + s.getPartidosGanados()+
                                                                    ", partidos_perdidos = " + s.getPartidosPerdidos()+
                                                                    ", pertidos_jugados = " + s.getPartidosJugados() +
                                                                    "WHERE cedula = " + s.getId());       
            
            consulta.executeUpdate();
            
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return false;
        }
    }
    
    public ArrayList<Seleccion> listaSelecciones(){
        try{
            
            ArrayList<Seleccion> sA = new ArrayList<>();
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM seleccion");        
            ResultSet rs = consulta.executeQuery();
            
            
            while(rs.next()){
                
                Seleccion s = new Seleccion();
                ContinenteDAO DAO = new ContinenteDAO();
                Continente c = DAO.getContinente(rs.getInt("continente_id"));
                
                s.setId(rs.getInt("id"));
                s.setNombre(rs.getString("nombre"));
                s.setContinente(c);
                s.setTecnico(rs.getString("tecnico"));
                s.setGolesFavor(rs.getInt("goles_favor"));
                s.setGolesContra(rs.getInt("goles_contra"));
                s.setPartidosGanados(rs.getInt("partidos_ganados"));
                s.setPartidosPerdidos(rs.getInt("partidos_perdidos"));
                s.setPartidosJugados(rs.getInt("partidos_jugados"));
                
                sA.add(s);
                
            }
            return sA;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return null;
        }
    }
    
    public Seleccion getSeleccion(int id){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM continente WHERE id = " + id);        
            ResultSet rs = consulta.executeQuery();
            
            ContinenteDAO DAO = new ContinenteDAO();
            Seleccion s = new Seleccion();
            Continente c = DAO.getContinente(rs.getInt("continente_id"));
                
            if(rs.next()){

                s.setId(rs.getInt("id"));
                s.setNombre(rs.getString("nombre"));
                s.setContinente(c);
                s.setTecnico(rs.getString("tecnico"));
                s.setGolesFavor(rs.getInt("goles_favor"));
                s.setGolesContra(rs.getInt("goles_contra"));
                s.setPartidosGanados(rs.getInt("partidos_ganados"));
                s.setPartidosPerdidos(rs.getInt("partidos_perdidos"));
                s.setPartidosJugados(rs.getInt("partidos_jugados"));
            }
            return s;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return null;
        }
    }
}
