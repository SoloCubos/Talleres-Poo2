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
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class ModuloPedidosController implements Initializable {

    @FXML
    private TextField txtReferencia;
    @FXML
    private ComboBox<?> cmbTipoContenedor;
    @FXML
    private ComboBox<?> cmbSeleccionarContenedor;
    @FXML
    private ComboBox<?> cmbContenedoresPedido;
    @FXML
    private ComboBox<?> cmbListaProductos;
    @FXML
    private ListView<?> myListView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBuscarContenedores(ActionEvent event) {
    }

    @FXML
    private void handleAgregarContenedorPedido(ActionEvent event) {
    }

    @FXML
    private void handleContenedorSeleccionado(MouseEvent event) {
    }

    @FXML
    private void handleAgregarProductosContenedor(ActionEvent event) {
    }

    @FXML
    private void handleAgregarContenedorLleno(ActionEvent event) {
    }

    @FXML
    private void handleFinalizarPedido(ActionEvent event) {
    }
    
}
