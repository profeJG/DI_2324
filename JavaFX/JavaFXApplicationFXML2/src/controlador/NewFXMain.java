/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package controlador;

import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author josegaspar
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         String fxml="app.fxml";

        try {
            /*

            FXMLLoader loader = new FXMLLoader();

            System.out.println("Comienzo");
            */
            
            System.out.println();
            
            System.out.println("Nombre canonigo:"+ getClass().getCanonicalName());
            System.out.println("Class Loader::: "+getClass().getClassLoader().toString());
            System.out.println("Nombre: "+getClass().getClassLoader().getName());
            URL resource = getClass().getResource(File.separator+"controlador"+File.separator+"NewFXMain.class");
            System.out.println("Recurso: "+ resource.getPath());
            resource = getClass().getClassLoader().getResource(File.separator+"icons"+File.separator+fxml);
            System.out.println("Recurso 2: "+ resource.getPath());
            
            URL location = getClass().getResource(File.separator+fxml);
           
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
