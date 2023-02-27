import java.util.Scanner;

public class ejercicio33 {
    public static void main(String[] args) {

        double num1,num2,num3,resultado;

        Scanner velocidad = new Scanner(System.in);

        System.out.println("Bienvenidos a mi formula para hallar el tiempo en segundo");
        System.out.print("Ingresa la velocidad final: ");

        num1 = velocidad.nextDouble();

        System.out.print("Ingresa la velocidad inicial: ");

        num2 = velocidad.nextDouble();

        System.out.print("Ingresa la aceleración: ");

        num3 = velocidad.nextDouble();

        resultado = (num1 - num2) / num3;

        System.out.println("Tu resultado es: " + resultado);

        velocidad.close();
    }
}