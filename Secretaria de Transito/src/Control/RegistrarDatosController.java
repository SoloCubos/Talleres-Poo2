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
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
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
    	if(!transito.existe(txtPlaca.getText())) {
    		
    	}
        
    }    

    @FXML
    void handleButtonActionActualizarDatosVehiculo(ActionEvent event) {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cedula = txtCedula.getText();
        String celular = txtCelular.getText();
        String correo = txtCorreo.getText();
        
        String placa = txtPlaca.getText();
        String marca = txtMarca.getText();
        String linea = txtLinea.getText();
        String modelo = txtModelo.getText();
        String tipo = txtTipo.getText();
        
        if(nombre.isBlank() && apellido.isBlank() && cedula.isBlank() && celular.isBlank() && correo.isBlank() && marca.isBlank() && linea.isBlank() && modelo.isBlank() && tipo.isBlank()) {
        	JOptionPane.showMessageDialog(null, "Faltan datos por ingresar", "Error", 0);
        }else {
        	transito.agregarActualizar(nombre, apellido, cedula, celular, correo, placa, marca, linea, modelo, tipo);
        }
    }

    @FXML
    void handleButtonActionGuardarDatos(ActionEvent event) {
 
    }
}
