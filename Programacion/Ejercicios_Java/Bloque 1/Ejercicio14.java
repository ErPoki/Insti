public class Ejercicio14 {
    public static void main(String[] args) {
        
        double dineroActual = Double.parseDouble(System.console().readLine("Escribe el dinero que tienes en el banco: " ));
        double dineroIngreso = Double.parseDouble(System.console().readLine("Escribe el dinero que quieres ingresar: "));
        double dineroPedir = Double.parseDouble(System.console().readLine("Escribe el dinero que quieres retirar: "));
        double dineroFinal = dineroActual + dineroIngreso - dineroPedir;

        System.out.println("Tienes en la cuenta: " + dineroFinal);

    }
}
