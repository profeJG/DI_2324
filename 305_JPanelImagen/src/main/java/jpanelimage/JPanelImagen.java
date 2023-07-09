/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimage;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author josegaspar
 */
public class JPanelImagen extends JPanel implements Serializable {

    private ImagenFondo imagenFondo = null;

    /**
     * Constructor por defecto
     */
    public JPanelImagen() {
    }
    
    /* Getters and Setters */

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }
    
    

    /**
     * Metodo que pinta la imagen en el interior de JPanel
     * @param g 
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if (this.imagenFondo != null && imagenFondo.getRutaImagen()!=null && this.imagenFondo.getRutaImagen().exists()) {
            ImageIcon imageIcon = new ImageIcon(this.imagenFondo.getRutaImagen().getAbsolutePath());
            // Dibujamos imagen con la opacidad deseada
            Graphics2D g2d=(Graphics2D) g;
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.imagenFondo.getOpacidad()));
            g.drawImage(imageIcon.getImage(), 0, 0, null);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
        }
    }

}
