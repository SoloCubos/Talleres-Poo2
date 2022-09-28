/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class MenuBarController {
    
    @FXML
    private MenuBar myMenuBar;

    @FXML
    private void ingresarAdministrativo(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarAdministrativo.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Ingresar Administrativos");
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    private void ingresarDocente(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarDocente.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Ingresar Docentes");
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    private void ingresarCarrera(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarCarrera.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Ingresar Carreras");
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    private void ingresarEstudiante(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarEstudiante.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Ingresar Estudiantes");
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    private void calcularIMC(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/CalcularIMC.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Calcular IMC del Docente");
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    private void actualizarSalarioDocente(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/ActualizarSalarioDocente.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Actualizar el Salario del Docente");
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    private void actualizarSalarioAdministrativo(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/ActualizarSalarioAdmin.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Actualizar el Salario del Administrativo");
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    private void proyectoGrado(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/ProyectoGrado.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Puede matricular Proyecto de Grado?");
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    private void about(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/About.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Acerca de:");
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
    
}
