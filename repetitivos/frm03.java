import java.util.Scanner;

public class Contardivisores{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        int contardivisores = 0;

        for (int i = 1; i <= numero; i++){
            if (numero % i == 0) {
                contardivisores++;
            }
        }
        System.out.println("La cantidad de divisores de" + numero + "es:" + contardivisores);

        scanner.close();
    }
}
