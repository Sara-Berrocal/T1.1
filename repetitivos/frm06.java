import java.util.Scanner;

public class Tablamultiplicar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero para generar la tabla de multiplicar: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el limite inferior (x): ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el limite superior (y): ");
        int y = scanner.nextInt();

        System.out.println("Tabla de multiplicar de " + n + "del" + x + "al" + y + ":");
        for (int i = x; i <= y; i++){
           int resultado = n * i;
           System.out.println(n + "x" + i + "=" + resultado);
        }
    
        scanner.close();
    }
}
