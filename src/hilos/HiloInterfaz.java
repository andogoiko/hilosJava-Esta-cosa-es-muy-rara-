package hilos;

public class HiloInterfaz implements Runnable{

    private String nombre;

    public HiloInterfaz(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run(){

        System.out.printf("Hola soy el hilo %s\n", nombre);

    }
}
