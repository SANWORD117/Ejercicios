import java.util.Scanner;

public class ejercicio5 {
    public static boolean esPar(int numero){

            return numero %2 == 0;
    
        }
    public static void main(String[] args) {
    
            int numero_1 = 0;

            Scanner numeros = new Scanner (System.in);

            System.out.println("Ingrese un número: ");

            numero_1 = numeros.nextInt();
            
    
            if (esPar(numero_1)) {
    
                System.out.println("Si es par");
            
            if (numero_1 > 10) {

                System.out.println("Es mayor a 10");

            } else {

                System.out.println("Es menor a 10");

            }
            }

            else {

                System.out.println("No es par");

            
        }
            numeros.close();
    }  
}
