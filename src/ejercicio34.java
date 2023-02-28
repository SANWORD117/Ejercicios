import java.util.Scanner;

public class ejercicio34 {
    public static void main(String[] args) {

        int resultado;
        int probabilidades = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1 );

        Scanner dado = new Scanner(System.in);

        System.out.println("Juego de Dados");
        System.out.println("Por favor ingresa el numero que va a salir del dado");
        resultado = dado.nextInt(7);

        if (resultado==probabilidades) {

            System.out.println("Has acertado!");

        }
        else {

            System.out.println("Mala suerte, no acertaste el número");

        }
        System.out.println("Salio " + probabilidades);
        dado.close();
    }
}
