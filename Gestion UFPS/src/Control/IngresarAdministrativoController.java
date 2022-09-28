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
public class IngresarAdministrativoController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtAnoIngreso;
    @FXML
    private TextField txtSalario;
    
    private Fachada f;

    public IngresarAdministrativoController() {
        f = Fachada.getInstance();
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void guardar(ActionEvent event) {
        if(!(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCodigo.getText().isEmpty() || txtSalario.getText().isEmpty() || txtAnoIngreso.getText().isEmpty())){
            
            f.addAdmins(txtNombre.getText(), txtApellido.getText(), txtCodigo.getText(), txtSalario.getText(), txtAnoIngreso.getText());
            
            JOptionPane.showConfirmDialog(null, "Administrativo Registrado con exito!", "Operacion Exitosa!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            txtNombre.clear();
            txtApellido.clear();
            txtCodigo.clear();
            txtSalario.clear();
            txtAnoIngreso.clear();
            
        }else{
            JOptionPane.showConfirmDialog(null, "Error: faltan algunos campos por rellenar", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
