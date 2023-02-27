import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 2: ¿Cuantos luchadores hay en Street Fighter II?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)12");
        System.out.println("2)6");
        System.out.println("3)10");
        System.out.println("4)8");

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
