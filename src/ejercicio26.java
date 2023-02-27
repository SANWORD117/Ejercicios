import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        
        double num,resultado;

        Scanner area_c = new Scanner(System.in);

        System.out.println("Bienvenido hallaremos el area de tu cuadrado");
        System.out.print("Ingresa el lado del lado: ");
        num= area_c.nextDouble();

        resultado = num * num;

        System.out.print("El area del cuadrado es: " + resultado);

        area_c.close();
    }
}
