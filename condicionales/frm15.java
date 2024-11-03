import java.util.Scanner;
public class  SueldoVendedor {
    public static void main(String[] args) {
        Scanner scanner == new Scanner(System.in);

        final double SUELDO_BASICO = 250;

        System.out.print("Ingrese el monto total vendido: S/.");
        double montoVendido = scanner.nextDouble();

        double comision = calcularComision(montoVendido);
        double sueldoBruto = SUELDO_BASICO + comision;

        double descuento = calcularDescuento(sueldoBruto);
        double sueldoBruto = sueldoBruto - descuento;

        System.out.printf("Sueldo Bruto: S/. %.2f\n", sueldoBruto);
        System.out.printf("Comision: S/. %.2f\n", comision);
        System.out.printf("Descuento: S/. %.2f\n", descuento);
        System.out.printf("Sueldo Neto: S/. %.2f\n", sueldoNeto);

        scanner.close();
    }

    private static double calcularComision(double monto) {
        if (monto < 5000) {
            return monto * 0.05;
        } else if (monto < 10000){
            return monto * 0.08;
        } else if ( monto < 20000) {
            return monto * 0.10;
        } else {
            return monto * 0.15;
        }
    }

    private static double calcularDescuento(double sueldoBruto){
        if (sueldoBruto > 3500) {
            return sueldoBruto * 0.15;
        } else {
            return sueldoBruto * 0.08;
        }
    }
}
