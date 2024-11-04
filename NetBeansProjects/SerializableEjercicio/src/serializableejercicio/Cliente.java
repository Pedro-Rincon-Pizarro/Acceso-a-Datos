/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializableejercicio;

import java.io.Serializable;

/**
 *
 * @author pedro.rinpiz
 */
public class Cliente implements Serializable {

    private int idCliente;
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    public static int contador = 1;

    public Cliente() {
    }

    public Cliente(String nombre, String email, String direccion, String telefono) {
        this.idCliente = contador;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        contador++;
        
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente: \n" + "idCliente: " + idCliente + "\n nombre: " + nombre + "\n email: " + email + "\n direccion: " + direccion + "\n telefono: " + telefono;
    }
}
