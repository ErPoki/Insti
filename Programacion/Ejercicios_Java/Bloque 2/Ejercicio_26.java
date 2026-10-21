
public class Ejercicio_26 {
    public static void main(String[] args) {
        

        for (int i = 1; i<=100; i++){
                    String frase = System.console().readLine("Dime una frase: ");
                
                    System.out.println(frase);

                    if(frase.equals("STOP")){
                        break;
                    }
                    
                    System.out.println(frase);
        }


    }
}
