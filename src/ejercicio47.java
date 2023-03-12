import java.util.Scanner;

public class ejercicio47 {
    public static void main(String[] args) {
        
            int n = 0, Si_Disp = 0, Si_Ocup = 0, respuesta, decision = 1;
    
            Scanner cine_c = new Scanner(System.in);
    
            System.out.println("Bienvenido a CineColombia (^_+)");
            System.out.print("Por favor digita el Número de sillas disponibles: ");
            Si_Disp = cine_c.nextInt();
  
            do {

                System.out.println("Sillas disponibles: " + Si_Disp);
                System.out.println("Ingresa la cantidad de sillas que quiere pagar: ");
                respuesta = cine_c.nextInt();

                if (Si_Ocup < Si_Disp) {
                    Si_Disp = Si_Disp - respuesta;
                    Si_Ocup = respuesta;
                    System.out.println("Se confirmo el pago de las sillas");

                } else {

                  System.out.println("Lo siento pero el numero de sillas que se desean pagar es mayor a las sillas disponibles");
                  System.out.println("Intentalo de nuevo");

                }

                System.out.println("Deseas hacer otra venta?");
                decision = cine_c.nextInt();

                n++;
            } while (decision == 1);

                System.out.println("Gracias por elegir CineColombia!");
                System.out.println("Disfruta de la Función ^_~");

                System.out.println("Ventas hechas: " + n);
            cine_c.close();
        }
    
}
