import java.util.Scanner;

public class Multiplosdenumero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero (n): ");
        int n = scanner.nextInt();

        System.out.print("Ingrese cuantos multiplos desea ver (m): ");
        int m = scanner.nextInt();

        System.out.println("Los " + m + "multiplos de " + n + "son: ");
        for(int i = 1; i <= m; i++) {
            int multiplo = n * i;
            System.out.println(n + " x " + i + " = " + multiplo);
        }
        scanner.close();
    }
}