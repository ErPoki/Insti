
public class Ejercicio_27 {
    public static void main(String[] args) {
        
            String contrasena = "";

            for (int i = 1; i <= 3; i++){
                contrasena = System.console().readLine("Introduce una contraseña; ");

                if (contrasena.equals("123abc")){
                    System.out.println("Contraseña acertada");
                    break;
                }else{
                    System.out.println("Contraseña incorrecta, te quedan " + (2-1) + "intentos");
                }


            }



    }
}
