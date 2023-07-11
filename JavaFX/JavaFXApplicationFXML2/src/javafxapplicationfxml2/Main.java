/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package javafxapplicationfxml2;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author josegaspar
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        
        String fxml="EjemploVista.fxml";

        try {
            /*

            FXMLLoader loader = new FXMLLoader();

            System.out.println("Comienzo");
            */
            
            System.out.println();
            
            System.out.println("Nombre canonigo:"+ getClass().getCanonicalName());
            System.out.println("Class Loader::: "+getClass().getClassLoader().toString());
            System.out.println("Nombre: "+getClass().getClassLoader().getName());
            URL resource = getClass().getResource("/javafxapplicationfxml2/"+"Main.class");
            System.out.println("Recurso: "+ resource.getPath());
            
            URL location = getClass().getResource(fxml);
           
            System.out.println("Localización: "+location.toString());
            /*
            loader.setLocation(location);
            
            System.out.println("Vamos a cargar");
            Pane ventana = (Pane) loader.load();
            System.out.println("Cargado");

            Scene scene = new Scene(ventana);
            stage.setScene(scene);
            
            stage.setTitle("My First JavaFX App");
            stage.show();
            */
            System.out.println("FIN");
        } catch (Exception e) {
            System.out.println("Excepcion:: " + e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
