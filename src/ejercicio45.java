import java.util.Scanner;

public class ejercicio45 {
    public static void main(String[] args) {
        
        int Si_Disp = 0, Si_Ocup = 0, respuesta;

        Scanner cine_a = new Scanner(System.in);

        System.out.println("Bienvenido a CineColombia (^_+)");
        System.out.print("Por favor digita el Número de sillas disponibles: ");
        Si_Disp = cine_a.nextInt();

        for (int i = 0; i <= Si_Disp; i++) {

            System.out.print("Digita el número de sillas que quieren pagar: ");
            respuesta = cine_a.nextInt();

            if (Si_Ocup < Si_Disp) {

                Si_Disp = Si_Disp - respuesta;
                Si_Ocup = respuesta;
                
                System.out.println("Sillas Disponibles: " + Si_Disp);                
            } else {
                
                System.out.println("No se puede realizar esta acción");
                System.out.println("Las sillas disponibles son menor a las que se quieren pagar");
                
            }
        }
            System.out.println("Gracias por elegir CineColombia!");
            System.out.println("Disfruta de la Función ^_~");

        cine_a.close();
    }
}
