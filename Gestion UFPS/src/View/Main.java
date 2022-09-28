/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Solan
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("Ingresar.fxml"));

	Scene scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
	stage.setTitle("Gestion UFPS");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
