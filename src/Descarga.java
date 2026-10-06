import java.util.Random;

public class Descarga extends Thread {
    //guardamos el nombre del archivo y la suma del tiempo que tardan los bloques
    private String nombreArchivo;
    private long tiempoTotal = 0;

    // El constructor recibe el nombre del archivo
    public Descarga(String nombreArchivo) {
        super("Descarga-" + nombreArchivo); // Nombra el hilo
        this.nombreArchivo = nombreArchivo;
    }

    // Getter para obtener el tiempo que ha tardado
    public long getTiempoTotal() {
        return tiempoTotal;
    }

    @Override
    public void run() {
        Random rand = new Random();

        // 10 iteraciones (bloques del 10%)
        for (int i = 1; i <= 10; i++) {
            // Tiempo al azar entre 100 y 500 ms
            int tiempoBloque = rand.nextInt(401) + 100;
            tiempoTotal += tiempoBloque;

            try {
                // dormimos el hilo para simular la espera
                Thread.sleep(tiempoBloque);
            } catch (InterruptedException e) {
                System.out.println("Descarga interrumpida");
            }

            System.out.println("[" + nombreArchivo + "] " + (i * 10) + "%");
        }
        System.out.println("[" + nombreArchivo + "] completada en " + tiempoTotal + " ms");
    }
}