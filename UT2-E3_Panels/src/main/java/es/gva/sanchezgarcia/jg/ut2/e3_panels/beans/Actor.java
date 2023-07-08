/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.gva.sanchezgarcia.jg.ut2.e3_panels.beans;

import java.util.Objects;

/**
 *
 * @author josegaspar
 */
public class Actor {
    private String nombre;
    private String apellidos;
    private String bibliografia;
    /** Constructor
     * 
     * @param nombre
     * @param apellidos
     * @param bibliografia 
     */
    public Actor(String nombre, String apellidos, String bibliografia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.bibliografia = bibliografia;
    }
    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }
    public String getActorNombreApellidos()
    {
        return (this.nombre+" "+this.apellidos);
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", bibliografia=" + bibliografia + '}';
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellidos, other.apellidos);
    }
    
    
    
}
