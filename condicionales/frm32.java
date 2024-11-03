import java.util.Scanner;

public class PensionEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pensionA = 550.00;
        double pensionB = 500.00;
        double pensionC = 450.00;
        double pensionD = 400.00;


        System.out.print("Ingrese la categoria del estudiante (A, B, C, D): ");
        char categoria = scanner.next().charAt(0);

        System.out.print("Ingrese el promedio del ciclo anterior: ");
        double promedio = scanner.nextDouble();
        

        double pensionActual = 0.0;
        double descuento = 0.0;

        if (categoria == 'A' ) {
            pensionActual = pensionA;
        } else if (categoria == 'B') {
            pensionActual = pensionB;
            if (promedio >= 14 && promedio < 16) {
                descuento = pensionActual * 0.10;
            }
        } else if (categoria == 'C') {
            pensionActual = pensionC;
            if (promedio >= 16 && promedio < 18) {
                descuento = pensionActual * 0.12;
            }
        } else if (categoria == 'D') {
            pensionActual = pensionD;
            if (promedio >= 18) {
                descuento = pensionActual * 0.15;
            }
        } else {
            System.out.println("Categoria no valida.");
            scanner.close();
            return;
        }

        double nuevaPension = pensionActual- descuento;


        System.out.printf("Pension Actual: S/. %.2f\n", pensionActual);
        System.out.printf("Descuento: S/. %.2f\n", descuento);
        System.out.printf("Nueva Pension: S/. %.2f\n", nuevaPension);
    
        scanner.close();
    }
}