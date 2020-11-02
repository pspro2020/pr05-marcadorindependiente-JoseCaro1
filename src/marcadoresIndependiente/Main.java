package marcadoresIndependiente;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Dado dado1 = new Dado();
        Thread hiloDado1 = new Thread(new Tiradas(dado1), "Thread 1");
        Thread hiloDado2 = new Thread(new Tiradas(dado1), "Thread 2");
        Thread hiloDado3 = new Thread(new Tiradas(dado1), "Thread 3");

        hiloDado1.start();
        hiloDado2.start();
        hiloDado3.start();
        hiloDado1.join();
        hiloDado2.join();
        hiloDado3.join();

        

        dado1.showCounters();


    }


}
