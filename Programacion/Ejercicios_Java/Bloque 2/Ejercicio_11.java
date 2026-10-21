
public class Ejercicio_11 {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al programa de dorsales del equipo maravilla: ");
        int dorsal = Integer.parseInt(System.console().readLine("¿Que dorsal quieres comprobar?: "));

        switch (dorsal) {
            case 5:
                System.out.println("Es Ronaldo");  
                break;
            case 9:
                System.out.println("Es Carazo");
                break;
            case 20:
                System.out.println("Es Soriana");
                break;
            case 23:
                System.out.println("Es Dembele");
                break;
            case 1:
                System.out.println("Es Poki");
            default:
                System.out.println("No tiene jugador");
                break;
        }

    }
}
