/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author pedro.rinpiz
 */
public class ControlProduccion {

    static final int MAX_NUM_TABLEROS = 20;
    static final int MAX_NUM_PATAS = 80;
    static int numTableros;
    static int numPatas;
    static int numMesas;

    public ControlProduccion() {
        numTableros = 0;
        numPatas = 0;
    }

    public static void main(String[] args) {
        ControlProduccion controlProduccion = new ControlProduccion();
        Thread operarioTableros = new Thread(new OperarioTableros("Paco", controlProduccion));
        Thread operarioPatas = new Thread(new OperarioPatas("Manolo", controlProduccion));
        Thread operarioMesas = new Thread(new OperarioMesas("Jose", controlProduccion));

        
        
        operarioMesas.start();
        operarioTableros.start();
        operarioPatas.start();

        try {
            operarioTableros.join();
            operarioPatas.join();
            operarioMesas.join();
        } catch (Exception e) {
        }

    }

    synchronized void hacerTablero(String nombre) {
        try {

            if (numTableros < MAX_NUM_TABLEROS) {
                numTableros++;
                notifyAll();
                Thread.sleep(100);
                System.out.println("El operario " + nombre + " produce un tablero, ahora hay " + numTableros + " tableros");
            } else {
                System.out.println("No caben mas tableros por el momento, el operario " + nombre + " espera");
                wait();
            }

        } catch (Exception e) {
        }

    }

    synchronized void hacerPata(String nombre) {
        try {

            if (numPatas < MAX_NUM_PATAS) {
                numPatas++;
                notifyAll();
                Thread.sleep(100);
                System.out.println("El operario " + nombre + " produce una pata, ahora hay " + numPatas + " patas");
            } else {
                System.out.println("No caben mas patas por el momento, el operario " + nombre + " espera");
                wait();
            }

        } catch (Exception e) {
        }
    }

    synchronized void hacerMesa(String nombre) {
        try {
            if (numPatas >= 4 && numTableros >= 1) {
                numMesas++;
                numPatas -= 4;
                numTableros--;
                notifyAll();
                Thread.sleep(75);
                System.out.println("El operario " + nombre + " produce una mesa, ahora hay " + numMesas + " mesas");
            } else {
                System.out.println("No hay material suficiente por el momento, el operario " + nombre + " espera");
                wait();
            }
        } catch (Exception e) {
        }
    }

}
