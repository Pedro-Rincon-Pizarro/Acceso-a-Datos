/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioooo2;

/**
 *
 * @author pedro.rinpiz
 */
public class Deportista 
{
    private String nombre;
    private String apellidos;
    private String deporte;
    private int edad;
    private boolean vegetariano;

    public Deportista(String nombre, String apellidos, String deporte, int edad, boolean vegetariano) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.deporte = deporte;
        this.edad = edad;
        this.vegetariano = vegetariano;
    }

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

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }
    
    
}
