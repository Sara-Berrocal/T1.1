import java.util.Scanner;

public class Multiplicacionporsuma{

    public static int multiplicar(int a, int b) {
        int resultado = 0;
        boolean negativo = false;

        if ( b < 0) {
            b = -b;
            negativo = true;
        }
        for (int i = 0; i < b; i++){
            resultado += a;
        }

        if(negativo){
            resultado = -resultado;

        }
        return resultado;
    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        in num2 = scanner.nextInt();

        int resultado = multiplicar(num1, num2);

        System.out.print("El resultaod de la multiplicacion es: " + resultado);

        scanner.close();
    }
}