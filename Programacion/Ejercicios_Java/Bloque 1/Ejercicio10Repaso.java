public class Ejercicio10Repaso {
    public static void main(String[] args) {
        
    //Datos
    String nombre = "Marta Fernandez";
    long numTarjeta = 30000482917L;
    char tipoTarjeta = 'G';
    int saldo = 1000;
    int viajes = 0;
    final int precioViaje = 140;

    //Mostrar ficha
    System.out.println("DATOS DE LA TARJETA: ");
    System.out.println("Nombre: " + nombre);
    

    //Viajes
    viajes++;
    saldo-=140;     //saldo = saldo - 140
    System.out.println(saldo);

    viajes++;
    saldo-=140;
    System.out.println(saldo);

    viajes++;
    saldo-=140;
    System.out.println(saldo);

    //Recarga
    saldo+=500;

    //Volver a mostrar todo


    //Calcular cuantos viajes le quedan
    System.out.println("Con este saldo puedes hacer: " + (saldo/precioViaje) + "viajes mas") ;
    


    }
}
