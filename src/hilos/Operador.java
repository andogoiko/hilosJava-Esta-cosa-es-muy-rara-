package hilos;

public class Operador implements Runnable{

    private Contador cont;

    public Operador(Contador cont){
        this.cont = cont;
    }

    @Override
    public void run(){
        for(int i = 0; i < 50000; i++){
            try {
                cont.incrementar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("El valor actual del contador es: %s\n", cont.getAlberto());
        }

    }

}
