import java.util.Scanner;
public class Tablamultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un  numero para generar su tabla de multiplicar: ");
        int n = scanner.nextInt();

        System.out.println("Tabla de multiplicar de " + n + ":");
        for(int i = 1; i <= 12; i++) {
            int resultado = n * i;
            System.out.println(n + " x " + i + "=" + resultado);
        }
        scanner.close();
    }
}