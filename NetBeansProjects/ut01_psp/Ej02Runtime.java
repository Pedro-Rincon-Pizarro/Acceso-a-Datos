package ut01_psp;

/**
 *
 * @author unai.esggir
 */
public class Ej02Runtime {
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
	System.out.println("Free Memory:" + rt.freeMemory());
	System.out.println("Total Memory:" + rt.totalMemory());
	System.out.println("Max Memory:" + rt.maxMemory());
	System.out.println("Available Processors:" +   rt.availableProcessors());
	// run a thread before shutting down
	rt.addShutdownHook(new Thread(() -> {
            System.out.println("Good bye!");
	}));
        
        // Llamada al Garbage Collector.
        rt.gc();
        System.out.println("Garbage Collector ejecutado.");
        
        // Memoria libre después del GC.
        long memoriaLibre = rt.freeMemory();
        System.out.println("Free Memory después del GC: " + memoriaLibre);
        
	System.out.println("Jvm shutting down...");
	}
}

