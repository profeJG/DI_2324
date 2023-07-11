/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Objects;

/**
 *
 * @author josegaspar
 */
public class Prueba {
    String prueba=null;

    /* Constructor */
    
    public Prueba() {
        this.prueba="Esto es una PRUEBA.";
    }
    
    /* Getters and Setters */

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }
    
    /*  Más código generado */

    @Override
    public String toString() {
        return "Prueba{" + "prueba=" + prueba + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.prueba);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prueba other = (Prueba) obj;
        return Objects.equals(this.prueba, other.prueba);
    }
    
    
    
}
