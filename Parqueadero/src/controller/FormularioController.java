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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import model.Parqueadero;

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
    private ComboBox<String> cmbTipo = new ComboBox<>();
    @FXML
    private TextField txtCarros;
    @FXML
    private TextField txtMotos;
    @FXML
    private TextField txtTotal;
    @FXML
    private Label lblResultado;
    @FXML
    private TextField txtFecha;
    
    private Parqueadero p;

    public FormularioController() {
        p = Parqueadero.getInstance();
    }

    /**
     * Initializes the controller class.
     * 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbTipo.getItems().addAll("Carro", "Moto");
        cmbTipo.setPromptText("Select One");
        txtCarros.setText(p.cantVehiculos()[0] + " Carros");
        txtMotos.setText(p.cantVehiculos()[1] + " Motos");
        txtTotal.setText(p.cantVehiculos()[2] + " Vehiculos");
        lblResultado.setText("Presione Totalizar para mostrar los resultados del dia");
    }    

    @FXML
    private void handleButtonActionAgregar(ActionEvent event){
        
        int motos = 0, carros = 0, total = 0;
        
        if(txtPlaca.getText().isEmpty() || txtModelo.getText().isEmpty() || txtFecha.getText().isEmpty() || cmbTipo.getValue().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Faltan algunos campos por llenar", "Error!!!!!!!", 0);
        }
        else if(!p.validarPlaca(txtPlaca.getText())){
            
            p.ingresarVehiculo(txtPlaca.getText(), txtModelo.getText(), txtFecha.getText(), cmbTipo.getValue());
            
            txtPlaca.clear();
            txtModelo.clear();
            txtFecha.clear();
            cmbTipo.setValue(null);
            
            txtCarros.setText(p.cantVehiculos()[0] + " Carros");
            txtMotos.setText(p.cantVehiculos()[1] + " Motos");
            txtTotal.setText(p.cantVehiculos()[2] + " Vehiculos");
            
            JOptionPane.showMessageDialog(null, "Vehiculo Ingresado", "Opearción Exitosa!!!!!!!", 1);
            
        }else JOptionPane.showMessageDialog(null, "La Placa ya se encuentra registrada en el sistema", "Error!!!!!!!", 0);
   
    }

    @FXML
    private void handleButtonActionLimpiar(ActionEvent event) {
        txtPlaca.clear();
        txtModelo.clear();
        txtFecha.clear();
        cmbTipo.setValue(null);
        
    }

    @FXML
    private void handleButtonActionReiniciar(ActionEvent event) {
        p.reiniciar();
        txtPlaca.clear();
        txtModelo.clear();
        txtFecha.clear();
        
        cmbTipo.setValue(null);
        
        txtCarros.setText(p.cantVehiculos()[0] + " Carros");
        txtMotos.setText(p.cantVehiculos()[1] + " Motos");
        txtTotal.setText(p.cantVehiculos()[2] + " Vehiculos");
        
        lblResultado.setText(p.totalizar());
        
        JOptionPane.showMessageDialog(null, "Se ha Vaciado la base de datos", "Opearción Exitosa!!!!!!!", 1);
    }

    @FXML
    private void handleButtonActionTotalizar(ActionEvent event) {
       String resultado = p.totalizar();
       lblResultado.setText(resultado);
       
       JOptionPane.showMessageDialog(null, "Correcto", "Opearción Exitosa!!!!!!!", 1);
    }
    
}
