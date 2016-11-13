import java.util.ArrayList;

/**
 * Created by PC on 13/11/2016.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Modifica el valor aqui para los hilos
        int fils = 1000;
        int fils_rng= 1000;

        ArrayList<Threads> threads = new ArrayList<>();
        Guardar guardar = new Guardar();

        for (int i = 0; i < fils; i++) {
            String name = "Fil "+i;
            Threads Threads = new Threads(name, fils_rng);
            threads.add(Threads);
            Threads.start();

        }

        for (Threads f:threads) {
            f.join();
        }

        guardar.imprimir();

    }

}
