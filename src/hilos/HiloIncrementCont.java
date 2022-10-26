package hilos;

import java.util.ArrayList;

public class HiloIncrementCont {

    public static void main (String[] args) throws InterruptedException {

        Contador cont = new Contador();

        ArrayList<Thread> hilosSumatorios = new ArrayList<>();

        /*for (int i = 0; i < 100; i++){
            hilosSumatorios.add(new Thread(new Operador(new Suma(cont))));
        }*/

        hilosSumatorios.add(new Thread(new Operador(cont)));
        hilosSumatorios.add(new OperadorNegatif(cont));
        hilosSumatorios.add(new Thread(new Operador(cont)));
        hilosSumatorios.add(new OperadorNegatif(cont));
        hilosSumatorios.add(new Thread(new Operador(cont)));
        hilosSumatorios.add(new OperadorNegatif(cont));

        for (Thread operacion: hilosSumatorios) {

            operacion.start();
        }
        for (int i = 0; i < hilosSumatorios.size(); i++){
            hilosSumatorios.get(i).join();
        }

        System.out.printf("El valor final del contador es: %s", cont.getAlberto());

    }

}
