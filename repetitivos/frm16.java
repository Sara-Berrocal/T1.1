import java.util.Scanner;

public class Invertircadena{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        String textoInvertido = InvertirCadena(texto);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoinvertido);

        scanner.close();
    }

    public static String InvertirCadena(String texto){
        StringBuilder invertido = new StringBuilder();
        for(int i = texto.length() - 1; i >= 0; i--){
            invertido.append(texto.charAt(i));
        }
        return invertido.toString();
    }
}