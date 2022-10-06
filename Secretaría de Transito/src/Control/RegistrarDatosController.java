/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import Model.Transito;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 *
 * @author Solan
 */
public class RegistrarDatosController implements Initializable{
	
    @FXML
    private AnchorPane myAnchorPane;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtCedula;
    @FXML
    private TextField txtCelular;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtLinea;
    @FXML
    private TextField txtMarca;
    @FXML
    private TextField txtModelo;
    @FXML
    private TextField txtNombre;
    @FXML
    private ComboBox<String> cmbPlaca;
    @FXML
    private TextField txtTipo;
    
    private Transito transito;
    
    public RegistrarDatosController() {
		transito = Transito.getInstance();
	}

	@Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbPlaca.setEditable(true);
        cmbPlaca.setValue(transito.getPlacaIntroducida());
        txtCedula.setText(transito.getCedulaIntroducida());
        //cmbPlaca.getItems().addAll(transito.listaPlacas(txtCedula.getText()));
        
        if(transito.existePlaca(cmbPlaca.getValue())){
            for (int i = 0; i < transito.getListaPropietarios().size(); i++) {
                for (int j = 0; j < transito.getListaPropietarios().get(i).getVehiculos().size(); j++) {
                    if(transito.getListaPropietarios().get(i).getVehiculos().get(j).getPlaca().equals(cmbPlaca.getValue())){
                        txtNombre.setText(transito.getListaPropietarios().get(i).getVehiculos().get(j).getPropietario().getNombre());
                        txtApellido.setText(transito.getListaPropietarios().get(i).getVehiculos().get(j).getPropietario().getApellido());
                        txtNombre.setText(transito.getListaPropietarios().get(i).getVehiculos().get(j).getPropietario().getNombre());
                        txtNombre.setText(transito.getListaPropietarios().get(i).getVehiculos().get(j).getPropietario().getNombre());
                        txtNombre.setText(transito.getListaPropietarios().get(i).getVehiculos().get(j).getPropietario().getNombre());
                    }  
                }
            }
        }

    }    

    @FXML
    void handleButtonActionActualizarDatosVehiculo(ActionEvent event) {
        
    }

    @FXML
    void handleButtonActionGuardarDatos(ActionEvent event) {
        if(!(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCedula.getText().isEmpty() || txtCelular.getText().isEmpty() || txtCorreo.getText().isEmpty() ||
           txtMarca.getText().isEmpty() || txtModelo.getText().isEmpty() || txtLinea.getText().isEmpty() || txtTipo.getText().isEmpty())){
            transito.agregar(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtCelular.getText(), txtCorreo.getText(),
                             cmbPlaca.getValue(), txtMarca.getText(), txtLinea.getText(), txtModelo.getText(), txtTipo.getText());
            
            //Node source = (Node) event.getSource();
            //Stage stage = (Stage) source.getScene().getWindow();
            //stage.close();
            
        }else{
            
        }
    }
}
