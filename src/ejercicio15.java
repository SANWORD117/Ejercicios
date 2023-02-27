import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 4: ¿Dark Souls fue creado por...?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)Hideo Kojiya");
        System.out.println("2)Fumito Ueda");
        System.out.println("3)Dan Houser");
        System.out.println("4)Hidetaka Miyasaki");

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