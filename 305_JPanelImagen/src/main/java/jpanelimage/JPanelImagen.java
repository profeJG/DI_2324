/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimage;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    private boolean ratonPresionado=false;
    private Point puntoPresionInicio=null;
    private ArrastreListener arrastreListener=null;

    /**
     * Constructor por defecto
     */
    public JPanelImagen() {
        
        // Escuchamos arrastre horizontal del ratón 
        this.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseReleased(MouseEvent e) {
                //super.mouseReleased(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                if(ratonPresionado)
                {
                    Point puntoPosicionActual=e.getPoint();
                    if(Math.abs(puntoPresionInicio.getX()-puntoPosicionActual.getX())>50)
                    {
                        if(arrastreListener!=null)
                            arrastreListener.arrastrarAccion();
                    }
                }
                ratonPresionado=false;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //super.mousePressed(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                ratonPresionado=true;
                puntoPresionInicio= e.getPoint(); // Recoge punto presión del evento
            }
            
        });
        
    }
    
    /* Posibilidad de añadir un escuchador para el evento ArrastreListener */
    
    public void addArrastreListener(ArrastreListener arrastreListener){
        this.arrastreListener=arrastreListener;
    }
    
    public void removeArrastreListener(){
        this.arrastreListener=null;
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
