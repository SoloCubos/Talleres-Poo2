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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class CalcularSalarioController implements Initializable {

    @FXML
    private TextField txtCodDocente;
    @FXML
    private Button btnCalcularSalario;
    
    private Universidad u;

    public CalcularSalarioController() {
        u = Universidad.getInstance();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calcularSalarioDocente(ActionEvent event) {
        
    }
    
}
