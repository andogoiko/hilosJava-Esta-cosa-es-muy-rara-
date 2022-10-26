package hilos;

public class Currante implements Runnable{

    private Tarea obligacion;

    public Currante(Tarea obligacion){
        this.obligacion = obligacion;
    }

    @Override
    public void run(){
        try {
            obligacion.ejecutar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
