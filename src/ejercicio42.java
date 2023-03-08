import java.util.Scanner;

public class ejercicio42 {
    public static void main(String[] args) {
        double valor, total;
        String producto, cajero, cliente;
        int documento;
        int cantidad = 1;
        int cont = 1;
        

        Scanner caja_reg = new Scanner(System.in);

        do {
            System.out.println("Ingrese el nombre del cajero");
            cajero = caja_reg.next();
            System.out.println("Ingrese el nombre del cliente");
            cliente = caja_reg.next();
            System.out.println("Ingrese el número de documento del cliente");
            documento = caja_reg.nextInt();
            cont = cont + 1;
        } while (cliente.equals(" ") & documento < 100000000); {
            
            System.out.println("ingrese producto");
            producto = caja_reg.next();
            System.out.println("ingrese cantidades del producto");
            cantidad = caja_reg.nextInt();
            System.out.println("Ingrese el valor del producto");
            valor = caja_reg.nextDouble();

            total = valor * cantidad;

            System.out.println("Cajero: " + cajero);
            System.out.println("Cliente: " + cliente);
            System.out.println("Documento: " + documento);
            System.out.println("Producto: " + producto + " cantidad: " + cantidad + " valor: " + valor);
            System.out.println("Total: " + total);
            
        }

        double compra = total;
        double  pago, Total;

        System.out.println("El cliente tiene que pagar: " + compra);
        System.out.println("El cliente paga:");
        pago = caja_reg.nextDouble();

        Total = pago - compra;

        if (pago > compra) {
            System.out.println("El cambio para dar al cliente es de: " +Total);
        } else {
            System.out.println("Monto Completo");
        }

        caja_reg.close();
    }
}
