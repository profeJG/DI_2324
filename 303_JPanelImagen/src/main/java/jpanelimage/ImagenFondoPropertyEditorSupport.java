/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimage;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author josegaspar
 */
public class ImagenFondoPropertyEditorSupport extends PropertyEditorSupport{
    ImagenFondoPanel imagenFondoPanel=new ImagenFondoPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return this.imagenFondoPanel;
    }

    @Override
    public String getJavaInitializationString() {
        //return super.getJavaInitializationString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        ImagenFondo imagenFondo=imagenFondoPanel.getSelectedValue();
        String s="new jpanelimage.ImagenFondo(new java.io.File(\"";
        s=s+imagenFondo.getRutaImagen().getAbsolutePath()+"\"),"+imagenFondo.getOpacidad()+"f)";
        
        return s;
    }

    @Override
    public Object getValue() {
        return this.imagenFondoPanel.getSelectedValue();
    }
    
    
}
