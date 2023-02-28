import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 12: ¿El juego Def Jam Fight for NY salio para las plataformas...?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)PS5, Xbox 360 y PC");
        System.out.println("2)PC, Nintendo 64");
        System.out.println("3)PS2 y Xbox");
        System.out.println("4)Nintendo Switch y SEGA Genesis");

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