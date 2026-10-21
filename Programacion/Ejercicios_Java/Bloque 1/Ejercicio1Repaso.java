public class Ejercicio1Repaso {
    public static void main(String[] args) {
        
        //Variables
        String nombre = "Adrian";
        String apellidos = "Alcantara Moral";
        long numeroCarne = 20260000731L;
        boolean multas = true;
        char categoria = 'A';
        int librosPrestados = 3;
        int diasRetraso = 5;
        final double multa = 0.20;
        int cantidadMultas = librosPrestados + diasRetraso;

        //Calculamos la cantidad de multas
        double deuda = cantidadMultas * multa;


        //Calculamos la multa en dinero
        System.out.println(nombre + apellidos + " numero de carne: " + numeroCarne);
        System.out.println("Categoria: " + categoria);
        System.out.println("Tiene multa: " + multas);
        System.out.println("Libros prestados: " + librosPrestados);
        System.out.println("Dias con retraso: " + diasRetraso);
        System.out.println("Multa pendiente" + deuda + "euros");




    }
}
