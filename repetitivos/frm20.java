import java.util.Scanner;

public class Minmaxpromedio{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int menor, mayor, suma = 0;

        System.out.println("Ingrese 10 numeros:");
        for(int i = 0; i < 10; i++){
            numeros[i] = scanner.nextInt();
        }
        menor = mayor - numeros[0];
        for(int num : numeros) {
            if (num < menor){
                menor = num;
            }
            if(num > mayor){
                mayor = num;
            }
            suma += num;
        }
        double promedio = suma / 10.0;

        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);
        System.out.println("Promedio: " + promedio);

        scanner.close();
    }
}
