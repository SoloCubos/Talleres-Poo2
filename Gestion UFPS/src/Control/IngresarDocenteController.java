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
public class IngresarDocenteController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtProfesion;
    @FXML
    private TextField txtSalario;
    @FXML
    private TextField txtEstatura;
    @FXML
    private TextField txtPeso;
    
    private Fachada f;

    public IngresarDocenteController() {
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
    private void guardarDocente(ActionEvent event) {
        if(!(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCodigo.getText().isEmpty() || txtSalario.getText().isEmpty() || 
             txtProfesion.getText().isEmpty() || txtEstatura.getText().isEmpty() || txtPeso.getText().isEmpty())){
            
            f.addDocentes(txtNombre.getText(), txtApellido.getText(), txtCodigo.getText(), txtProfesion.getText(), txtSalario.getText(), txtEstatura.getText(), txtPeso.getText());
            
            JOptionPane.showConfirmDialog(null, "Docente Registrado con exito!", "Operacion Exitosa!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            txtNombre.clear();
            txtApellido.clear();
            txtCodigo.clear();
            txtSalario.clear();
            txtProfesion.clear();
            txtEstatura.clear();
            txtPeso.clear();
            
        }else{
            JOptionPane.showConfirmDialog(null, "Error: faltan algunos campos por rellenar", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
