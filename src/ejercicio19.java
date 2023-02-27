import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 8: ¿El asesino serial Jack el Destripador, tuvo su aparición en...?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)Manhunt 2");
        System.out.println("2)Ninja Gaiden II");
        System.out.println("3)Fortnite");
        System.out.println("4)Assassin's Creed Syndicate");

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