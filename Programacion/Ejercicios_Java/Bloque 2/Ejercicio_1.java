
public class Ejercicio_1 {
    public static void main(String[] args) {
        

        int edad = Integer.parseInt(System.console().readLine("Tu edad: "));
        boolean entrada = true;

        if (edad >= 18  &&  entrada == true) {
            System.out.println("Puedes pasar");
        }   else {
            System.out.println(" No puedes pasar");
        }

        System.out.println(" Hasta luego");



    }
}
