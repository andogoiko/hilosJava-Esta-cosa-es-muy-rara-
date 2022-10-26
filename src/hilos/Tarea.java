package hilos;

public class Tarea {

    private int TiempoDeEjecucion;

    public Tarea(int TiempoDeEjecucion){
        this.TiempoDeEjecucion = TiempoDeEjecucion * 1000;
    }

    public void ejecutar () throws InterruptedException {
        System.out.printf("Me estoy haciendo cargo de la siguiente tarea: %d\n", TiempoDeEjecucion);
        Thread.sleep(TiempoDeEjecucion);
        System.out.printf("acabé la tarea: %d\n", TiempoDeEjecucion);
    }

}
