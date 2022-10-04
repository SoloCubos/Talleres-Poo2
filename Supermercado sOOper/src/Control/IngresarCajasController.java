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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class IngresarCajasController implements Initializable {

    @FXML
    private AnchorPane myAnchorPane;
    @FXML
    private TextField txtReferencia;
    @FXML
    private TextField txtVolumen;
    @FXML
    private TextField txtAncho;
    @FXML
    private TextField txtLargo;
    @FXML
    private TextField txtAlto;
    @FXML
    private ListView<?> myListView;
    @FXML
    private Label lblCajas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleGuardar(ActionEvent event) {
    }

    @FXML
    private void handleRegresar(ActionEvent event) {
    }
    
}
