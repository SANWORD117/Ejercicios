import java.util.Scanner;

public class ejercicio39 {
    public static void main(String[] args) {

        String nom_nadadores,ape_nadadores,pais,modalidad = "  ";
        int puntos,total_puntos,puesto;
        int nadadores = 10;

        Scanner competencia_n = new Scanner(System.in);

        System.out.println("BIENVENIDOS A LA COMPETENCIA DE NATACIÖN ESTILO LIBRE");
        System.out.print("Ingrese la modalidad de natación: ");
        modalidad = competencia_n.nextLine();
        System.out.println("Modalidad: " + modalidad);
        System.out.println("Participan: " + nadadores + " nadadores");
        for (int i = 1; i <=10; i++) {

            System.out.println("CLasificación de los 10 nadadores hombres");
            System.out.println("Ingrese el puesto del 1 al 10 de clasificación: ");
            puesto = competencia_n.nextInt(11);
            System.out.println("Ingrese el primer nombre del participante: ");
            nom_nadadores = competencia_n.next();
            System.out.println("Ingrese el primer apellido del participante: ");
            ape_nadadores = competencia_n.next();
            System.out.println("Ingrese el pais del participante: ");
            pais = competencia_n.next();
            System.out.println("Ingrese la cantidad de puntos que obtuvo el participante: ");
            puntos = competencia_n.nextInt();
            System.out.println("Top "+ puesto + " : " + nom_nadadores + " " + ape_nadadores + " del pais " + pais + " y obtuvo " + puntos + " puntos en esta Modalidad.");
            
        }
        competencia_n.close();
    }
}
