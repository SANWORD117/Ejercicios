import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
        
        double num1,num2,resultado;

        Scanner area_r = new Scanner(System.in);

        System.out.println("Bienvenido, halleremos el area del rectangulo por ti :)");
        System.out.print("Ingresa el lado 1 del rectangulo: ");
        num1 = area_r.nextDouble();
        System.out.print("Ingresa el lado 2 del rectangulo: ");
        num2 = area_r.nextDouble();

        resultado = num1 * num2;

        System.out.print("El area del rectangulo es de: " + resultado);

        area_r.close();
    }
}
