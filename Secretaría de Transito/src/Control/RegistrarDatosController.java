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
    private TextField txtPlaca;
    @FXML
    private TextField txtTipo;
    
    private Transito transito;
    
    public RegistrarDatosController() {
		transito = Transito.getInstance();
	}

	@Override
    public void initialize(URL url, ResourceBundle rb) {
        txtPlaca.setText(transito.getPlacaIntroducida());
        
            for(int i = 0; i < transito.propietarios.size(); i++){
                for (int j = 0; j < transito.propietarios.get(i).getVehiculos().size(); j++) {
                    if(transito.propietarios.get(i).getVehiculos().get(j).getPlaca().equals(txtPlaca.getText())){
                        txtNombre.setText(transito.propietarios.get(i).getNombre());
                        txtApellido.setText(transito.propietarios.get(i).getApellidos());
                        txtCedula.setText(transito.propietarios.get(i).getCedula());
                        txtCelular.setText(transito.propietarios.get(i).getCelular());
                        txtCorreo.setText(transito.propietarios.get(i).getCorreo());
                        
                        txtMarca.setText(transito.propietarios.get(i).getVehiculos().get(j).getMarca());
                        txtLinea.setText(transito.propietarios.get(i).getVehiculos().get(j).getLinea());
                        txtModelo.setText(transito.propietarios.get(i).getVehiculos().get(j).getModelo());
                        txtTipo.setText(transito.propietarios.get(i).getVehiculos().get(j).getTipo());
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
                             txtPlaca.getText(), txtMarca.getText(), txtLinea.getText(), txtModelo.getText(), txtTipo.getText());
            
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.close();
            
        }else{
            
        }
    }
}
