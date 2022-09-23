/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.*;
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
public class MenuBarController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private MenuBar myMenuBar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void crearDepartamento(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarDepartamento.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    void crearHorarios(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarHorario.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    void registrarDocenteCatedra(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarProfesoresCatedra.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    void registrarDocenteOcacional(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarProfesoresOcacional.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    void registrarDocentePlanta(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarProfesoresPlanta.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    void registrarEsudiantes(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarEstudiantes.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    void registrarGrupos(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarGrupo.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    void registrarProgramas(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarPrograma.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    @FXML
    void listarAsignaturas(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/ListarMaterias.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
    
    @FXML
    void about(ActionEvent event){
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/About.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
    
    @FXML
    void calcularSalarioDocente(ActionEvent event){    
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/CalcularSalario.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void abrirMaterias(ActionEvent event) {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/View/IngresarAsignatura.fxml"));
			
            Stage stage = (Stage) myMenuBar.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
			
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
