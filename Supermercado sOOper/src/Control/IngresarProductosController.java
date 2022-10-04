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
import javafx.scene.input.MouseDragEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class IngresarProductosController implements Initializable {

    @FXML
    private AnchorPane myAnchorPane;
    @FXML
    private ListView<?> myListView;
    @FXML
    private TextField txtReferencia;
    @FXML
    private TextField txtVolumen;
    @FXML
    private TextField txtPeso;
    @FXML
    private Text cmbCategoría;
    @FXML
    private ComboBox<String> cmbTipo;
    @FXML
    private ComboBox<String> cmbCategoria;

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
    private void handleCategoriaAlimentacion(MouseDragEvent event) {
    }
    
}
