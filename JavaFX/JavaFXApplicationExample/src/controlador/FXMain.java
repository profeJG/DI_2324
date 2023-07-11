/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package controlador;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vista.Prueba;

/**
 *
 * @author josegaspar
 */
public class FXMain extends Application {
    
    @Override
    public void start(Stage primaryStage){
        String fxml=File.separator+"vista"+File.separator+"app.fxml"; 
         
         String pathClasePrueba=File.separator+"vista"+File.separator+"Prueba.class"; // La clase si que la localiza.
         System.out.println("Recurso a buscar "+pathClasePrueba);
        
        try {
            
            /* Este codigo es para depurar la localización de los recursos */
            
            Prueba p=new Prueba();
            
            System.out.println("Comenazmos");
            
            URL pruebaLocalizacionClase=getClass().getResource(pathClasePrueba);
            
            System.out.println("Clase de prueba localizada en: "+pruebaLocalizacionClase);
            /* ------------- Fin código de depuración -------------------------- */
            
            
            URL localizacion=getClass().getClassLoader().getResource(fxml);
            
            
            System.out.println("Localizacion: "+localizacion);
            
            
            Parent root = FXMLLoader.load(localizacion);
            Scene scene = new Scene(root);
            
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            
            System.out.println("IOException --> "+ex.getMessage());
            System.out.println("IOExecption::"+ex.getLocalizedMessage());
            
            
            Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
