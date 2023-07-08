/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.gva.sanchezgarcia.jg.ut2.e3_panels.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josegaspar
 */
public class Pelicula {
    private String nombre;
    private String sinopsis;
    private List<Actor> reparto;
/**
 * Constructor
 * @param nombre
 * @param sinopsis 
 */
    public Pelicula(String nombre, String sinopsis) {
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.reparto=new ArrayList<Actor>();
    }
/**
 * Constructor
 * @param nombre
 * @param sinopsis
 * @param reparto 
 */
    public Pelicula(String nombre, String sinopsis, List<Actor> reparto) {
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.reparto = reparto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public List<Actor> getReparto() {
        return reparto;
    }

    public void setReparto(List<Actor> reparto) {
        this.reparto = reparto;
    }
    /**
     * Añade un actpr a la pelicula
     * @param actor 
     */
    public void addActor(Actor actor){
        this.reparto.add(actor);
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", sinopsis=" + sinopsis + ", reparto=" + reparto + '}';
    }
    
    
}


