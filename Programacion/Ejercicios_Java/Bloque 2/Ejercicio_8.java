
public class Ejercicio_8 {
    public static void main(String[] args) {
        
        int ancho = Integer.parseInt(System.console().readLine("Escribe el ancho: "));
        int alto = Integer.parseInt(System.console().readLine("Escribe el alto: "));
        int cmCuadrado =  ancho * alto;
        int costeBandera = cmCuadrado * 2;
        int banderaEuro = costeBandera / 100;
        int banderaCentimo = costeBandera % 100;
        int bordado = Integer.parseInt(System.console().readLine("Quieres bordado 0 o 1"));

        if (bordado == 0){
            System.out.println("no hemos añadido bordado");
        } else if (bordado == 1){
            System.out.println("Hemos añadido el bordado");
            banderaEuro = banderaEuro + 2;
            banderaCentimo = banderaCentimo + 50;
        } 

            int envio = Integer.parseInt(System.console().readLine("Quieres que se te envie o prefieres recogerlo responde 0"));
            if (envio == 0){
                System.out.println("No hemos añadido envio");
            } else if (envio == 1){
                System.out.println("Hemos añadido envio");

                banderaEuro = banderaEuro + 5;
            }

                System.out.println("Tu bandera cuesta" + banderaEuro + " euros y " + banderaCentimo + " cent");
    }
}
