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
import javafx.scene.input.MouseEvent;
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
    private Text txTipo;
    @FXML
    private ComboBox<String> cmbTipo = new ComboBox<>();
    @FXML
    private ComboBox<String> cmbCategoria = new ComboBox<>();
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        cmbCategoria.getItems().addAll("Alimentación", "Higiene", "Droguería", "Mascotas");
        cmbTipo.getItems().addAll( "Fresco", "Congelado", "No Perecedero");
    }    

    @FXML
    private void handleGuardar(ActionEvent event) {
    }

    @FXML
    private void handleCategoriaAlimentacion(MouseEvent event) {
            String c = cmbCategoria.getValue();
            if(!(c == null)){
                System.out.println("Here!!!!");
                if(c.equals("Alimentación")){
                    txTipo.setOpacity(1);
                    cmbTipo.setDisable(false); 
                }else{
                    txTipo.setOpacity(0.4);
                    cmbTipo.setDisable(true);
                    cmbTipo.setValue(null);
                }
            }
            
         
    }
    
}
