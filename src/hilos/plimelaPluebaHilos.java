package hilos;

import java.util.ArrayList;
import java.util.List;

public class plimelaPluebaHilos {
    public  static void main(String[] args) throws InterruptedException {

        List<String> productos = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            productos.add("producto " + i);
        }

        List<Hilo1> hilos = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            Hilo1 hilarnium = new Hilo1(productos.get(i));
            hilarnium.start();
            hilos.add(hilarnium);
        }

        //aseguramos de que todos los hilos se han acabado paera seguir con el programa

        for (int i = 0; i < hilos.size(); i++){
            hilos.get(i).join();
        }

        System.out.println("fin");

    }
}
