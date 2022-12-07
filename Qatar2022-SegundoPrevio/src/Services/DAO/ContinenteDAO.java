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
public class ContinenteDAO {
    public boolean guardar(Continente c){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO continente (id, nombre) " + 
                                                 "VALUES(?, ?)");  
            
            consulta.setInt(1, c.getId());
            consulta.setString(2, c.getNombre());
            
            consulta.executeUpdate();
            
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            
            return false;
        }
    }

    
    public ArrayList<Continente> listaContinentes(){
        try{
            
            ArrayList<Continente> cA = new ArrayList<>();
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM continente");        
            ResultSet rs = consulta.executeQuery();
            
            
            while(rs.next()){
                Continente n = new Continente();

                n.setId(rs.getInt("id"));
                n.setNombre(rs.getString("nombre"));
                
                cA.add(n);
                
            }
            return cA;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return null;
        }
    }
    
    public Continente getContinente(int id){
        try{
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM continente WHERE id = " + id);        
            ResultSet rs = consulta.executeQuery();
            Continente n = new Continente();
            
            if(rs.next()){

                n.setId(rs.getInt("id"));
                n.setNombre(rs.getString("nombre"));

            }
            return n;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return null;
        }
    }
}
