public class GestorDescargas {
    public static void main(String[] args) {
        String[] nombres = {"cuarzos.png", "meditacion.mp4", "mantras.mp3", "horoscopo.pdf"};
        Descarga[] hilos = new Descarga[4];

        //guerda el momento en el que arranca el proceso de descargas, obtiene la hora exacta del sistema
        long tiempoInicioReal = System.currentTimeMillis();

        // 1. Crear y arrancar todas las descargas
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Descarga(nombres[i]);
            hilos[i].start();
        }

        long tiempoSecuencial = 0;

        // 2. Esperar a que terminen todas
        for (Descarga hilo : hilos) {
            try {
                hilo.join();
                tiempoSecuencial += hilo.getTiempoTotal();
            } catch (InterruptedException e) {
                System.out.println("Espera interrumpida");
            }
        }

        long tiempoFinReal = System.currentTimeMillis();
        long tiempoReal = tiempoFinReal - tiempoInicioReal;

        // 3. Informe final
        System.out.println("Todas las descargas han terminado.");
        System.out.println("Tiempo real: " + tiempoReal + " ms");
        System.out.println("Si se hubieran descargado una detrás de otra: " + tiempoSecuencial + " ms");
    }
}