
public class Ejercicio_13 {
    public static void main(String[] args) {
        
        //PReguntamos los datos

        String trabajador = System.console().readLine("Escribe si eres albañil, administrador, comercial o arquitecto: ");
        int horasTrabajadas = Integer.parseInt(System.console().readLine("Escribe el numero de horas trabajadas esta semana: "));
        
        final int horaAlbañil = 15;
        final int horaAdministrador = 12;
        final int horaComercial = 18;
        final int arquitecto = 25;

        switch (trabajador) {
            case "albañil":
                if (horasTrabajadas>0 && horasTrabajadas<40){
                    System.out.println("Cobras: " + (horasTrabajadas*15));
                }else if (horasTrabajadas>40){
                    System.out.println("Cobras: " + ((40*15) + (horasTrabajadas-40)*20));
                } else {
                    System.out.println("Dato incorrecto");
                }
                break;
            case "administrador":
                   if (horasTrabajadas>0 && horasTrabajadas<40){
                    System.out.println("Cobras: " + (horasTrabajadas*12));
                }else if (horasTrabajadas>40){
                    System.out.println("Cobras: " + ((40*12) + (horasTrabajadas-40)*20));
                } else {
                    System.out.println("Dato incorrecto");
                }
                break;
            case "comercial":
                   if (horasTrabajadas>0 && horasTrabajadas<40){
                    System.out.println("Cobras: " + (horasTrabajadas*18));
                }else if (horasTrabajadas>40){
                    System.out.println("Cobras: " + ((40*18) + (horasTrabajadas-40)*20));
                } else {
                    System.out.println("Dato incorrecto");
                }
                break;
            case "arquitecto":
                   if (horasTrabajadas>0 && horasTrabajadas<40){
                    System.out.println("Cobras: " + (horasTrabajadas*25));
                }else if (horasTrabajadas>40){
                    System.out.println("Cobras: " + ((40*25) + (horasTrabajadas-40)*20));
                } else {
                    System.out.println("Dato incorrecto");
                }
                break;
            default:
                System.out.println("No es un trabajo valido en esta empresa");
                break;
        }




    }
}
