import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 7: ¿juego de Zombies más realista?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)The Last of Us");
        System.out.println("2)Project Zomboid");
        System.out.println("3)H1Z1");
        System.out.println("4)Left 4 Dead");

        respuesta = trivia_g.nextInt();

        if (respuesta==2) {

            System.out.println("Respuesta correcta, siguiente pregunta");
        
        } 
        else {

            System.out.println("Respuesta incorrecta, Gracias por participar");
        }
        trivia_g.close();
        }
    }