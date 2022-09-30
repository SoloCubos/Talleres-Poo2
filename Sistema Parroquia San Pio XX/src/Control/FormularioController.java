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
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author solan
 */
public class FormularioController implements Initializable {

    @FXML
    private TextField txtCelula;
    @FXML
    private TextField txtPague;
    @FXML
    private ListView<?> myListView;
    @FXML
    private TextField txtCedula;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtEstrato;
    @FXML
    private ComboBox<?> cmbEstado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleActionConsultar(ActionEvent event) {
    }

    @FXML
    private void handleActionPagar(ActionEvent event) {
    }

    @FXML
    private void handleActionTotalizar(ActionEvent event) {
    }

    @FXML
    private void handleActionGuardar(ActionEvent event) {
    }

    @FXML
    private void handleActionEliminar(ActionEvent event) {
    }

    @FXML
    private void handleActionBuscar(ActionEvent event) {
    }

    @FXML
    private void handleActionActualizar(ActionEvent event) {
    }
    
}
