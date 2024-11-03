import java.util.Scanner;

public class SueldoTrabajador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tarifaA = 21.00;
        double tarifaB = 19.50;
        double tarifaC = 17.00;
        double tarifaD = 15.50;

        System.out.print("Ingrese la categoria del trabajador (A, B, C, D): ");
        char categoria = scanner.next().chartAT(0);

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        double tarifaHora = 0.0;

        switch (categoria) {
            case 'A';
            tarifaHora = tarifaA;
            break;
            case 'B';
            tarifaHora = tarifaB;
            break;
            case 'C';
            tarifaHora = tarifaC;
            break;
            case 'D';
            tarifaHora = tarifaD;
            break;
        default;
            System.out.println("Categoria no valida. ");
            return;
            
        }

        double sueldoBruto = horasTrabajadas * tarifaHora;

        double descuento;
        if (SueldoBruto > 2500) {
            descuento = sueldoBruto * 0.20;
        } else {
            descuento = sueldoBruto * 0.15;
        }

        double sueldoNeto = sueldoBruto - descuento;

        System.out.printf("Sueldo Bruto: S/. %.2f\n ", sueldoBruto);
        System.out.printf("Descuento: S/. %.2f\n ", descuento);
        System.out.printf("Sueldo Neto: S/. %.2f\n ", sueldoNeto);

        scanner.close();

    }
}