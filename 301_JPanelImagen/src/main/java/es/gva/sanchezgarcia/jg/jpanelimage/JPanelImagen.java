/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.gva.sanchezgarcia.jg.jpanelimage;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author josegaspar
 */
public class JPanelImagen extends JPanel implements Serializable {

    private File pathImagen = null;

    /**
     * Constructor por defecto
     */
    public JPanelImagen() {
    }

    public File getPathImagen() {
        return pathImagen;
    }

    public void setPathImagen(File pathImagen) {
        this.pathImagen = pathImagen;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if (this.pathImagen != null && this.pathImagen.exists()) {
            ImageIcon imageIcon = new ImageIcon(this.pathImagen.getAbsolutePath());
            g.drawImage(imageIcon.getImage(), 0, 0, null);
        }
    }

}
