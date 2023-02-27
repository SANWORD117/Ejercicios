import java.util.Scanner;

public class ejercicio35 {
    public static void main(String[] args) {

        double num1,num2,resultado;

        Scanner velocidad = new Scanner(System.in);

        System.out.println("Bienvenidos a mi formula para hallar la velocidad");
        System.out.print("Ingresa la distancia: ");

        num1 = velocidad.nextDouble();

        System.out.print("Ingresa el Tiempo: ");

        num2 = velocidad.nextDouble();

        resultado = num1 / num2;

        System.out.println("Tu resultado es: " + resultado + "km/h");

        velocidad.close();
    }
}