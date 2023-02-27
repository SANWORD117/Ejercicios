import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 10: ¿Cuál es el personaje más alto de la Saga GTA?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)Carl Jonhson (CJ)");
        System.out.println("2)Claude Speed");
        System.out.println("3)Niko Bellic");
        System.out.println("4)Trevor Phillips");

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