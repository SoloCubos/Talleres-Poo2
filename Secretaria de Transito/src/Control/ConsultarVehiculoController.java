/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import Model.Transito;
import javax.swing.JOptionPane;
/**
 *
 * @author solan
 */
public class ConsultarVehiculoController implements Initializable {

	@FXML
	private AnchorPane myAnchorPane;
    @FXML
    private TextField txtPlaca;
    @FXML
    private Button btnConsultar;
    
    private Transito transito;
    
    public ConsultarVehiculoController(){
        transito = Transito.getInstance();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }
    
    @FXML
    void handleButtonActionConsultar(ActionEvent event){
        String placa = txtPlaca.getText();
        transito.setPlacaIntroducida(placa);
        
        System.out.println(placa);
        if(placa.isBlank()){
        	
            JOptionPane.showMessageDialog(null, "No ha ingresado ningun dato", "Error", 0);
        }else {
        	
        	transito.consultar(placa);
        	try {

    			Parent root = (AnchorPane) FXMLLoader.load(getClass().getResource("/View/RegistrarDatos.fxml"));

    			Stage stage = new Stage();
    			Scene scene = new Scene(root);
    			stage.setTitle("Registro:");
    			stage.setScene(scene);
    			stage.show();

    		} catch (Exception e) {
    			e.printStackTrace();
    		}
        } 
    }
}
    
