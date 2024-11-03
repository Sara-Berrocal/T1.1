import java.util.Scanner;
public class CalculoPromedio {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Ingrese las notas para Matematica: ");
        double matematicas = calcularPromedio(scanner);

        
        System.out.print("Ingrese las notas para Fisica: ");
        double fisica = calcularPromedio(scanner);
        
        System.out.print("Ingrese las notas para Quimica: ");
        double quimica = calcularPromedio(scanner);

        mostrarResultado("Matematica", matematicas);
        mostrarResultado("Fisica", fisica);
        mostrarResultado("Quimica", quimica);

        scanner.close();
    }

    public static double calcularPromedio(Scanner scanner) {
        System.out.print("PC1: ");
        double pc1 = scanner.nextDouble() * 0.1;
        System.out.print("PC2: ");
        double pc2 = scanner.nextDouble() * 0.2;
        System.out.print("PC3: ");
        double pc3 = scanner.nextDouble() * 0.1;
        System.out.print("EP: ");
        double ep = scanner.nextDouble() * 0.3;
        System.out.print("EF: ");
        double ef = scanner.nextDouble() * 0.3;

        return pc1 + pc2 + pc3 + ep + ef;
    }    
    private static void mostrarResultado(String curso, double promedio) {
        System.out.printf("Promedio final de %S: %.2f\n", curso, promedio);
        if ( promedio >= 13) {
            System.out.println("Estado: Aprobado\n");
        } else {
            System.out.println("Estado: Desaprobado\n");
        }
    }
}
