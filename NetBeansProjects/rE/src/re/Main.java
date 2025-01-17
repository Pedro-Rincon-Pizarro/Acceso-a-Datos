/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package re;

/**
 *
 * @author pedro.rinpiz
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Se abre la clase");
        Bienvenida bienvenida = new Bienvenida();

        Alumno ana = new Alumno("Ana ", bienvenida);
        Alumno yazmin = new Alumno("yazmin ", bienvenida);
        Alumno pepito = new Alumno("pepito ", bienvenida);
        Alumno miriam = new Alumno("miriam ", bienvenida);
        Alumno juan = new Alumno("juan ", bienvenida);
        Alumno felipe = new Alumno("felipe ", bienvenida);

        Profesor p = new Profesor("Profesor", bienvenida);
        ana.start();
        Thread.sleep(1000);
        yazmin.start();
        Thread.sleep(1000);
        pepito.start();
        Thread.sleep(1000);
        miriam.start();
        Thread.sleep(1000);
        juan.start();
        Thread.sleep(1000);
        
        p.start();
        
        Thread.sleep(1000);
        
        felipe.start();
        Thread.sleep(1000);
        
        try {
            ana.join();
            yazmin.join();
            pepito.join();
            miriam.join();
            juan.join();
            
            p.join();
            felipe.join();
            
            
        } catch (Exception e) {
        }

    }
}
