package hilos;

import java.util.ArrayList;

public class pruebaUno {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Thread> currantes = new ArrayList<>();

        for (int i = 0; i < 3; i++){

            currantes.add(new Thread(new Currante(new Tarea((i + 1) * 5))));
        }

        for (Thread currante: currantes) {
            currante.start();
        }

    }

}
