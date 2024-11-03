Import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        double estatura = scanner.nextDouble();

        double imc = peso / (estatura * estatura);

        System.out.printf("IMC es: %.2f\n", imc);
        System.out.println("Grado de obesidad: " + clasificarIMC(imc));

        scanner.close();
    }

    private static string clasificarIMC(double imc) {
        if (imc < 20) {
            return "Delgado";
        } else if (imc >= 20 && imc < 25) {
            return "Normal";
        } else if (imc >= 25 && imc < 27) {
            return "Sobrepeso";
        } else {
            return "obesidad";
        }
    }
}