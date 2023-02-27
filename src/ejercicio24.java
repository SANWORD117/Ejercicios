import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 13: ¿En que juego resultamos ser el villano?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)Shadow of the Colossus");
        System.out.println("2)The Evil Within");
        System.out.println("3)Fallout 4");
        System.out.println("4)Final Fantasy VII Remake");

        respuesta = trivia_g.nextInt();

        if (respuesta==1) {

            System.out.println("Respuesta correcta, siguiente pregunta");
        
        } 
        else {

            System.out.println("Respuesta incorrecta, Gracias por participar");
        }
        trivia_g.close();
        }
    }    