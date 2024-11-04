/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializableejercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author pedro.rinpiz
 */

public class ListadoClientes 
{

    private ArrayList<Cliente> arrayClientes;
    private ObjectOutputStream salida;
    private ObjectInputStream entrada;

    public ArrayList<Cliente> getArrayClientes() {
        return arrayClientes;
    }

    public void setArrayClientes(ArrayList<Cliente> arrayClientes) {
        this.arrayClientes = arrayClientes;
    }
    
    

    public void agregarCliente(Cliente cliente) 
    {
        arrayClientes.add(cliente);
    }

    public Cliente buscarClientePorId(int idCliente) 
    {
        Cliente c = new Cliente();
        for (Cliente cli : arrayClientes) 
        {
            if (cli.getIdCliente() == idCliente) 
            {
                c = cli;
            }
        }
        return c;
    }

    public void actualizarFicheroClientes() 
    {
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("clientes.ser"));
            salida.writeObject(arrayClientes);
            salida.close();
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }

    public void cargarClientes() throws FileNotFoundException, IOException, ClassNotFoundException {
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("clientes.ser"));
            arrayClientes = (ArrayList<Cliente>) entrada.readObject();
            entrada.close();
            
            int max = 0;
            for(Cliente c : arrayClientes)
            {
                if(c.getIdCliente()> max)
                {
                    max = c.getIdCliente();
                }
            }
            
            Cliente.contador = max;
            System.out.println("Empleados cargados correctamente");
            

        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }
    
    
}