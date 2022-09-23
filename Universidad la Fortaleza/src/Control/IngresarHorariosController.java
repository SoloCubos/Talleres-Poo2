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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class IngresarHorariosController implements Initializable {

    @FXML
    private Button btnCrear;

    @FXML
    private ComboBox<String> cmbDia;

    @FXML
    private ComboBox<String> cmbGrupo;

    @FXML
    private TextField txtFin;

    @FXML
    private TextField txtInicio;

    @FXML
    private TextField txtSalon;
    
    private Universidad u;

    public IngresarHorariosController() {
        u = Universidad.getInstance();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
     @FXML
    void agregarHorario(ActionEvent event) {

    }
}
