import java.util.Scanner;
import java.time.Year;
public class Nombre_Edad {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre=Scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad=Scanner.nextInt();

        if (edad>=0) {
            int anio100=100+edad;
        int anioFaltan=100-edad;
        
        System.out.println(nombre+ ", en 100 años tendras "+anio100);
        System.out.println(" Y te faltan "+anioFaltan+" para tener 100 años");
        }
        else{
            System.out.println("Ingrese un valor positivo para la edad");
        }
    }
    
}