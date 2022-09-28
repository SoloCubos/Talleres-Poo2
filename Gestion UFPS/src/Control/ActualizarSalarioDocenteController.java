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
public class ActualizarSalarioDocenteController implements Initializable {

    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtNuevoSalario;
    
    private Fachada f;

    public ActualizarSalarioDocenteController() {
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
    private void actualizar(ActionEvent event) {
        if(!(txtCodigo.getText().isEmpty() || txtNuevoSalario.getText().isEmpty())){
            f.actualizarSalario(txtCodigo.getText(), txtNuevoSalario.getText(), "D");
            txtCodigo.clear();
            txtNuevoSalario.clear();
        }else{
            JOptionPane.showConfirmDialog(null, "Error: faltan algunos campos por rellenar", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
