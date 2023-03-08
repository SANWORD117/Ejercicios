import java.util.Scanner;

public class ejercicio44 {
    public static void main(String[] args)  {

    int decision;
    int probabilidades = (int) Math.floor(Math.random() * (16 - 1 + 1) + 1 );

    Scanner the_game = new Scanner(System.in);

    int [][] Buscaminas= {{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}};

    System.out.println("BIENVENIDOS AL BUSCAMINAS");
    
    for(int fila=0;fila<4;fila++) {

    for(int columna=0;columna<4;columna++)

    {

    System.out.print(Buscaminas[fila][columna]+"\t");

    }

    System.out.println("");

    }

    do {

    System.out.println("Por favor, digita el numero que deseas comenzar");
    decision=the_game.nextInt();

    if(decision==probabilidades) {

    System.out.println("Volaste por los aires, FIN DEL JUEGO");

    } else {

    System.out.println("No has pisado una mina... de momento ^_^");

    }

    int i = 1;
    i = i + 1;
    
    } while (decision!=probabilidades & decision<=8); {

        System.out.println("Sigue jugando");

    }

    System.out.println("Gracias Por Jugar");

    the_game.close();
    }
}
