public class Ejercicio9 {

    public static void main(String[] args) {
        
        //Empiezo pidiendo el numero de horas al usuario
        int numHoras = Integer.parseInt(System.console().readLine("Horas: "));

        //Ahora calculo y muestro los dias
        int numDias = numHoras / 24;
        System.out.println(numDias + "dias");

        //Ahora calculo y muestro las horas restantes
        int horasRestantes = numHoras % 24;
        System.out.println(horasRestantes + "horas");


        //Suma: +
        //Resta: -
        //Multiplicacion: *
        //Division: /
        //Resto de una division: %3

    }
}