import java.util.Scanner;

public class ejercicio40 {
    public static void main(String[] args) {
        double promedio;
        String estudiante;
        String profesor;
        int i = 0;
        double suma = 0.0;
        int [] n_notas = {0};

        try (Scanner materia = new Scanner(System.in)) {
            System.out.print("Ingrese nombre del Profesor: ");
            profesor = materia.next();
            System.out.print("Ingrese nombre del Estudiante: ");
            estudiante = materia.next();

            System.out.print("Ingrese la cantidad de notas que desee digitar: ");
            n_notas[i] = materia.nextInt();
            
            double notas;
            
            for (i = 1; i <= n_notas.length; i++) {

                System.out.print("Digite la nota "+ i +" : ");
                notas = materia.nextDouble();
                System.out.println("Nota digitada: " + notas);
                suma += n_notas[i];
            }

            promedio = suma / n_notas[i];

            if (promedio >= 3.0){
                System.out.println("Evaluador: Profesor " + profesor);
                System.out.println("Estudiante: " + estudiante + "aprobo con un promedio final de " + promedio);
            } else {
                System.out.println("Evaluador: Profesor " + profesor);
                System.out.println("Estudiante: " + estudiante + "no aprobo con un promedio final de " + promedio);
            }
        } 
    }
}
