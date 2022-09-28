
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author solan
 */
public class Fachada {
    
    private ArrayList <Docente> docentes = new ArrayList<>();
    private ArrayList <Administrativo> admins = new ArrayList<>();
    private ArrayList <Carrera> carreras =  new ArrayList<>();
    private ArrayList <Estudiante> estudiantes =  new ArrayList<>();
    
    private static Fachada instance;

    private Fachada() {
    }
    
    public static Fachada getInstance(){
        if(instance == null)
            instance = new Fachada();
        return instance;
    }
    
    
    
    public void addDocentes(String nombre, String apellido, String codigo, String profesion,
                            String salario, String estatura, String peso){
        Docente d =  new Docente();
        d.setNombre(nombre);
        d.setApellido(apellido);
        d.setCodigo(codigo);
        d.setProfesion(profesion);
        d.setSalario(Integer.parseInt(salario));
        d.setEstatura(Double.parseDouble(estatura));
        d.setPeso(Double.parseDouble(peso));
        
        docentes.add(d);
    }
    
    public void addAdmins(String nombre, String apellido, String codigo,
                          String salario, String anoIngreso){
        Administrativo a = new Administrativo();
        a.setNombre(nombre);
        a.setApellido(apellido);
        a.setCodigo(codigo);
        a.setSalario(Integer.parseInt(salario));
        a.setAnoIngreso(Integer.parseInt(anoIngreso));
        
        admins.add(a);
    }
    
    public void addCarreras(String nombre, String creditos){
        Carrera c =  new Carrera();
        c.setNombre(nombre);
        c.setCreditos(Integer.parseInt(creditos));
        
        carreras.add(c);
    }
    
    public void addEstudiantes(String nombre, String apellido, String codigo,
                               String carrera, String semestre, String creditos){
        Estudiante e = new Estudiante();
        e.setNombre(nombre);
        e.setApellido(apellido);
        e.setCodigo(codigo);
        e.setCreditosCursados(Integer.parseInt(creditos));
        e.setSemestre(Integer.parseInt(semestre));
        for(int i = 0; i < carreras.size(); i++){
            if(carreras.get(i).getNombre().equals(nombre)){
                e.setCarrera(carreras.get(i));
            }
        }
        estudiantes.add(e);
    }
    /**
    public static void main(String[] args){
        
        //Docente
        Docente docente = new Docente();
        
        docente.setNombre("Claudia Yamile");
        docente.setApellido("Gomes Yañes");
        docente.setCodigo("1155305");
        docente.setProfesion("Ingeniero de Sistemas");
        docente.setSalario(20000000);
        docente.setEstatura(1.67);
        docente.setPeso(58.2);
        //si adiviné su estatura y peso me sube una decima :D
        
        System.out.println("Calculando Indice de Masa Corporal del Docente...");
        docente.calcularImc();
        System.out.println("Actualizando Salario...");
        docente.actualizarSalario();
        
        System.out.println("---------------------------");
        
        //Estudiante
        
        Estudiante estudiante =  new Estudiante();
        Carrera carrera1 = new Carrera();
        
        carrera1.setNombre("Sistemas");
        carrera1.setCreditos(150);
        
        estudiante.setNombre("Juan Fernando");
        estudiante.setApellido("Solano Aguilar");
        estudiante.setCodigo("1151977");
        estudiante.setCarrera(carrera1);
        estudiante.setSemestre(7);
        estudiante.setCreditosCursados(69);
        
        System.out.println("Verificando si puede matricular Proyecto de Grado...");
        estudiante.matricularProyectoGrado();
        
        //Admiinstrativo
        System.out.println("---------------------------");
        
        Administrativo admin = new Administrativo();
        admin.setNombre("Noris");
        admin.setApellido("Pamela");
        admin.setCodigo("123456");
        admin.setSalario(2500000);
        admin.setAnoIngreso(1998);
        
        System.out.println("Calculando Veterania del funcionario...");
        admin.calcularVeterania();
        System.out.println("Actualizando Salario...");
        admin.actualizarSalario();
    }
*/
    
}
