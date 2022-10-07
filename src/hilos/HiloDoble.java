package hilos;

public class HiloDoble extends Thread{

    @Override
    public void run(){
        //new Hilo1().start();
        new Hilo2().start();
    }
}
