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
import javafx.scene.control.TextField;

import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class IngresarDepartamentoController implements Initializable {

    @FXML
    private Button btnCrear;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtUbicacion;
    
    private Universidad u;

    public IngresarDepartamentoController() {
        u = Universidad.getInstance();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    } 
    @FXML
    void crearDepartamento(ActionEvent event) {

        if(!(txtNombre.getText().isEmpty() || txtCodigo.getText().isEmpty() || txtUbicacion.getText().isEmpty())){
            u.ingresarDepartamento(txtCodigo.getText(), txtNombre.getText(), txtUbicacion.getText());
            JOptionPane.showConfirmDialog(null, "Departamento Registrado con exito!", "Operacion Exitosa!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            txtNombre.clear();
            txtCodigo.clear();
            txtUbicacion.clear();
            
            
        }else{
            JOptionPane.showConfirmDialog(null, "Error: faltan algunos campos por rellenar", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }   
}
