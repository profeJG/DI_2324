/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relojdigital;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author josegaspar
 */
public class RelojDigital extends JLabel implements Serializable {

    private boolean formato24;
    private Alarma alarma = null;

    private SimpleDateFormat sdf24h = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat sdf12h = new SimpleDateFormat("HH:mm:ss a");

    private AlarmaListener alarmaListener;

    /**
     * Constructor
     */
    public RelojDigital() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                Date horaActual = new Date();
                if (formato24) {
                    setText(sdf24h.format(horaActual));
                } else {
                    setText(sdf12h.format(horaActual));
                }

                if (alarma != null) {
                    System.out.println(horaActual);
                    System.out.println(alarma.getHoraAlarma());

                    // Disparamos la alarma
                    if (alarmaListener != null && alarma.isActiva() && horasCoinciden(horaActual, alarma.getHoraAlarma())) {
                        alarmaListener.suenaAlarma();
                    }

                }

            }

        }, 0, 1000);
    }

    /* Soporte de Eventos */
    public void addAlarmaListener(AlarmaListener alarmaListener) {
        this.alarmaListener = alarmaListener;
    }

    public void removeAlarmaListener() {
        this.alarmaListener = null;
    }

    /* Metodos privados */
    private boolean horasCoinciden(Date h1, Date h2) {
        return h1.equals(h2);
    }

}
