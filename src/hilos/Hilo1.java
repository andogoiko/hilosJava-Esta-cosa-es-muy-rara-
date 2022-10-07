package hilos;

public class Hilo1 extends Thread{

    private String numHilo;

    public Hilo1(String numHilo){
        this.numHilo = numHilo;
    }

    @Override
    public void run(){
        //while (true){
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Cheeeee este es el %s hiiiloo\n", numHilo);
        //}
    }
}
