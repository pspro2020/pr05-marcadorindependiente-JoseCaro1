package marcadoresIndependiente;

public class Tiradas implements Runnable {

    Dado dado1;
    public Tiradas(Dado dado1){

        this.dado1=dado1;
    }



    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            dado1.aumentarContador(dado1.lanzarDado());
        }



    }
}
