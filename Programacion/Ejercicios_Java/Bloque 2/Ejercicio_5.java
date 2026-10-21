
public class Ejercicio_5 {
public static void main(String[] args) {
    //Creamos la variable nota por consola
    double nota = Double.parseDouble(System.console().readLine("Escribe tu nota: "));
    //Creamos if y comparamos por dosm factores, va variando segun la nota que haya puesto.
    if (nota >= 0 && nota < 5){
        System.out.println("Su nota es insuficiente");
    }else if (nota >= 5 || nota < 6){
        System.out.println("Su nota es suficiente");
    }else if (nota >= 6 && nota <= 7){
        System.out.println("Su nota es un bien");
    }else if (nota >= 8 && nota < 9){
        System.out.println("Es un notable");
    }else if (nota >= 9 && nota < 10){
        System.out.println("Es un sobresaliente");
    }else {
        System.out.println("La nota introducida esta fuera de rango");
    }

}        
    }
