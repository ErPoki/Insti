public class EsquemaExamen {
    public static void main(String[] args) {
        
            //Variables y sus tipos 
                //int: numeros enteros
                //long: numeros enteros mas largos
                //float: numeros decimales pequeños (se añade f al final)
                //double: numeros decimales largos
                //char: un solo caracter
                //String: varios caracteres (palabras, frases)
                //boolean: true o false
            //Cambios de variables
                //Entre numeros:
                    //Si no pierde info: no hayb bque hacer nada
                    //Si pierde info: parentesis y el tipo (int num = (double) 3.4
                //Si convertimos un String a numero:
                    //Integer.parseInt()
                    //Double.parseDouble()
            //Operaciones matematicas
                //Suma: +
                //Resta: -
                //Multiplicacion: *
                //Division: /
                //Resto de la division: %
                //Aumentar en 1: ++
            //Comentarios de uno o de varias lineas


            int x = 10;
            x++;
            x--;
            x++;
            System.out.println(x);


            double num = 7.5;
            int entero = (int) num;
            System.out.println(entero);


            int numero = 5;
            System.out.println(numero / 2);
            System.out.println(numero % 2);


            



    }
}
