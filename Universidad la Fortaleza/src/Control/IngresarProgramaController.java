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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class IngresarProgramaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button btnCrear;

    @FXML
    private ComboBox<String> cmbDepartamento;

    @FXML
    private ComboBox<String> cmbDirector;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;
    
    private Universidad u;

    public IngresarProgramaController() {
        u = Universidad.getInstance();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbDepartamento.getItems().addAll(u.listarDepartamentos());
        cmbDirector.getItems().addAll(u.listaProfesores());
    }    
    
    @FXML
    void crearPrograma(ActionEvent event) {
        if(!(cmbDepartamento.getValue().isEmpty() || cmbDirector.getValue().isEmpty() || txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty())){
            u.ingresarPrograma(cmbDepartamento.getValue(), txtCodigo.getText(), txtNombre.getText(), cmbDirector.getValue());
            JOptionPane.showConfirmDialog(null, "Programa Registrado con exito!", "Operacion Exitosa!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            cmbDepartamento.setValue("");
            txtCodigo.clear();
            txtNombre.clear();
            cmbDirector.setValue("");
            
        }else{
            JOptionPane.showConfirmDialog(null, "Error: faltan algunos campos por rellenar", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
