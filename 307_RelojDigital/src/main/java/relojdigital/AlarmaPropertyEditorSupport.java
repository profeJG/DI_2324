/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relojdigital;

import java.awt.Component;
import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 *
 * @author josegaspar
 */
public class AlarmaPropertyEditorSupport extends PropertyEditorSupport {

    private AlarmaPanel alarmaPanel = new AlarmaPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return this.alarmaPanel;
    }

    @Override
    public String getJavaInitializationString() {
        Date horaAlarma = this.alarmaPanel.getSelectedValue().getHoraAlarma();
        boolean activa = this.alarmaPanel.getSelectedValue().isActiva();
        String s = "new relojdigital.Alarma(new java.util.Date(" + horaAlarma.getTime() + "l),";
        s = s + activa + ")";

        return s;
    }

    @Override
    public Object getValue() {
        return this.alarmaPanel.getSelectedValue();
    }

}
