import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        
        int probabilidad;

        int probabilidades = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1 );

        Scanner juego = new Scanner(System.in);

        System.out.println("Ingrese 1 para elegir Piedra, 2 para elegir Papel o 3 para elegir Tijera");

        probabilidad = juego.nextInt();

        if (probabilidad==probabilidades) {

            System.out.println("Empate");

        } 
        
        else if (probabilidad==1 & probabilidades==2) {

            System.out.println("Has perdido");

        }

        else if (probabilidad==1 & probabilidades==3) {

            System.out.println("Has ganado");

        }

        else if (probabilidad==2 & probabilidades==1) {

            System.out.println("Has ganado");

        }

        else if (probabilidad==2 & probabilidades==3) {

            System.out.println("Has perdido");

        }

        else if (probabilidad==3 & probabilidades==1) {

            System.out.println("Has perdido");

        }

        else{

            System.out.println("Has ganado");

        }
        System.out.println("La maquina elijio " + probabilidades);
        juego.close();
        }
    }
