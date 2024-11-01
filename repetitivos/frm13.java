import java.util.Scanner;

public class SumaMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero n: ");
        int n = scanner.nextInt();
        
        int suma = 0;

        for(int i = 1; i <= n; i++){
            if (i % 3 = 0){
                if(i % 5 != 0){
                    suma += i;
                }
            }
        }

        System.out.println("La suma de los multiplos de 3 que no son multiplos de 5 y son menores o iguales a " + n +"es: " + suma);
        scanner.close();
    }
}