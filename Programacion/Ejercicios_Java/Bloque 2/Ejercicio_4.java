
public class Ejercicio_4 {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido a los dias de la semana ");

        int numero = Integer.parseInt(System.console().readLine("Dime un numero del 1 al 7: "));
        if (numero==1){
            System.out.println("Es Lunes");
        } else if (numero==2){
            System.out.println("Es Martes");
        } else if (numero==3){
            System.out.println("Es Miercoles");
        } else if (numero==4){
            System.out.println("Es Jueves");
        } else if (numero==5){
            System.out.println("Es Viernes");
        } else if (numero==6){
            System.out.println("Sabado");
        } else if (numero==7){
            System.out.println("Es domigo");
        } else {
            System.out.println("No es un dia de la semana");
        }


    }
}
