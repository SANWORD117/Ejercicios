import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 6: ¿Cuál fue el Juego del Año en 2022?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)God of War Ragnarok");
        System.out.println("2)Elden Ring");
        System.out.println("3)Stray");
        System.out.println("4)Ark II");

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