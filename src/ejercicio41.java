import java.util.Scanner;

public class ejercicio41 {
    public static void main(String[] args) {

        int i= 0;
        int vidas = 3;

        int desicion[] = new int [vidas];

        int revolver = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1 );


        try (Scanner ruleta = new Scanner(System.in)) {
            for (i = 1; i <= 1; i++) {
                System.out.println("Apretar gatillo a ti mismo?");
                System.out.println("1. Si / 2. No");
                desicion[i] = ruleta.nextInt();
                System.out.println("Acción tomada: " + desicion[i]);
            }
            if (desicion[i]==1) {
                System.out.println("Accionas el gatillo y...");

            } else if (desicion[i]==revolver) {
                System.out.println("Sientes como la bala te atraviesa la cabeza");
                System.out.println("CUIDADO! Tienes 2 vidas");

            } else if (desicion[i]==1 & desicion[i]!=revolver){
                System.out.println("Te salvaste... por ahora");

            } else if (desicion[i]==2){
                System.out.println("Decides accionar el gatillo a tu rival y...");

            } else if (desicion[i]==2 & desicion[i]==revolver){
                System.out.println("Ves como tu rival pierde la cabeza, literalmente...");
                System.out.println("Tu rival tiene 2 vidas");  
            } else {
                System.out.println("Se salva... por ahora");
            }
            ruleta.close();
        }
        }
    }
