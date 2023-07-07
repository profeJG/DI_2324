/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.gva.edu.sanchezgarcia.jg.abtracttablemodelexample.logic;

import es.gva.edu.sanchezgarcia.jg.abtracttablemodelexample.beans.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josegaspar
 */
public class LogicApp {
    private List<Alumno> listaAlumnos=null;

    public LogicApp() {
        listaAlumnos=new ArrayList<>();
        listaAlumnos.add(new Alumno("Andrew", "DAM1"));
        listaAlumnos.add(new Alumno("Barth", "DAM2"));
        listaAlumnos.add(new Alumno("Charlie", "DAM1"));
        listaAlumnos.add(new Alumno("Mary", "DAM2"));
        
    }
    
    
    
    public List<Alumno>getListaAlumnos(){
        return listaAlumnos;
    }
    
    public void addAlumno(Alumno a){
        listaAlumnos.add(a);
    }
    
}
