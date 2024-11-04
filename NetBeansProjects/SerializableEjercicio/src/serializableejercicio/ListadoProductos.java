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
import java.util.Comparator;

/**
 *
 * @author pedro.rinpiz
 */
public class ListadoProductos 
{
    private ArrayList<Producto> arrayProductos;

    public ArrayList<Producto> getArrayProductos() {
        return arrayProductos;
    }

    public void setArrayProductos(ArrayList<Producto> arrayProductos) {
        this.arrayProductos = arrayProductos;
    }
    
    
    
    public void agregarProducto(Producto producto)
    {
        arrayProductos.add(producto);
        
    }
    
    public Producto buscarProductoDispPorNombre(String nombreProducto)
    {
        Producto prodTemp = new Producto();
        for(Producto pro : arrayProductos)
        {
            if(pro.getNombreProducto().equalsIgnoreCase(nombreProducto) && pro.getCantidadDisponible() > 0)
            {
               prodTemp = pro;
            }
        }
        if(prodTemp != null)
        {
            return prodTemp;
        }
        else
        {
            return null;
        }
    }
    
    public void ordenarProductosPorPrecio()
    {
        arrayProductos.sort(Comparator.comparing(Producto:: getPrecio));
        for(Producto prod : arrayProductos)
        {
            System.out.println(prod.toString());
        }
        arrayProductos.sort(Comparator.comparing(Producto:: getIdProducto));
    }
    
    public void actualizarFicheroProductos()
    {
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("productos.ser"));
            salida.writeObject(arrayProductos);
            salida.close();
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }
    
    public void cargarProductos() throws ClassNotFoundException
    {
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("productos.ser"));
            arrayProductos = (ArrayList<Producto>) entrada.readObject();
            entrada.close();

            int max = 0;
            for(Producto pr : arrayProductos)
            {
                if(pr.getIdProducto()> max)
                {
                    max = pr.getIdProducto();
                }
            }
            
            Cliente.contador = max;
            System.out.println("Productos cargados correctamente");
            

        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }
    
    
}

