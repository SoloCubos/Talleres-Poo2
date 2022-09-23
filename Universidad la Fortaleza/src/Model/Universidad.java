/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Usuario(Bairon)
 * CLASE FACHADA
 */
public class Universidad {
    
    private ArrayList<Departamento> deps = new ArrayList<>();
    
    private static Universidad instance;

    private Universidad() {
        
    }
    
    public static Universidad getInstance(){
        if(instance == null)
            instance = new Universidad();
        return instance;
    }

    public void ingresarDepartamento(String codigo, String nombre, String ubicacion){
        Departamento d = new Departamento();
        d.setCodigo(codigo);
        d.setNombre(nombre);
        d.setUbicacion(ubicacion);
        
        deps.add(d);
    }
    
    public ArrayList<String> listarDepartamentos(){
        ArrayList<String> dept = new ArrayList<>();
     
        for (int i = 0; i < deps.size(); i++) {
            String nombre;
            nombre = deps.get(i).getNombre();
            dept.add(i, nombre);
        }return dept;
    }
    
    public void ingresarProfesores (String departamento, String tipo, String codigo, String nombre, String titulo, 
                                    int contrato, int horaSemanales, int valorHora, int salario, int puntoSalariales, int valorPunto){
        
        if(tipo.equals("Catedra")){//Si es Profesor de Catedra
            ProfesorCatedra pC = new ProfesorCatedra();
            
            pC.setCodigo(codigo);
            pC.setNombre(nombre);
            pC.setTitulo(titulo);
            pC.setContrato(contrato);
            pC.setHorasSemanales(horaSemanales);
            pC.setValorHora(valorHora);
            
            for(int i = 0; i < deps.size(); i++){
                if(deps.get(i).getNombre().equals(departamento)){
                    deps.get(i).addDocentesCatedra(pC);
                    pC.setDepartamento(deps.get(i));                    
                }
            }
            
            
        }if(tipo.equals("Ocacional")){
            ProfesorOcacional pO = new ProfesorOcacional();
            
            pO.setCodigo(codigo);
            pO.setNombre(nombre);
            pO.setTitulo(titulo);
            pO.setSalario(salario);
            pO.setPuntosSalariales(puntoSalariales);
            pO.setValorPunto(valorPunto);
            
            for(int i = 0; i < deps.size(); i++){
                if(deps.get(i).getNombre().equals(departamento)){
                    deps.get(i).addDocentesOcacional(pO);
                    pO.setDepartamento(deps.get(i));
                }
            }
            
        }if(tipo.equals("Planta")){
            ProfesorPlanta pP = new ProfesorPlanta();
            
            pP.setCodigo(codigo);
            pP.setNombre(nombre);
            pP.setTitulo(titulo);
            pP.setSalario(salario);
            pP.setPuntos(puntoSalariales);
            pP.setValorPunto(valorPunto);
            
            for(int i = 0; i < deps.size(); i++){
                if(deps.get(i).getNombre().equals(departamento)){
                    deps.get(i).addDocentesPlanta(pP);
                    pP.setDepartamento(deps.get(i));
                }
            }
        }
        
        
    }
    
    public ArrayList<String> listaProfesores(){
        ArrayList<String> profes = new ArrayList<>();
        
        for(int i = 0; i < deps.size(); i++){
            String nombre;
            
            for(int j = 0; j < deps.get(i).getDocentesCatedra().size(); j++){
                nombre = deps.get(i).getDocentesCatedra().get(j).getNombre();
                profes.add(j, nombre);
            }
            for(int j = 0; j < deps.get(i).getDocentesOcacional().size(); j++){
                nombre = deps.get(i).getDocentesOcacional().get(j).getNombre();
                profes.add(j, nombre);               
            }
            for(int j = 0; j < deps.get(i).getDocentesPlanta().size(); j++){
                nombre = deps.get(i).getDocentesPlanta().get(j).getNombre();
                profes.add(j, nombre);        
            }
            
        }return profes;
    }
    
    public void ingresarPrograma(String departamento, String codigo, String nombres, String director){
        Programa p = new Programa();
        p.setCodigo(codigo);
        p.setNombre(nombres);
        
        for (int i = 0; i < deps.size(); i++) {
            if(deps.get(i).getNombre().equals(departamento)){
                p.setDepartamento(deps.get(i));
                
            }for(int j = 0; j < deps.get(i).getDocentesPlanta().size(); j++){
                
                if(deps.get(i).getDocentesPlanta().get(j).getNombre().equals(director)){
                    p.setDirector(deps.get(i).getDocentesPlanta().get(j));
                }
            }
            deps.get(i).addProgramas(p);
        }
    }
    
    public ArrayList<String> listaProgramas(){
        ArrayList<String> p = new ArrayList<>();
        for (int i = 0; i < deps.size(); i++) {
            for(int j = 0; j < deps.get(i).getProgramas().size(); j++){
                String pograma;
                pograma = deps.get(i).getProgramas().get(j).getNombre();
                p.add(pograma);
            }
        }
        return p;
    }
    
    public void ingresarAsignatura(String codigo, String nombre, int creditos, String programa){
        Asignatura materia = new Asignatura();
        materia.setCodigo(codigo);
        materia.setNombre(nombre);
        materia.setCreditos(creditos);
        
        for(int i = 0; i < deps.size(); i++){
            for(int j = 0; j < deps.get(i).getProgramas().size(); j++){
                if(deps.get(i).getProgramas().get(j).getNombre().equals(programa)){
                    materia.setPrograma(deps.get(i).getProgramas().get(j));
                    deps.get(i).getProgramas().get(j).addMaterias(materia);
                }            
            }
        }
    }
    
    public ArrayList<String> listaMaterias(){
        ArrayList<String> m = new ArrayList<>();
        
        for(int i = 0; i < deps.size(); i++){
            for(int j = 0; j < deps.get(i).getProgramas().size(); j++){
                for(int h = 0; h < deps.get(i).getProgramas().get(j).getMaterias().size(); h++){
                    String materia;
                    materia = deps.get(i).getProgramas().get(j).getMaterias().get(h).getNombre();
                    m.add(materia);
                }
            }
        }
        return m;
    }
    
    public void ingresarGrupo (String materia, String id, int capacidad){
        Grupo g = new Grupo();
        g.setId(id);
        g.setCapacidad(capacidad);
        for(int i = 0; i < deps.size(); i++){
            for(int j = 0; j < deps.get(i).getProgramas().size(); j++){
                for(int h = 0; h < deps.get(i).getProgramas().get(j).getMaterias().size(); h++){
                    g.setMateria(deps.get(i).getProgramas().get(j).getMaterias().get(h));
                    deps.get(i).getProgramas().get(j).getMaterias().get(h).addGrupos(g);
                }
            }
        }
    }
    
    public void ingresarHorarios (Horario h, Grupo g, Asignatura a, Departamento d, Programa p){
        deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).getMaterias().get(deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).getMaterias().indexOf(a)).getGrupos().get(deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).getMaterias().get(deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).getMaterias().indexOf(a)).getGrupos().indexOf(g)).getHorarios().add(h);
    }
    
    public void ingresarEstudiante(Estudiante e, Departamento d, Programa p){
        deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).addEstudiantes(e);
    }
    
    
    
    
    
    
    
    
    
    
}
