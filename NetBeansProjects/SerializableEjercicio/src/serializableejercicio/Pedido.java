/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializableejercicio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pedro.rinpiz
 */
public class Pedido implements Serializable {

    private int idPedido;
    private int idCliente;
    private ArrayList <Producto> productos;
    private LocalDate fechaPedido;
    enum Estado {Pendiente, Enviado, Entregado};
    private Estado estado;
    public static int contador = 1;

    public Pedido() {
    }

    public Pedido(int idCliente, ArrayList<Producto> productos, LocalDate fechaPedido, Estado estado) {
        this.idPedido = contador;
        this.idCliente = idCliente;
        this.productos = productos;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
        contador++;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido:\n" + "idPedido: " + idPedido + "\n idCliente: " + idCliente + "\n productos: " + productos + "\n fechaPedido: " + fechaPedido + "\n estado: " + estado;
    }


}
