import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 11: ¿Cual fue la  primer Playstation?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)PS Project");
        System.out.println("2)Play One");
        System.out.println("3)PlayStation Origin");
        System.out.println("4)PS1");

        respuesta = trivia_g.nextInt();

        if (respuesta==4) {

            System.out.println("Respuesta correcta, siguiente pregunta");
        
        } 
        else {

            System.out.println("Respuesta incorrecta, Gracias por participar");
        }
        trivia_g.close();
        }
    }    