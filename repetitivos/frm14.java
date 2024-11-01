import java.util.Scanner;

public class VerificarPrimo{
    
    public static boolean Primo(int numero) {
        if(numero <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(numero); i++) {
            if(numero % i = 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (Primo(numero)){
            System.out.println(numero + "es un numero primo. ");
        } else {
            System.out.println(numero +"no es un numero primo. ");
        }
        
        scanner.close();
    }
}