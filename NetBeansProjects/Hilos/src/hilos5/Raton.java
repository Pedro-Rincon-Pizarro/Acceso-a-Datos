package hilos5;

import hilos3.*;
import java.util.ArrayList;

public class Raton implements Runnable {

    private String nombre;
    private int tiempoAlimentacion;

    public Raton(String nombre, int tiempoAlimentacion) {
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }

    public void comer() {
        try {
            System.out.println("El ratòn " + nombre + " ha comenzado a comer");
            Thread.sleep(tiempoAlimentacion * 1000);
            System.out.println("El ratòn " + nombre + " ha terminado a comer");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] ar) {
        Raton rocky = new Raton("Rocky", 4);
        ArrayList<Thread.State> estadosHilo = new ArrayList();
        Thread h = new Thread(rocky);
        estadosHilo.add(h.getState());
        h.start();
        while(h.getState() != Thread.State.TERMINATED)
        {
            if(!estadosHilo.contains(h.getState()))
            {
                estadosHilo.add(h.getState());
            }
        }
        if(!estadosHilo.contains(h.getState()))
        {
            estadosHilo.add(h.getState());
        }
        for(Thread.State estado : estadosHilo)
        {
            System.out.println("Estado: " + estado);
        }
    }

    @Override
    public void run() {
        this.comer();
    }
}
