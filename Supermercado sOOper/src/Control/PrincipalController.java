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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class PrincipalController implements Initializable {

    @FXML
    private AnchorPane myAnchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleIngresarProductos(ActionEvent event) {
        try { 
            Parent root = (AnchorPane) FXMLLoader.load(getClass().getResource("/View/IngresarProductos.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Ingrese los productos");
            stage.setScene(scene);
            stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    @FXML
    private void handleIngresarBolsa(ActionEvent event) {
        try { 
            Parent root = (AnchorPane) FXMLLoader.load(getClass().getResource("/View/IngresarBolsas.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Agregar Bolsas");
            stage.setScene(scene);
            stage.show();

            } catch (Exception e) {
                e.printStackTrace();
        }
    }
    @FXML
    private void handleIngresarCaja(ActionEvent event) {
        try { 
            Parent root = (AnchorPane) FXMLLoader.load(getClass().getResource("/View/IngresarCajas.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Agregar Cajas");
            stage.setScene(scene);
            stage.show();

            } catch (Exception e) {
                e.printStackTrace();
        }
    }

    @FXML
    private void handleModuloPedidos(ActionEvent event) {
        try { 
            Parent root = (AnchorPane) FXMLLoader.load(getClass().getResource("/View/ModuloPedidos.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Módulo Pedidos");
            stage.setScene(scene);
            stage.show();

            } catch (Exception e) {
                e.printStackTrace();
        }
    }
    
}
