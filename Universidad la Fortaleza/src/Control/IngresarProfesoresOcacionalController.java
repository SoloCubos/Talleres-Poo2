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
public class IngresarProfesoresOcacionalController implements Initializable {

    @FXML
    private Button btnCrear;

    @FXML
    private ComboBox<String> cmbDepartamento;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPuntosSalariales;

    @FXML
    private TextField txtSalario;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtValorPunto;
    
    private Universidad u;

    public IngresarProfesoresOcacionalController() {
        u = Universidad.getInstance();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbDepartamento.getItems().addAll(u.listarDepartamentos());
    }    
    
    @FXML
    void agregarDocente(ActionEvent event) {
        if(!(cmbDepartamento.getValue().isEmpty() || txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtTitulo.getText().isEmpty() || 
        txtSalario.getText().isEmpty() || txtPuntosSalariales.getText().isEmpty() || txtValorPunto.getText().isEmpty())){
            
            u.ingresarProfesores(cmbDepartamento.getValue(), "Ocacional", txtCodigo.getText(), txtNombre.getText(), txtTitulo.getText(), 0, 0, 0,
                                Integer.parseInt(txtSalario.getText()), Integer.parseInt(txtPuntosSalariales.getText()), Integer.parseInt(txtValorPunto.getText()));
            
            JOptionPane.showConfirmDialog(null, "Docente Registrado con exito!", "Operacion Exitosa!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            cmbDepartamento.setValue("");
            txtCodigo.clear();
            txtNombre.clear();
            txtTitulo.clear();
            txtSalario.clear();
            txtPuntosSalariales.clear();
            txtValorPunto.clear();
        }else{
            JOptionPane.showConfirmDialog(null, "Error: faltan algunos campos por rellenar", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
