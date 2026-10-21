public class Ejercicio4Repaso {
    public static void main(String[] args) {
        

        String plato = "Lentejas de la abuela";
        double glentejas = 250;
        double gchorizo = 150;
        int numZanahoria = 2;
        double lAgua = 1;
        boolean vegetariano = false;
        int comensales = Integer.parseInt(System.console().readLine("Comensales que van a comer hoy: "));
        System.out.println("El plato a realizar es: " + plato);
        double lentejasFinal = glentejas * comensales;
        double chorizoFinal = gchorizo * comensales;
        int zanahoriaFInal = numZanahoria * comensales;
        double aguaFinal = lAgua * comensales;
        System.out.println("Necesitamos: " + lentejasFinal + " gramos de lentejas " + chorizoFinal + " gramos de chorizo, " + zanahoriaFInal + " zanahoria y " + aguaFinal + "L");
        System.out.println("Es apto para vegetariano: " + vegetariano);
        System.out.println("Numero de comensales para la receta: " + comensales);

        

    }
}
