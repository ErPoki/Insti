
public class Ejercicio_28 {
    public static void main(String[] args) {
        

        int numUsuario = Integer.parseInt(System.console().readLine("Di un numero: "));

        for(int i = 0; i <= 100; i++){

           
            if(i==numUsuario){
                continue;
            }
                        System.out.println(i);

        }



    }
}
