public class ejercicio2 {

    public static boolean esPar(int numero){

        return numero %2 == 0;

    }
    public static void main(String[] args) {

        int numero_1 = 4;
        

        if (esPar(numero_1)) {

            System.out.println("Si es par");

        } else {

            System.out.println("No es par");

        }
    }
}
