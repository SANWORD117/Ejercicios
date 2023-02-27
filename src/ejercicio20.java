import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 9: ¿Cuantos juegos de Pokemon existen hasta la actualidad?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)96");
        System.out.println("2)45");
        System.out.println("3)60");
        System.out.println("4)114");

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