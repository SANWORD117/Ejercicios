import java.util.Scanner;

public class ejercicio32 {
    public static void main(String[] args) {
        
        double num1,num2,resultado;

        Scanner area_r = new Scanner(System.in);

        System.out.println("Bienvenido, dividiremos los datos que dijites ya sean enteros o decimales :)");
        System.out.print("Ingresa el primer dato: ");
        num1 = area_r.nextDouble();
        System.out.print("Ingresa el segundo dato: ");
        num2 = area_r.nextDouble();

        resultado = num1 + num2;

        System.out.print("El resultado de la division es: " + resultado);

        area_r.close();
    }
}
