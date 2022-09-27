
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author solan
 */
public class Universidad {
    
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
