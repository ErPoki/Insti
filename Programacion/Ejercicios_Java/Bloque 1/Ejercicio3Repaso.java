public class Ejercicio3Repaso {
    public static void main(String[] args) {
        
        String nombre = "Granja Neveral";
        long numeroSanitario = 6394528993L;
        char tamano = 'M';
        boolean ecologico = false;
        int huevos = 4546;
        int hueveras = huevos / 12;
        int sobraHuevos = huevos % 12;
        final double precio = 2.35;
        double precioFinal = hueveras * precio;
        System.out.println(nombre + "numero sanitario: " + numeroSanitario);
        System.out.println("Huevos de la talla: " + tamano);
        System.out.println("Ecologicos: " + ecologico);
        System.out.println("Se a recogido y vendido un total de " + hueveras + " hueveras llenas");
        System.out.println("Se a ingresado " + precioFinal + " euros ");
        System.out.println("Han sobrado " + sobraHuevos + " huevos");




    }
}
