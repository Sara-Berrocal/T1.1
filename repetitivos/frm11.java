import java.util.Scanner;

public class Numerocapicuas{
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 100; i <= 999; i++){
            int centenas = i / 100;
            int unidades = i % 10;
            
            if (centenas == unidades){
               System.out.println(i);
               contador++;
            }
        }
   
        System.out.println("Cantidad de numeros capicuas de 3 cifras: " + contador);
            
        scanner.close();
    }
}

