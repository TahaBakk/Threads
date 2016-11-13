import java.util.ArrayList;

/**
 * Created by PC on 13/11/2016.
 */
class Guardar {

    static ArrayList<String> threads = new ArrayList<>();

    private int pos = 0;

    public void fils(String fil, int val){
        pos++;
        String value = "Posicio " +pos+" ==> "+fil+" "+ val;
        threads.add(value);
    }

    static void imprimir() {
        for (String f: threads) {
            System.out.println(f);
        }
    }
}


