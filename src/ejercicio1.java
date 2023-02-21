import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int ano_actual = 0;
        int ano_nacimiento = 0;
        int edad = 0;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese año actual: ");
        ano_actual = lectura.nextInt();

        System.out.println("Ingrese año de nacimiento: ");
        ano_nacimiento = lectura.nextInt();

        edad = ano_actual - ano_nacimiento;

        System.out.println("Tu familiar tiene " + edad + " años de edad");
        lectura.close();
    } 
}
