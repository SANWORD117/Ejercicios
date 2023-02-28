import java.util.Scanner;

public class ejercicio38 {
    public static void main(String[] args) {

        int pc;
        String estado;
        int i=1;

        Scanner salon_412 = new Scanner(System.in);
        while (i<=26) {

            System.out.println(+i);
            i++;

            System.out.println("COMPUTADORES AULA 412");
            
            System.out.print("Ingrese el número del equipo: ");
            pc = salon_412.nextInt();

            System.out.print("Ingrese el estado del equipo: ");
            estado = salon_412.next();

            System.out.println("Equipo: " + pc);
            System.out.println("Estado: " + estado);

            
        }
        salon_412.close();
    }
}