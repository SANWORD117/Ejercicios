import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
            
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Ultima Respuesta: ¿Como son Apodados los tres personajes de Dark Souls I, II y III?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)Kyle, Blade y Washfall");
        System.out.println("2)No Muerto Elegido, El Maldito y El Latente");
        System.out.println("3)Ojos Fragmentados, Gwyn y Patches");
        System.out.println("4)Solaire de Astora, Artorias caminante del Abismo y Caballero Esclavo Gael");

        respuesta = trivia_g.nextInt();

        if (respuesta==2) {

            System.out.println("Respuesta correcta, Felicidades! Completaste la Trivia con Exito, Gracias por Jugar");
        
        } 
        else {

            System.out.println("Respuesta incorrecta, Gracias por participar");
        }
        trivia_g.close();
        }
    }
