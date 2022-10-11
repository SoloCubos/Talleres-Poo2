/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Supermercado;
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
public class IngresarBolsasController implements Initializable {

    @FXML
    private AnchorPane myAnchorPane;
    @FXML
    private TextField txtReferencia;
    @FXML
    private TextField txtVolumen;
    @FXML
    private TextField txtPeso;
    @FXML
    private TextField txtAncho;
    @FXML
    private TextField txtAlto;
    @FXML
    private ListView<String> myListView;
    @FXML
    private Label lblBolsas;
    
    private Supermercado s;

    public IngresarBolsasController() {
        s = Supermercado.getInstance();
    }

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
