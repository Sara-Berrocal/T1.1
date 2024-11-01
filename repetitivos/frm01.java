import java.util.Scanner;

public class Divisionporrestas{

    public static void Divisionporrestas(int dividendo, int divisor){
        int cociente = 0;

        if( divisor == 0){
            System.out.println("El divisor no puede ser cero. "):
            return;
        }
        while(dividendo >= divisor){
            dividendo -= divisor;
            cociente++;
        }

        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: "+ dividendo);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner. nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        divisionporrestas(dividendo, divisor);

        scanner.close();
    }
}