import java.util.Scanner;

public class Calcularpotencia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base (n): ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el exponente (m): ")
        int m = scanner.nextInt();

        long resultado = 1;
        for (int i = 0; i < m; i++){
            resultado *= n;
        }
        System.out.println(n + "elevado a la " + m + "es: " + resultado);
            
        scanner.close();
    }
}
