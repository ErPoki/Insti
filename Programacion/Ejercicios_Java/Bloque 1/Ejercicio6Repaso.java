public class Ejercicio6Repaso {
    public static void main(String[] args) {
        
        //Datos

        String nombreApellido = "Luis Matinez";
        int dorsal = 1482;
        char letraCategoria = 'S';
        boolean federada = true;
        double kmRecorridos = 10.5;
        int tiempoTotalSeg = 6150;

        //Calculos h, m, s

        int segundos = tiempoTotalSeg%60;
        int minutos = tiempoTotalSeg/60;
        int horas = tiempoTotalSeg/3600;

        System.out.println("H: " + horas + ", M" + minutos);

        //Calculos del tiempo medio por km
        
        double tiempoPorKm = tiempoTotalSeg/kmRecorridos;

        //Mostramos datos por consola
        
        System.out.println("Ha tardado: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
        System.out.println("Tiempo medio por km: " +tiempoPorKm);

    }
}
