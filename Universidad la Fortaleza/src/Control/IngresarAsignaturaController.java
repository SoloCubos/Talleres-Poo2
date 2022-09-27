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
public class IngresarAsignaturaController implements Initializable {

    @FXML
    private Button btnCrear;
    @FXML
    private ComboBox<String> cmbDepartamento;
    @FXML
    private ComboBox<String> cmbPrograma;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;
    
    @FXML
    private TextField txtCreditos;
    
    private Universidad u;

    public IngresarAsignaturaController() {
        u = Universidad.getInstance();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbDepartamento.getItems().addAll(u.listarDepartamentos());
    }    
    
    @FXML
    void consultar(ActionEvent event){
        cmbPrograma.getItems().clear();
        cmbPrograma.getItems().addAll(u.listaProgramas(cmbDepartamento.getValue()));
    }
    
    @FXML
    void crearMaterias(ActionEvent event) {
        if(!(cmbDepartamento.getValue().isEmpty() || cmbPrograma.getValue().isEmpty() || txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtCreditos.getText().isEmpty())){
            u.ingresarAsignatura(txtCodigo.getText(), txtNombre.getText(), Integer.parseInt(txtCreditos.getText()), cmbPrograma.getValue(), cmbDepartamento.getValue());
            JOptionPane.showConfirmDialog(null, "Materia Registrada con exito!", "Operacion Exitosa!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            cmbPrograma.setValue("");
            txtCodigo.clear();
            txtNombre.clear();
            txtCreditos.clear();
        }else{
            JOptionPane.showConfirmDialog(null, "Error: faltan algunos campos por rellenar", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
}
