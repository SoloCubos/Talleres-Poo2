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
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class IngresarEstudiantesController implements Initializable {

    @FXML
    private Button btnCrear;

    @FXML
    private ComboBox<String> cmbPrograma;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextField txtNombre;
    
    private Universidad u;

    public IngresarEstudiantesController() {
        u = Universidad.getInstance();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    void agregarEstudiante(ActionEvent event) {

    }
    
}
