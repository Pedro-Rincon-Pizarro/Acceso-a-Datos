/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionAlumnos.modelo;

/**
 *
 * @author ameli
 */
public class Alumno {
    private String Nombre;
    private String Curso;

    public Alumno(String Nombre, String Curso) {
        this.Nombre = Nombre;
        this.Curso = Curso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
   
}
