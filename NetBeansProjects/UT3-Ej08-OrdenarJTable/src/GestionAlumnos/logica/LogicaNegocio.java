/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionAlumnos.logica;

import GestionAlumnos.modelo.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ameli
 */
public class LogicaNegocio {
    private static List<Alumno> ListaAlumnos=new ArrayList<>();

    public LogicaNegocio(){
        ListaAlumnos=new ArrayList<>();
        ListaAlumnos.add(new Alumno("Pablo","DAM2"));
        ListaAlumnos.add(new Alumno("Juan","DAM1"));
        ListaAlumnos.add(new Alumno("Pedro","DAM1"));
        
    }
    public static List <Alumno> getListaAlumnos() {
        return ListaAlumnos;
    }
    
    
}
