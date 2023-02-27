import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) {

        String genero;

        Scanner generos = new Scanner(System.in);

        System.out.print("Ingrese su Genero (M/F): ");
        genero = generos.next();

        switch (genero) {
            case "M","m":

            System.out.println("Eres hombre");
                
                break;
            
        
            case "F","f":

                System.out.println("Eres mujer");

                break;
            
            default: {
                System.out.println("Dato incorrecto, por favor intentelo nuevamente");
            }

            generos.close();
        }
    
    }
}
