/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import Model.Parroquia;
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
public class FormularioController implements Initializable {

    @FXML
    private TextField txtCelula;
    @FXML
    private TextField txtPague;
    @FXML
    private TextField txtTotal;
    @FXML
    private ListView<String> myListView;
    @FXML
    private TextField txtCedula;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtEstrato;
    @FXML
    private ComboBox<String> cmbEstado;
    
    private Parroquia p;

    public FormularioController() {
        p = Parroquia.getInstance();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtPague.setEditable(false);
        cmbEstado.getItems().addAll("Deudor","Cumplido");
        myListView.getItems().addAll(p.resultados());
        // TODO
    }    

    @FXML
    private void handleActionConsultar(ActionEvent event) {
        if(txtCelula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Introduzca la cedula para conocer cuanto debe pagar", "Error!!!", JOptionPane.ERROR_MESSAGE);
            
        }else{
            String pagar = p.consultar(txtCelula.getText());
            JOptionPane.showMessageDialog(null, "Consulta Exitosa, acontinuacion puede pagar", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            txtPague.setText(pagar);
        } 
    }

    @FXML
    private void handleActionPagar(ActionEvent event) {
        if(!txtCelula.getText().isEmpty()){
            if(p.cedulaExiste(txtCelula.getText())){
                p.pagar(txtCelula.getText());
                String pagar = p.consultar(txtCelula.getText());
                JOptionPane.showMessageDialog(null, "Su pago se ha registrado exitosamente", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                txtPague.setText(pagar);
                myListView.getItems().clear();
                myListView.getItems().addAll(p.resultados());
            }else{
                txtCelula.clear();
                JOptionPane.showMessageDialog(null, "El feligrés no existe", "Error!!!", JOptionPane.ERROR_MESSAGE);
            } 
        }else{
            JOptionPane.showMessageDialog(null, "Introduzca la cedula para registrar el pago", "Error!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    private void handleActionTotalizar(ActionEvent event) {

        int total = p.totalizar();
        txtTotal.setText("$ " + total);
        JOptionPane.showMessageDialog(null, "La parroquia ha recibido $ " + total + " por los diezmos pagados", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
    }

    @FXML
    private void handleActionGuardar(ActionEvent event) {

        if(!(txtCedula.getText().isEmpty() || txtNombre.getText().isEmpty() || txtDireccion.getText().isEmpty() || 
           txtTelefono.getText().isEmpty() || txtEstrato.getText().isEmpty() || cmbEstado.getValue().isEmpty())){
            p.guardar(txtCedula.getText(), txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText(), txtEstrato.getText(), cmbEstado.getValue());
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente el feligrés", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            txtCedula.clear();
            txtNombre.clear();
            txtDireccion.clear();
            txtTelefono.clear();
            txtEstrato.clear();
            cmbEstado.setValue(null);
            
            myListView.getItems().clear();
            myListView.getItems().addAll(p.resultados());
            
        }else{
            JOptionPane.showMessageDialog(null, "Los campos marcados con * son obligatorios", "Error!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    private void handleActionEliminar(ActionEvent event) {
        txtDireccion.clear();
        txtTelefono.clear();
        txtEstrato.clear();
        cmbEstado.setValue(null);
        
        if(!txtCedula.getText().isEmpty()){
            if(p.cedulaExiste(txtCedula.getText())){
                p.eliminar(txtCedula.getText());
                
                JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente el feligrés", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                
                txtCedula.clear();
                txtNombre.clear();
                txtDireccion.clear();
                txtTelefono.clear();
                txtEstrato.clear();
                cmbEstado.setValue(null);

                myListView.getItems().clear();
                myListView.getItems().addAll(p.resultados());
            }else{
                txtCedula.clear();
                txtNombre.clear();
                txtDireccion.clear();
                txtTelefono.clear();
                txtEstrato.clear();
                cmbEstado.setValue(null);
                JOptionPane.showMessageDialog(null, "El feligrés no existe", "Error!!!", JOptionPane.ERROR_MESSAGE);;
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Para eliminar un feligrés debe introducir su cedula", "Error!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    private void handleActionBuscar(ActionEvent event) {
        if(!txtCedula.getText().isEmpty()){
            if(p.cedulaExiste(txtCedula.getText())){
                String[] datos = p.buscar(txtCedula.getText());
                JOptionPane.showMessageDialog(null, "Feligrés encontrado, a continuación puede editar sus datos", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                txtCedula.setText(datos[0]);
                txtNombre.setText(datos[1]);
                txtDireccion.setText(datos[2]);
                txtTelefono.setText(datos[3]);
                txtEstrato.setText(datos[4]);
                String estado = datos[5];
                cmbEstado.setValue(estado);  
            }else{
                JOptionPane.showMessageDialog(null, "El feligrés no existe", "Error!!!", JOptionPane.ERROR_MESSAGE);
            }             
        }else{
            JOptionPane.showMessageDialog(null, "Para buscar un feligrés debe introducir su cedula", "Error!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    private void handleActionActualizar(ActionEvent event) {
        String nombre = null, direccion = null, telefono = null, estrato = null, estado =  null;
                
        if(!(txtCedula.getText().isEmpty() || txtNombre.getText().isEmpty() || txtDireccion.getText().isEmpty() || 
           txtTelefono.getText().isEmpty() || txtEstrato.getText().isEmpty() || cmbEstado.getValue().isEmpty())){
            
        }else{
            JOptionPane.showMessageDialog(null, "Los datos marcados con * son obligatorios", "Error!!!", JOptionPane.ERROR_MESSAGE);
        }
    }  
}