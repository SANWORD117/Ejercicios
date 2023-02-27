import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        
        int probabilidad;

        int probabilidades = (int) Math.floor(Math.random() * (2 - 1 + 1) + 1 );

        Scanner moneda = new Scanner(System.in);

        System.out.println("Ingrese 1 para elegir Cara o 2 para elegir Sello");

        probabilidad = moneda.nextInt();

        if (probabilidad==probabilidades) {

            System.out.println("Has ganado");

        } 
        
        else {

            System.out.println("Has perdido");

        }
        System.out.println( "La maquina ha elegido " + probabilidades);
        moneda.close();
    }
}
