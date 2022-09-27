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
public class IngresarGrupoController implements Initializable {

    @FXML
    private Button btnCrear;

    @FXML
    private ComboBox<String> cmbMateria;

    @FXML
    private TextField txtCapacidad;

    @FXML
    private TextField txtIdGrupo;
    
    private Universidad u;

    public IngresarGrupoController() {
        u = Universidad.getInstance();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbMateria.getItems().addAll(u.listaMaterias());
    }
    
    @FXML
    void consultarAsignaturas(ActionEvent event) {

    }

    @FXML
    void consultarProgramas(ActionEvent event) {

    }
    
    @FXML
    void crearGrupo(ActionEvent event) {
        if(!(cmbMateria.getValue().isEmpty() || txtIdGrupo.getText().isEmpty() || txtCapacidad.getText().isEmpty())){
            u.ingresarGrupo(cmbMateria.getValue(), txtIdGrupo.getText(), Integer.parseInt(txtCapacidad.getText()));
            JOptionPane.showConfirmDialog(null, "Grupo Creado con exito!", "Operacion Exitosa!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showConfirmDialog(null, "Error: faltan algunos campos por rellenar", "Error!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
}
