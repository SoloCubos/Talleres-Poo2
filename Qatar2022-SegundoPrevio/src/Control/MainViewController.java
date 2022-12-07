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
    @FXML
    private ComboBox<String> cmbSeleccionesEliminar;

    private Qatar2022 q;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbContinentes1.getItems().addAll(q.listaContinentes());
        cmbContinentes11.getItems().addAll(q.listaContinentes());
        cmbIdSelecciones.getItems().addAll(q.listaSeleccionesCorta());
        cmbSeleccionesEliminar.getItems().addAll(q.listaSeleccionesLarga());
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
            
            cmbContinentes1.getItems().clear();
            cmbContinentes11.getItems().clear();
        
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
        
    }

    @FXML
    private void registrarSeleccion(ActionEvent event) {
        
        if(txtIdSeleccion1.getText().isEmpty() || txtNombreSeleccion1.getText().isEmpty() ||
           cmbContinentes1.getValue().isEmpty() || txtTecnico1.getText().isEmpty() || 
           txtGolesFavor1.getText().isEmpty() || txtGolesContra1.getText().isEmpty() || 
           txtPartidosGanados1.getText().isEmpty() || txtPartidosPerdidos1.getText().isEmpty() || 
           txtPartidosJugados1.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error!!!", 0);
            
        }else if(q.registrarSeleccion(txtIdSeleccion1.getText(), txtNombreSeleccion1.getText(), cmbContinentes1.getValue(), txtTecnico1.getText(), txtGolesFavor1.getText(), txtGolesContra1.getText(), txtPartidosGanados1.getText(), txtPartidosPerdidos1.getText(), txtPartidosJugados1.getText())){
            
            cmbIdSelecciones.getItems().clear();
            cmbIdSelecciones.getItems().addAll(q.listaSeleccionesCorta());
            
            cmbSeleccionesEliminar.getItems().clear();
            cmbSeleccionesEliminar.getItems().addAll(q.listaSeleccionesLarga());
            
            JOptionPane.showMessageDialog(null, "Se ha agregado el continente a la base de datos", "Exito!!", 1);
            
            txtIdSeleccion1.setText(null);
            txtNombreSeleccion1.setText(null);
            txtTecnico1.setText(null);
            txtGolesFavor1.setText(null);
            txtGolesContra1.setText(null);
            txtPartidosGanados1.setText(null);
            txtPartidosPerdidos1.setText(null);
            txtPartidosJugados1.setText(null);
            cmbContinentes1.setValue(null);
            
       }else JOptionPane.showMessageDialog(null, "Hubo un error, revise los datos e intentelo de nuevo", "Error!!!", 0);
        
    }

    @FXML
    private void limpiarFormularioSelecion(ActionEvent event) {
        
        txtIdSeleccion1.setText(null);
        txtNombreSeleccion1.setText(null);
        txtTecnico1.setText(null);
        txtGolesFavor1.setText(null);
        txtGolesContra1.setText(null);
        txtPartidosGanados1.setText(null);
        txtPartidosPerdidos1.setText(null);
        txtPartidosJugados1.setText(null);
        cmbContinentes1.setValue(null);
        
        cmbIdSelecciones.setValue(null);
        txtNombreSeleccion11.setText(null);
        txtTecnico11.setText(null);
        txtGolesFavor11.setText(null);
        txtGolesContra11.setText(null);
        txtPartidosGanados11.setText(null);
        txtPartidosPerdidos11.setText(null);
        txtPartidosJugados11.setText(null);
        cmbContinentes11.setValue(null);
    }
    
    @FXML
    private void actualizarSeleccion(ActionEvent event){
        
        if(cmbIdSelecciones.getValue().isEmpty() || txtNombreSeleccion11.getText().isEmpty() ||
           cmbContinentes11.getValue().isEmpty() || txtTecnico11.getText().isEmpty() || 
           txtGolesFavor11.getText().isEmpty() || txtGolesContra11.getText().isEmpty() || 
           txtPartidosGanados11.getText().isEmpty() || txtPartidosPerdidos11.getText().isEmpty() || 
           txtPartidosJugados11.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error!!!", 0);
            
        }else if(q.registrarSeleccion(txtIdSeleccion1.getText(), txtNombreSeleccion1.getText(), cmbContinentes1.getValue(), txtTecnico1.getText(), txtGolesFavor1.getText(), txtGolesContra1.getText(), txtPartidosGanados1.getText(), txtPartidosPerdidos1.getText(), txtPartidosJugados1.getText())){
            
            JOptionPane.showMessageDialog(null, "Se han actualizado los Datos de la seleccion", "Exito!!", 1);
            cmbIdSelecciones.getItems().clear();
            cmbIdSelecciones.getItems().addAll(q.listaSeleccionesCorta());
            
            cmbSeleccionesEliminar.getItems().clear();
            cmbSeleccionesEliminar.getItems().addAll(q.listaSeleccionesLarga());
            
            txtIdSeleccion1.setText(null);
            txtNombreSeleccion1.setText(null);
            txtTecnico1.setText(null);
            txtGolesFavor1.setText(null);
            txtGolesContra1.setText(null);
            txtPartidosGanados1.setText(null);
            txtPartidosPerdidos1.setText(null);
            txtPartidosJugados1.setText(null);
            cmbContinentes1.setValue(null);
            
       }else JOptionPane.showMessageDialog(null, "Hubo un error, revise los datos e intentelo de nuevo", "Error!!!", 0);
    }

    @FXML
    private void listarSelecciones(ActionEvent event) {
        myListView.getItems().addAll(q.listaSeleccionesLarga());
    }

    @FXML
    private void eliminarSeleccion(ActionEvent event) {
        
        if(cmbSeleccionesEliminar.getValue().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Seleccione una Seleccion", "Error!!!", 0);
            
        }else if(q.eliminarSeleccion(cmbSeleccionesEliminar.getValue())){
            
            cmbIdSelecciones.getItems().clear();
            cmbIdSelecciones.getItems().addAll(q.listaSeleccionesCorta());
            
            JOptionPane.showMessageDialog(null, "Se ha eliminado la selección: " + cmbSeleccionesEliminar.getValue(), "Exito!!", 1);
            
            cmbSeleccionesEliminar.setValue(null);
            cmbSeleccionesEliminar.getItems().clear();
            cmbSeleccionesEliminar.getItems().addAll(q.listaSeleccionesLarga());
     
        }else JOptionPane.showMessageDialog(null, "Ha ocurrido un error, revise su selección", "Error!!!", 0);
    }

    @FXML
    private void listarEquipos(ActionEvent event) {
        
    }  
}