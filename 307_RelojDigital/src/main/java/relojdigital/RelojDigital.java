/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relojdigital;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    private SimpleDateFormat sdf12h = new SimpleDateFormat("hh:mm:ss a");

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
                    System.out.println("Ahora: "+horaActual);
                    System.out.println("Alarma: "+alarma.getHoraAlarma());

                    // Disparamos la alarma
                    if (alarmaListener != null && alarma.isActiva() && horasCoinciden(horaActual, alarma.getHoraAlarma())) {
                        alarmaListener.suenaAlarma();
                    }

                }

            }

        }, 0, 1000);
    }
    
    /* Getters and Setters */

    public boolean isFormato24() {
        return formato24;
    }

    public void setFormato24(boolean formato24) {
        this.formato24 = formato24;
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }
    
    

    /* Soporte de Eventos */
    public void addAlarmaListener(AlarmaListener alarmaListener) {
        this.alarmaListener = alarmaListener;
    }

    public void removeAlarmaListener() {
        this.alarmaListener = null;
    }

    /* Metodos privados */
    /**
     * Comprueba si la horas coinciden. obvia el resto de la fecha.
     *
     * @param h1
     * @param h2
     * @return true cuando las horas sean iguales.
     */
    private boolean horasCoinciden(Date h1, Date h2) {

        Calendar calendario = Calendar.getInstance();

        calendario.setTime(h1);
        int horasH1 = calendario.get(Calendar.HOUR_OF_DAY);
        int minH1 = calendario.get(Calendar.MINUTE);
        int segH1 = calendario.get(Calendar.SECOND);

        calendario.setTime(h2);
        int horasH2 = calendario.get(Calendar.HOUR_OF_DAY);
        int minH2 = calendario.get(Calendar.MINUTE);
        int segH2 = calendario.get(Calendar.SECOND);

        return (horasH1 == horasH2 && minH1 == minH2 && segH1 == segH2);

    }

}
