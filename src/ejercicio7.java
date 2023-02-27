import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        int estacion=2;

        Scanner estaciones = new Scanner(System.in);

        System.out.println("Ingrese el Mes: ");
        System.out.println("1= Enero 2= Febrero 3= Marzo 4= Abril 5= Mayo 6= Junio 7= Julio 8= Agosto 9= Septiembre 10= Octubre 11= Noviembre 12= Diciembre");

        estacion=estaciones.nextInt();
        
        switch(estacion){
            case 12,1,2:
                System.out.println("Es Invierno");
                break;

            case 3,4,5:
                System.out.println("Es Primavera");
                break;

            case 6,7,8:{
                System.out.println("Es Verano");
                break;
            }

            case 9,10,11:{
                System.out.println("Es Otoño");
                break;
            }
            default: {
                System.out.println("Dato incorrecto, por favor intentelo más tarde");
            }
            }
            estaciones.close();
    } 
}
