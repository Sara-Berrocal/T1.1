import java.util.Scanner;

public class ConvertidorTexto{

    public static String convertirMayusculas(String texto){
        return texto.toUpperCase();
    }
    public static String convertirMinusculas(String texto){
        return texto.toLowerCase();
    }
    public static void main(String[] args){
        String textoOriginal = "Hola Mundo";
        System.out.println("Texto original: " + textoOriginal);

        String textoMayusculas = convertirMayusculas(textoOriginal);
        System.out.println("Texto en mayusculas: " + textoMayusculas);

        String textoMinusculas = convertirMinusculas(textoOriginal);
        System.out.println("Texto en minusculas: " + textoMinusculas);      
    }
}