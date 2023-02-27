import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 5: ¿Cuantos mandos tiene la Nintendo 64?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)1");
        System.out.println("2)6");
        System.out.println("3)4");
        System.out.println("4)2");

        respuesta = trivia_g.nextInt();

        if (respuesta==3) {

            System.out.println("Respuesta correcta, siguiente pregunta");
        
        } 
        else {

            System.out.println("Respuesta incorrecta, Gracias por participar");
        }
        trivia_g.close();
        }
    }