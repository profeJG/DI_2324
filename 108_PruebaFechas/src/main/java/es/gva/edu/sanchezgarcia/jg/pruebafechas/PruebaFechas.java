/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.gva.edu.sanchezgarcia.jg.pruebafechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josegaspar
 */
public class PruebaFechas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");
        
        Date d=new Date();
        
        System.out.println(sdf.format(d));
        
        String s="22-03-1983";
        
        try {
            d=sdf.parse(s);
        } catch (ParseException ex) {
            Logger.getLogger(PruebaFechas.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error al pasar la fecha");
        }
        System.out.println(d.toString());
    }
}
