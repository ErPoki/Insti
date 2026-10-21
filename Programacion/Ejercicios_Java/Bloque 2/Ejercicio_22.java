
public class Ejercicio_22 {
    public static void main(String[] args) {
        

            String pregunta = System.console().readLine("Escribe una pregunta:  ");
            int num1 = Integer.parseInt(System.console().readLine("Escribe cuantas veces se repite: "));
            
            for(int i = 0; i<num1; i++){
                System.out.println(pregunta);
            }

                


    }
}
