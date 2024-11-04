package hilos3;
public class Raton implements Runnable
{
	private String nombre;
	private int tiempoAlimentacion;

    public Raton(String nombre, int tiempoAlimentacion) {
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }
    public void comer(){
        try {
            System.out.println("El ratòn "+nombre+" ha comenzado a comer");
            Thread.sleep(tiempoAlimentacion*1000);
            System.out.println("El ratòn "+nombre+" ha terminado a comer");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 public static void main(String[] ar) {
     Raton rocky=new Raton("Rocky",4);
     Raton jerry=new Raton("Jerry",3);
     Raton pinky=new Raton("Pinky",5);
     Raton mickey=new Raton("Mickey",6);
     
     new Thread(rocky).start();
     new Thread(jerry).start();
     new Thread(pinky).start();
     new Thread(mickey).start();
}

    @Override
    public void run() {
        this.comer();
    }
}