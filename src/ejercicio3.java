import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int grados_f = 350;
        double grados_c = 0.0;
        double conversion = 0.0;

        Scanner horno = new Scanner(System.in);
        conversion = (grados_f - 32)/ 1.8;

        grados_c = conversion;

        System.out.println("La Temperatura a ºC es: " + grados_c);
        horno.close();

    }
}
