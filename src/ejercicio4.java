import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        double dosis_vacunas = 0;
        int peso_bebe = 0;
        int meses_bebe = 0;

        Scanner dosis = new Scanner(System.in);
        System.out.println("Ingresa el peso del Bebe: ");
        peso_bebe = dosis.nextInt();

        System.out.println("Ingrese los meses del Bebe: ");
        meses_bebe = dosis.nextInt();

        dosis_vacunas = ((peso_bebe + 10) / (meses_bebe * 10)) * 8;

        System.out.println("La dosis correcta para el Bebe es de " + dosis_vacunas);
        dosis.close();
    }
}
