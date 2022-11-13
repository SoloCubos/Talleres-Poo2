/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class FormularioController implements Initializable {

    @FXML
    private TextField txtPlaca;
    @FXML
    private TextField txtModelo;
    @FXML
    private ComboBox<String> cmbTipo;
    @FXML
    private TextField txtCarros;
    @FXML
    private TextField txtMotos;
    @FXML
    private TextField txtTotal;
    @FXML
    private TextField txtGanancias;
    @FXML
    private TextField txtFecha;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbTipo.getItems().addAll("Carro", "Moto");
    }    

    @FXML
    private void handleButtonActionAgregar(ActionEvent event) {
        
    }

    @FXML
    private void handleButtonActionLimpiar(ActionEvent event) {
        
    }

    @FXML
    private void handleButtonActionReiniciar(ActionEvent event) {
        
    }

    @FXML
    private void handleButtonActionTotalizar(ActionEvent event) {
    }
    
}
