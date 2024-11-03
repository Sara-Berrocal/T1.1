import java.util.Scanner;

public class Tienda {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de unidades adquiridas: ");
        int unidades = scanner.nextInt();

        double precioUnitario = 20;
        double importe = unidades * precioUnitario;
        double descuento = calcularDescuento(importe);
        double totalAPagar = importe - descuento;

        int caramelos = calcularCaramelos(unidades);

        System.out.println("Importe de la compra: S/. " + importe);
        System.out.println("Descuento: S/. " + descuento);
        System.out.println("Total a pagar: S/. " + totalAPagar);
        System.out.println("Numero de caramelos: S/. " + caramelos);
    }

    public static double calcularDescuento(double importe){
        if (importe > 700) {
            return importe * 0.16;
        } else if (importe >= 501 && importe <= 700) {
            return importe * 0.14;
        } else {
            return importe * 0.12;
        }
    }

    public static int calcularCaramelos(int unidades) {
        if (unidades >= 1 && unidades <= 50) {
            return 5;
        } else if (unidades >= 51 && unidades <= 100) {
            return 10;
        } else {
            return 15;
        }
    }
}