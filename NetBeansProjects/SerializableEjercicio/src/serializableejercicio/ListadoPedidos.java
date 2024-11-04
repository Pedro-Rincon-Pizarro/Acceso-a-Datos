/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializableejercicio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author pedro.rinpiz
 */
public class ListadoPedidos {

    private ArrayList<Pedido> arrayPedidos;
    private ObjectOutputStream salida;
    private ObjectInputStream entrada;

    public ArrayList<Pedido> getArrayPedidos() {
        return arrayPedidos;
    }

    public void setArrayPedidos(ArrayList<Pedido> arrayPedidos) {
        this.arrayPedidos = arrayPedidos;
    }

    
    public void agregarPedidos(Pedido pedido) {
        arrayPedidos.add(pedido);
        

    }

    public void mostrarPedidosPorCliente(int idCliente) {
        System.out.println("Pedidos del cliente con ID " + idCliente);
        int cont = 1;
        boolean encontrado = false;
        for (Pedido pe : arrayPedidos) {
            if (pe.getIdCliente() == idCliente) {
                System.out.println("---------------Pedido " + cont++ + "------------------");
                
                System.out.println("ID: " + pe.getIdPedido());
                for(Producto pr : pe.getProductos())
                {
                    System.out.println(pr.getNombreProducto());
                }
                System.out.println("Fecha: " + pe.getFechaPedido());
                System.out.println("Estado: " + pe.getEstado());
                System.out.println("-----------------------------------------");
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("El cliente " + idCliente + " aun no tiene pedidos");
        }
    }

    public void actualizarEstadoPedido(int idPedido, String nuevoEstado) {

        for (Pedido pe : arrayPedidos) {
            if (pe.getIdPedido() == idPedido) {
                switch (nuevoEstado) {
                    case "pendiente":
                        pe.setEstado(Pedido.Estado.Pendiente);
                        break;

                    case "enviado":
                        pe.setEstado(Pedido.Estado.Enviado);
                        break;

                    case "entregado":
                        pe.setEstado(Pedido.Estado.Entregado);
                        break;
                    default:
                        throw new AssertionError();
                }

            }
        }
    }

    public void actualizarFicheroPedidos() {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("pedidos.ser"));
            salida.writeObject(arrayPedidos);
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    public void cargarPedidos() throws ClassNotFoundException {
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("pedidos.ser"));
            arrayPedidos = (ArrayList<Pedido>) entrada.readObject();
            entrada.close();

            int max = 0;
            for(Pedido p : arrayPedidos)
            {
                if(p.getIdCliente()> max)
                {
                    max = p.getIdCliente();
                }
            }
            
            Pedido.contador = max;
            System.out.println("Pedidos cargados correctamente");

        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    public void mostrarPedidos() {
        for (Pedido p : arrayPedidos) {
            System.out.println("ID: " + p.getIdPedido());
            for(Producto pr : p.getProductos())
            {
                System.out.println(pr.getNombreProducto());
            }
            System.out.println("Fecha: " + p.getFechaPedido());
            System.out.println("Estado: " + p.getEstado());
        }
    }

}
