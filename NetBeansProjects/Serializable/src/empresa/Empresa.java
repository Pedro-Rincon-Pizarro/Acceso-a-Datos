/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author pedro.rinpiz
 */
public class Empresa {

    private Empleado[] empleados;
    ObjectOutputStream salida;
    ObjectInputStream entrada;

    public Empresa() {
        empleados = new Empleado[2];
        empleados[0] = new Empleado("Pedro", "Perez", "123456789");
        empleados[1] = new Empleado("Lucas", "Garcia", "987654321");
    }

    public void salvar(){
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("personal.txt"));
            salida.writeObject(empleados);
            salida.close();
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    } 
    public void leer() throws ClassNotFoundException {
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("personal.txt"));
            empleados = (Empleado[]) entrada.readObject();
            entrada.close();

            System.out.println("Empleados");
            for (Empleado emp : empleados) {
                System.out.println(emp.toString());
            }

        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }

}
