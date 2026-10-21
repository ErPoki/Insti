public class Ejercicio11 {
    public static void main(String[] args) {

        //LOS DATOS QUE PODRIAN VARIAR SE GUARDAN EN VARIABLES
        //LOS DATOS QUE NO VAN A VARIAR SE GUARDAN EN CONSTANTES


        //Primero pregunto euros
        double euros = Double.parseDouble(System.console().readLine( "Euros: "));


        //Luego hago el cambio
        double cambio = 1.15;
        double dolares = euros * cambio;

        //Muestro resultados en dolares
        System.out.println("Son en total: " + dolares + "dolartes.");
    }
}
