/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Solan
 */
import Model.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ListarMateriasController implements Initializable{

    @FXML
    private Button btnListar;

    @FXML
    private Button btnMatricular;

    @FXML
    private ListView<String> listVehiculos;

    @FXML
    private TextField txtCodigo;
    
    private Universidad u;

    public ListarMateriasController() {
        u = Universidad.getInstance();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    @FXML
    void listar(ActionEvent event) {

    }

    @FXML
    void matricular(ActionEvent event) {

    }   
}
