import java.util.Scanner;

public class ejercicio37 {
    public static void main(String[] args) {

        int venta1,venta2,venta3,venta4,venta5,precio_final;
        int i=1;

        Scanner tienda = new Scanner(System.in);
        while (i<=10) {

            System.out.println(+i);
            i++;

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
