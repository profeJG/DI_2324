/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relojdigital;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author josegaspar
 */
public class Alarma implements Serializable {

    private Date horaAlarma;
    private boolean activa;

    /**
     * Constructor
     *
     * @param horaAlarma: Date - Unicamente nos interesa la hora a la que se
     * programa la alarma.
     * @param activa: boolean - indica si la alarma esta activa o no.
     */
    public Alarma(Date horaAlarma, boolean activa) {
        this.horaAlarma = horaAlarma;
        this.activa = activa;
    }

    /* Getters and Setters */
    public Date getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(Date horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

}
