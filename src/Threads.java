/**
 * Created by PC on 13/11/2016.
 */
public class Threads extends Thread {

    String fil;
    int val;

    Guardar guardar = new Guardar();

    public Threads(String fil, int val){
        this.fil= fil;
        this.val=val;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {

            int value = (int) Math.round(Math.random()*100);
            guardar.fils(fil, value);
            }
        }
}



