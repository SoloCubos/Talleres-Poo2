/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Qatar2022;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author solan
 */
public class MainViewController implements Initializable {

    @FXML
    private TextField txtIdContinente;
    @FXML
    private TextField txtNombreContinente;
    @FXML
    private TextField txtIdSeleccion1;
    @FXML
    private TextField txtNombreSeleccion1;
    @FXML
    private TextField txtTecnico1;
    @FXML
    private TextField txtGolesFavor1;
    @FXML
    private ComboBox<String> cmbContinentes1;
    @FXML
    private TextField txtGolesContra1;
    @FXML
    private TextField txtPartidosGanados1;
    @FXML
    private TextField txtPartidosPerdidos1;
    @FXML
    private TextField txtPartidosJugados1;
    @FXML
    private ListView<String> myListView;
    @FXML
    private TextField txtNombreSeleccion11;
    @FXML
    private TextField txtTecnico11;
    @FXML
    private TextField txtGolesFavor11;
    @FXML
    private ComboBox<String> cmbContinentes11;
    @FXML
    private TextField txtGolesContra11;
    @FXML
    private TextField txtPartidosGanados11;
    @FXML
    private TextField txtPartidosPerdidos11;
    @FXML
    private TextField txtPartidosJugados11;
    @FXML
    private ComboBox<String> cmbIdSelecciones;
    @FXML
    private ListView<String> listViewEquiposGoles;
    @FXML
    private ListView<String> listViewEquiposMasGanadores;

    private Qatar2022 q;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbContinentes1.getItems().addAll(q.listaContinentes());
        cmbContinentes11.getItems().addAll(q.listaContinentes());
    }    

    public MainViewController() {
        q = Qatar2022.getInstance();
    }

    @FXML
    private void registrarContinente(ActionEvent event) {
        if(txtIdContinente.getText().isEmpty() || txtNombreContinente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error!!!", 0);
        }else if(q.registrarContinente(txtIdContinente.getText(), txtNombreContinente.getText())){
            JOptionPane.showMessageDialog(null, "Se ha agregado el continente a la base de datos", "Exito!!", 1);
            cmbContinentes1.getItems().addAll(q.listaContinentes());
            cmbContinentes11.getItems().addAll(q.listaContinentes());
            txtIdContinente.setText(null);
            txtNombreContinente.setText(null);
        }else JOptionPane.showMessageDialog(null, "Hubo un error, revise los datos e intentelo de nuevo", "Error!!!", 0);
        
        
    }

    @FXML
    private void limpiarFormularioContinente(ActionEvent event) {
        txtIdContinente.setText(null);
        txtNombreContinente.setText(null);
        JOptionPane.showMessageDialog(null, "Se ha limpiado el formulario", "Exito!!", 1);
    }

    @FXML
    private void registrarSeleccion(ActionEvent event) {
        
        
        q.registrarSeleccion(txtIdSeleccion1.getText(), txtNombreSeleccion1.getText(), cmbContinentes1.getValue(), txtTecnico1.getText(), txtGolesFavor1.getText(), txtGolesContra1.getText(), txtPartidosGanados1.getText(), txtPartidosPerdidos1.getText(), txtPartidosJugados1.getText());
        
    }

    @FXML
    private void limpiarFormularioSelecion(ActionEvent event) {
    }

    @FXML
    private void listarSelecciones(ActionEvent event) {
    }

    @FXML
    private void eliminarSeleccion(ActionEvent event) {
    }

    @FXML
    private void listarEquipos(ActionEvent event) {
    }
    
}
