package hilos;

public class Hilo2 extends Thread{

    public Hilo2(){

    }

    @Override
    public void run(){
        while (true){
            System.out.println("pos este es el segundo");
        }
    }
}
