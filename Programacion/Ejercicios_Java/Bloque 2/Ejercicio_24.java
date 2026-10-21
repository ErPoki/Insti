
public class Ejercicio_24 {
    public static void main(String[] args) {
        

        int tabla = Integer.parseInt(System.console().readLine("¿Que tabla de multiplicar quieres?: "));

        if (tabla>=0 && tabla<11){
        for(int i = 0; i<=10; i++){
            System.out.println(tabla + " x " + i + " = " + (tabla * i) );
}
           

        }else{
            System.out.println("No existe esa tabla");
        }

        

    }
}
