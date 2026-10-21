public class Ejercicio12 {
    public static void main(String[] args) {


        //Preguntamos personas y trozos
        int numPersonas = Integer.parseInt(System.console().readLine( "Num personas"));
        int numTrozos = Integer.parseInt(System.console().readLine( "Num trozos"));

        //Hacemos calculos
        int trozoPersona = numTrozos / numPersonas;
        int trozosSobrantes = numTrozos % numPersonas;

        //Mostramos resultados
        System.out.println("Tocan a " + trozoPersona + "trozos por persona");
        System.out.println("Y sobran"  + trozosSobrantes + "trozos sobrantes");
        
    }

}
