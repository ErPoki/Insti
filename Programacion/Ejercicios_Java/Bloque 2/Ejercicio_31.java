
public class Ejercicio_31 {
    public static void main(String[] args) {
        


        int numAleatorio = (int)(Math.random()*100+1);
        int numUsuario = 0;

        do{
        
        numUsuario = Integer.parseInt(System.console().readLine("Di un numero: "));
        
        if(numUsuario>numAleatorio){
            System.out.println("Busca un numero mas pequeño");
        }else if(numUsuario<numAleatorio){
            System.out.println("Busca un numero mas grande");
        } else {
            System.out.println("Acertaste");
        }
        
      } while (numAleatorio != numUsuario);
    

    }
}
