/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionAlumnos.ventana.tablemodels;

import GestionAlumnos.modelo.Alumno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ameli
 */
public class AlumnosTableModel extends AbstractTableModel {
    private List<Alumno> ListAlumno;
    private String[] Columnas={"Nombre","Curso"};
   
    public AlumnosTableModel(List<Alumno> ListAlumno) {
         this.ListAlumno=ListAlumno;
    }
    
    @Override
    public int getRowCount(){
        return ListAlumno.size();
    }

    @Override
    public int getColumnCount() {
       return this.Columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return ListAlumno.get(rowIndex).getNombre();
            case 1:
                return ListAlumno.get(rowIndex).getCurso();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return Columnas[column];
    }
    
}
