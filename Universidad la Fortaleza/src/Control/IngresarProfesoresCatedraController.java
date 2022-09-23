/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.*;
import java.net.URL;
import java.util.ArrayList;
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
public class IngresarProfesoresCatedraController implements Initializable {

    @FXML
    private Button btnCrear;

    @FXML
    private ComboBox<String> cmbDepartamento;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtContrato;

    @FXML
    private TextField txtHorasSemanales;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPagaHora;

    @FXML
    private TextField txtTitulo;
    
    private Universidad u;

    public IngresarProfesoresCatedraController() {
        u = Universidad.getInstance();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbDepartamento.getItems().addAll(u.listarDepartamentos());   
    }    
    
    @FXML
    void agregarDocente(ActionEvent event) {
        
        if(!(cmbDepartamento.getValue().isEmpty() || txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtTitulo.getText().isEmpty() || 
        txtContrato.getText().isEmpty() || txtHorasSemanales.getText().isEmpty() || txtPagaHora.getText().isEmpty())){
            
            u.ingresarProfesores(cmbDepartamento.getValue(), "Catedra", txtCodigo.getText(), txtNombre.getText(), txtTitulo.getText(), 
                                Integer.parseInt(txtContrato.getText()), Integer.parseInt(txtHorasSemanales.getText()), Integer.parseInt(txtPagaHora.getText()), 0, 0, 0);
            
            JOptionPane.showConfirmDialog(null, "Docente Registrado con exito!", "Operacion Exitosa!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            cmbDepartamento.setValue("");
            txtCodigo.clear();
            txtNombre.clear();
            txtTitulo.clear();
            txtContrato.clear();
            txtHorasSemanales.clear();
            txtPagaHora.clear();
        }else{
            JOptionPane.showConfirmDialog(null, "Error: faltan algunos campos por rellenar", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
