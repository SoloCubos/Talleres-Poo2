/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

<<<<<<< HEAD
import Model.Parroquia;
=======
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
<<<<<<< HEAD
import javax.swing.JOptionPane;
=======
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712

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
<<<<<<< HEAD
    private ListView<String> myListView;
=======
    private ListView<?> myListView;
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712
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
<<<<<<< HEAD
    private ComboBox<String> cmbEstado;
    
    private Parroquia p;

    public FormularioController() {
        p = Parroquia.getInstance();
    }
=======
    private ComboBox<?> cmbEstado;
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
<<<<<<< HEAD
        txtPague.setEditable(false);
        cmbEstado.getItems().addAll("Deudor","Cumplido");
=======
        // TODO
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712
    }    

    @FXML
    private void handleActionConsultar(ActionEvent event) {
<<<<<<< HEAD
        if(!txtCelula.getText().isEmpty()){
            if(p.existe(txtCelula.getText())){
                String pagar = p.consultar(txtCelula.getText());
                JOptionPane.showMessageDialog(null, "Consulta Exitosa, acontinuacion puede pagar", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                txtPague.setText(pagar);
            }else{
                txtCelula.clear();
                JOptionPane.showMessageDialog(null, "El feligrés no existe", "Error!!!", JOptionPane.ERROR_MESSAGE);
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Introduzca la cedula para conocer cuanto debe pagar", "Error!!!", JOptionPane.ERROR_MESSAGE);
        }
=======
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712
    }

    @FXML
    private void handleActionPagar(ActionEvent event) {
<<<<<<< HEAD
        if(!txtCelula.getText().isEmpty()){
            if(p.existe(txtCelula.getText())){
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
=======
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712
    }

    @FXML
    private void handleActionTotalizar(ActionEvent event) {
<<<<<<< HEAD
        txtCelula.clear();
        int total = p.totalizar();
        txtPague.setText("$" + total);
        JOptionPane.showMessageDialog(null, "La parroquia ha recibido $" + total + " por los diezmos pagados", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
=======
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712
    }

    @FXML
    private void handleActionGuardar(ActionEvent event) {
<<<<<<< HEAD
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
=======
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712
    }

    @FXML
    private void handleActionEliminar(ActionEvent event) {
<<<<<<< HEAD
        if(!txtCedula.getText().isEmpty()){
            if(p.existe(txtCedula.getText())){
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
=======
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712
    }

    @FXML
    private void handleActionBuscar(ActionEvent event) {
<<<<<<< HEAD
        
        if(!txtCedula.getText().isEmpty()){
            if(p.existe(txtCedula.getText())){
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
=======
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712
    }

    @FXML
    private void handleActionActualizar(ActionEvent event) {
<<<<<<< HEAD
        String nombre = null, direccion = null, telefono = null, estrato = null, estado =  null;
                
        if(!(txtCedula.getText().isEmpty() || txtNombre.getText().isEmpty() || txtDireccion.getText().isEmpty() || 
           txtTelefono.getText().isEmpty() || txtEstrato.getText().isEmpty() || cmbEstado.getValue().isEmpty())){
            if(p.existe(txtCedula.getText())){
                p.actualizar(txtCedula.getText(), txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText(), txtEstrato.getText(), cmbEstado.getValue());;

                JOptionPane.showMessageDialog(null, "Se han actualizado correctamente los datos de feligrés", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "El feligrés no existe", "Error!!!", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Debe introducir todos los campos marcados con *", "Error!!!", JOptionPane.ERROR_MESSAGE);
        }
=======
>>>>>>> c583bc609028c45302d223ef198bd01f52b5b712
    }
    
}
