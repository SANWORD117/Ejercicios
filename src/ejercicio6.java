import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        
        int pasajes,comida,postre,ecuacion;

        Scanner gastos = new Scanner(System.in);

        System.out.println("Ingrese cantidad gastada en pasajes: ");

        pasajes = gastos.nextInt();

        System.out.println("Ingrese cantidad gastada en comida: ");

        comida = gastos.nextInt();

        System.out.println("Ingrese cantidad gastada en postres: ");

        postre = gastos.nextInt();

        ecuacion = (pasajes + comida + postre) / 3;

        if (ecuacion > 50000) {
            
            System.out.println("Malgastas la plata con un promedio de: " + ecuacion);
        }
        else if (ecuacion == 50000) {

            System.out.println("Gastas normalmente 50000");
        }
        else {

            System.out.println("Ahorras plata con un promedio de: " + ecuacion);
        }
        gastos.close();
    }
}
