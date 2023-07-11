/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimage;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author josegaspar
 */
public class ImagenFondo implements Serializable{
    private File rutaImagen;
    private Float opacidad;
    
    /**
     * Constructor
     * @param rutaImagen
     * @param opacidad 
     */
    
    public ImagenFondo(File rutaImagen, Float opacidad) {
        this.rutaImagen = rutaImagen;
        this.opacidad = opacidad;
    }

    // Getters and Setters
    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Float getOpacidad() {
        return opacidad;
    }

    public void setOpacidad(Float opacidad) {
        this.opacidad = opacidad;
    }
    
    
    
    
    
}
