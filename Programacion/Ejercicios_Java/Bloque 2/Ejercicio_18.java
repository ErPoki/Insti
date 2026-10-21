
public class Ejercicio_18 {
    public static void main(String[] args) {
        

        int edad = Integer.parseInt(System.console().readLine("Escribe tu edad: "));

        if (edad>=18){
            String apuesta = System.console().readLine("Indica que opciones quieres de apuesta: color, numero, seccion, par o impar: ");
            switch (apuesta) {
                case "color":
                    int color = (int) (Math.random()*3);
            switch (color){
                case 0:
                    System.out.println("Negro");
                break;
                
                case 1:
                    System.out.println("Rojo");
                break;

                case 2:
                    System.out.println("Verde");
                break;

            }                    
                    
                break;

                case "numero":
                    int numero1 = (int) (Math.random()*37);
                    System.out.println("Tu numero es:" + numero1);
                    break;
                
                    case "secciones":
                        int secciones = (int) (Math.random()*3)+1;
                        System.out.println("La seccion es: " + secciones);
                        break;

                    case "paroimpar":
                        int paroimpar = (int) (Math.random()*2);

                        switch (paroimpar) {
                            case 0:
                                System.out.println("Es par");
                                break;

                            case 1:
                                System.out.println("Es impar");
                                break;
                            
                                
                              
                        }
                
                    break;
            }
        }

    }
}
