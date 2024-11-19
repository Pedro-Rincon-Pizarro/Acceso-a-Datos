/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Persona {

    private String dni;
    private String nombre;
    private int edad;
    private double talla;
    private double peso;
    private double imc;
    private String imcMsj;

    public Persona() {
    }

    public Persona(String dni, String nombre, int edad, double talla, double peso, double imc) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.talla = talla;
        this.peso = peso;
        this.imc = imc;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getImcMsj() {
        return imcMsj;
    }

    public void setImcMsj(String imcMsj) {
        this.imcMsj = imcMsj;
    }



}
