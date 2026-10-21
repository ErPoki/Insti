

public class Ejercicio_3 {
    public static void main(String[] args) {
        

        System.out.println("Bienvenido al programa de dorsales del equipo maravilla: ");
        int dorsal = Integer.parseInt(System.console().readLine("¿Que dorsal quieres comprobar?: "));

        if (dorsal==5){
            System.out.println("Es Ronaldo");
        } else if (dorsal==9){
            System.out.println("Es Carazo");
        } else if (dorsal==20){
            System.out.println("Es Soriana");
        } else if (dorsal==23){
            System.out.println("Es Dembele");
        } else if (dorsal==1){
            System.out.println("Es Poki");
        } else {
            System.out.println("No tiene jugador");
        }
    }

}
