package hilos4;

import hilos3.*;

public class Raton implements Runnable
{
	private String nombre;
	private int tiempoAlimentacion;
        private int contAlimentos;

    public Raton(String nombre, int tiempoAlimentacion) {
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }
    public void comer(){
        try {
            System.out.println("El ratòn "+nombre+" ha comenzado a comer");
            Thread.sleep(tiempoAlimentacion*1000);
            contAlimentos++;
            System.out.println(contAlimentos);
            System.out.println("El ratòn "+nombre+" ha terminado a comer");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 public static void main(String[] ar) {
     Raton rocky=new Raton("Rocky",4);
     
     new Thread(rocky).start();
     new Thread(rocky).start();
     new Thread(rocky).start();
     new Thread(rocky).start();
     
     
     
}

    @Override
    public void run() {
        this.comer();
    }
}