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
public class ProyectoGradoController implements Initializable {

    @FXML
    private TextField txtCodigo;
    
    private Fachada f;

    public ProyectoGradoController() {
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
    private void consultar(ActionEvent event) {
        if(!txtCodigo.getText().isEmpty()){
            f.proyectoGrado(txtCodigo.getText());
            
            txtCodigo.clear();
        }else{
            JOptionPane.showConfirmDialog(null, "Por favor dijite su Codigo de Estudiante", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
