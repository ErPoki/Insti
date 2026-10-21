
public class Ejercicio_30 {
    public static void main(String[] args) {

        String usuario = "no";
        
        while (usuario.equals("si")){ //Mientras te digan algo distinto a "si"

        usuario = System.console().readLine("¿Quieres apagar? (si/no): ");


        }

        System.out.println("Fin");

    }
}
