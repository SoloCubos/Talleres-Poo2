/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Fachada;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class IngresarCarreraController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtCreditosCarrera;
    
    private Fachada f;

    public IngresarCarreraController() {
        f = Fachada.getInstance();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void guardar(ActionEvent event) {
        if(!(txtNombre.getText().isEmpty() || txtCreditosCarrera.getText().isEmpty())){
            
            f.addCarreras(txtNombre.getText(), txtCreditosCarrera.getText());
            
            JOptionPane.showConfirmDialog(null, "Carrera Registrada con exito!", "Operacion Exitosa!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            txtNombre.clear();
            txtCreditosCarrera.clear();
        }else{
            JOptionPane.showConfirmDialog(null, "Error: faltan algunos campos por rellenar", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }       
    }   
}
