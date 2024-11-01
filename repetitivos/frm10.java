import java.util.Scanner;

public class Numerocuatrocifras{
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1000; i <= 9999; i++){
            int sumaPares = 0;
            int sumaImpares = 0;
            int numero = 1;

            for (int j = 0; j < 4; j++){
                int cifra = numero % 10;
                if (cifra % 2 == 0) {
                    sumaPares += cifra;
                } else {
                    sumaImpares += cifra;
                }
                numero /= 10;
            }
            if (sumaPares == sumaImpares){
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Cantidad de numeros encontrados: " + contador);
            
        scanner.close();
    }
}
