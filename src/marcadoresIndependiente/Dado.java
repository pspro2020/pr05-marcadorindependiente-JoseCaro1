package marcadoresIndependiente;

import java.util.Random;

public class Dado {

    private int dados[] = {0, 0, 0, 0, 0, 0};
    private Object[] vigilantes = new Object[]{
            new Object(), new Object(), new Object(), new Object(), new Object(), new Object()};


    protected int lanzarDado() {
        Random random = new Random();

        return random.nextInt(6) + 1;


    }

    protected void aumentarContador(int num) {

        synchronized (vigilantes[num - 1]) {
            dados[num - 1]++;
        }

    }

    public void showCounters() {
        double total = dados[0] + dados[1] + dados[2] + dados[3] + dados[4] + dados[5];
        System.out.printf("Número 1: %d veces\n" +
                "Número 2: %d veces\n" +
                "Número 3: %d veces\n" +
                "Número 4: %d veces\n" +
                "Número 5: %d veces\n" +
                "Número 6: %d veces\n" +
                "Total de veces: %d + %d + %d + %d + %d + %d = %.0f", dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], total);
    }
}
