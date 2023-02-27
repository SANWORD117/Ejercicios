import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        
        int mes;

        Scanner signos_z = new Scanner(System.in);

        System.out.println("Ingrese mes en el que nacio: ");
        System.out.println("1= Enero 2= Febrero 3= Marzo 4= Abril 5= Mayo 6= Junio 7= Julio 8= Agosto 9= Septiembre 10= Octubre 11= Noviembre 12= Diciembre");
        mes = signos_z.nextInt(13);
        System.out.println("Elegiste " + mes);

        switch (mes) {
            case 1: {

                System.out.println("Eres Acuario");
                
                break;
            }
            case 2: {

                System.out.println("Eres Piscis");
                
                break;
            }
            case 3: {

                System.out.println("Eres Aries");
                
                break;
            }
            case 4: {

                System.out.println("Eres Tauro");
                
                break;
            }
            case 5: {

                System.out.println("Eres Géminis");
                
                break;
            }
            case 6: {

                System.out.println("Eres Cancer");
                
                break;
            }
            case 7: {

                System.out.println("Eres Leo");
                
                break;
            }
            case 8: {

                System.out.println("Eres Virgo");
                
                break;
            }
            case 9: {

                System.out.println("Eres Libra");
                
                break;
            }
            case 10: {

                System.out.println("Eres Escorpión");
                
                break;
            }
            case 11: {

                System.out.println("Eres Sagitario");
                
                break;
            }
            case 12: {

                System.out.println("Eres Capricornio");
                
                break;
            }
            
            default: {

                System.out.println("Lo sentimos, digitaste un valor no existente Intentalo de nuevo");
                break;
        }
        }
        signos_z.close();

    }
}
