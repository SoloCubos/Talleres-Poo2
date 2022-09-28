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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class IngresarEstudianteController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtSemestre;
    @FXML
    private TextField txtCreditosAprobados;
    @FXML
    private ComboBox<String> cmbCarrera;
    
    private Fachada f;

    public IngresarEstudianteController() {
        f = Fachada.getInstance();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbCarrera.setPromptText("Seleccione:");
        cmbCarrera.getItems().clear();
        cmbCarrera.getItems().addAll(f.listarCarreras());
    }    

    @FXML
    private void guardar(ActionEvent event) {
        if(!(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCodigo.getText().isEmpty() || 
             txtCreditosAprobados.getText().isEmpty() || txtSemestre.getText().isEmpty() || cmbCarrera.getValue().isEmpty())){
            
            JOptionPane.showConfirmDialog(null, "Estudiante Registrado con exito!", "Operacion Exitosa!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            txtNombre.clear();
            txtApellido.clear();
            txtCodigo.clear();
            txtSemestre.clear();
            txtCreditosAprobados.clear();
            cmbCarrera.setValue(null);
            
        }else{
            JOptionPane.showConfirmDialog(null, "Error: faltan algunos campos por rellenar", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
