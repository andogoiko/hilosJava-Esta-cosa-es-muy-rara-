package hilos;

public class OperadorNegatif extends Thread{

    private Contador cont;


    public OperadorNegatif(Contador cont){
        this.cont = cont;
    }

    @Override
    public void run(){
        for(int i = 0; i < 50000; i++){
            try {
                cont.decrementar();
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.printf("El valor actual del contador es: %s\n", cont.getAlberto());
        }

    }

}
