
public class Ejercicio_32 {
    public static void main(String[] args) {
        

        String vocal = "";
        int i = 0;
        while (!vocal.equals("0")){
        vocal = System.console().readLine("Esctibe un caracter");
        if(vocal.equals("a") || vocal.equals("e") || vocal.equals("o") || vocal.equals("u")){
        i++;

        }

        }

        System.out.println("Has anotado " + i + "vocales");


    }
}
