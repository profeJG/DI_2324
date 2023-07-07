/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.gva.edu.sanchezgarcia.jg.abtracttablemodelexample.gui.tablemodels;

import es.gva.edu.sanchezgarcia.jg.abtracttablemodelexample.beans.Alumno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author josegaspar
 */
public class AlumnoTableModel extends AbstractTableModel{
    
    private List<Alumno> listaAlumnos;
    private String[] columnas={"Nombre","Curso"};

    public AlumnoTableModel(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        return listaAlumnos.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return columnas.length;
    }

    @Override
    public Object getValueAt(int i, int colIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Alumno alu=listaAlumnos.get(i);
        
        switch(colIndex)
        {
            case 0: {
                return alu.getNombre();
            }
            case 1: {return alu.getCurso();}
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return this.columnas[column];
    }
    
    
}
