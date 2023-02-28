import java.util.Scanner;

public class ejercicio36 {
    public static void main(String[] args) {

    int venta1,venta2,venta3,venta4,venta5;
    int precio_final;
    Scanner tienda = new Scanner(System.in);

        for (int cont = 1; cont <=5; cont++) {

        System.out.println(cont+",");

        
       
            System.out.println("TIENDA DE DON PANCHO");
            
            System.out.print("Ingrese el valor del primer producto: ");
            venta1 = tienda.nextInt();
            System.out.print("Ingrese el valor del segundo producto: ");
            venta2 = tienda.nextInt();
            System.out.print("Ingrese el valor del tercer producto: ");
            venta3 = tienda.nextInt();
            System.out.print("Ingrese el valor del cuarto producto: ");
            venta4 = tienda.nextInt();
            System.out.print("Ingrese el valor del quinto producto: ");
            venta5 = tienda.nextInt();

            precio_final = venta1 + venta2 + venta3 + venta4 + venta5;

            System.out.println("La cantidad a pagar en total es de: " + precio_final);
           
        }
        tienda.close();
    }
}
