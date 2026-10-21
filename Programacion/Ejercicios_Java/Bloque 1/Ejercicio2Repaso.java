public class Ejercicio2Repaso {
    public static void main(String[] args) {
        
        int minutosParking = Integer.parseInt(System.console().readLine("Escribe el numero de minutos que a dejado el coche: " ));
            
            final double minutoPagar = 0.045;
            double deuda = minutosParking * minutoPagar;
            int horas = minutosParking / 60;
            int minutos = minutosParking % 60;
            System.out.println("Has estado: " + horas + "horas y " + minutos + "debes, " + deuda + "euros");



    }
}
