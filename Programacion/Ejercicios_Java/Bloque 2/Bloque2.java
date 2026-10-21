

public class Bloque2 {
    public static void main(String[] args) {
        

        //Estructuras de control
        //Condicionales (IP)

        //Operadores de comparacion
        //Mayor que >
        //Menor que <
        //Igual que ==
        //Distinto que !=


        //Operadores logicos
        //Y: &&
        //O:||
    

        int edad = Integer.parseInt(System.console().readLine(" Tu edad: "));
        boolean entrada = true;

        if (edad<18) {
            System.out.println( "Es menor que 10"); 
        }   else if (edad>10){
            System.out.println( "Es mayor que 10");
        }    else {
            System.out.println( "Es 10 ");
        }


        //Opcion 1: solo if
        //Opcion 2: if- else
        //Opcion 3: else if - else
        //Opcion 4: if - else if - else if - else if .....



        //Math.random() genera aleatorios entre 0 - 0.99999999
        

        double numAleatorio = Math.random();
        System.out.println(numAleatorio);

        //0 -99

        int numAleatorio2 = (int) (Math.random()*100);   //Siempre llega uno menos del que se multiplica
        System.out.println(numAleatorio2);


        //Math.random() entre algo y algo. Ej: 20-100

        int numAleatorio3 = (int)(Math.random()*81)+20;
        System.out.println(numAleatorio3);

         //Math.random() entre algo y algo. Ej: 75-85

        int numAleatorio4 = (int)(Math.random()*11)+75;
        System.out.println(numAleatorio4);

         //Math.random() entre algo y algo. Ej: 12-19

        int numAleatorio5 = (int)(Math.random()*8)+12;
        System.out.println(numAleatorio5);

        
        //BUCLES FOR (yo determino cuantas repeticiones)

        //for(crear variable; mientras; incremento)

        for(int i = 0; i<5; i++){   
            System.out.println("Hola");
            System.out.println(":(");
            System.out.println("");


        
        //FOR: cuando sabemos el numero de repeticiones
        //WHILE: cuando NO sabemos num de repet (esperamos a que alguna condicion se cumpla)




        }


    }
}
