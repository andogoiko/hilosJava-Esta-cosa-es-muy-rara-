package hilos;

import java.util.concurrent.atomic.AtomicInteger;

public class Contador {

    private int alberto = 0;

    private Object alvv = new Object();

    public int getAlberto() {
        return alberto;
    }

    //private AtomicInteger alberto = new AtomicInteger(0);

    /*public AtomicInteger getAlberto() {
        return alberto;
    }*/

    public void incrementar() throws InterruptedException {
        //alberto.incrementAndGet();
        synchronized (alvv){
            while(alberto >= 10){
                alvv.wait();
            }
            alberto++;
        }
    }

    public void decrementar(){
        synchronized (alvv){
            alberto--;
            System.out.printf("El valor actual del contador es: %s\n", alberto);
            alvv.notifyAll();
            }

    }


}
