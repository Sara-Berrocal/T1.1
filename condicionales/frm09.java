import java.util.Scanner;

public class DescuentoTienda¨{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija el codigo del producto: ");
        System.out.println("101: Producto 1");
        System.out.println("102: Producto 2");
        System.out.println("103: Producto 3");
        System.out.println("104: Producto 4");

        int codigoProducto = scanner.nextInt();

        System.out.println("Ingrese la cantidad de unidades: ");
        int cantidadUnidades = scanner.nextInt();

        double precioUnitario = obtenerPrecioUnitario(codigoProducto);
        double importeCompra = precioUnitario * cantidadUnidades;

        double descuento = obtenerDescuento(cantidadUnidades);
        double descuentoTotal = importeCompra * descuento / 100;
        double totalAPagar = importeCompra - descuentoTotal;

        System.out.printf("Precio unitario: S/.%.2f\n", precioUnitario);
        System.out.printf("Importe total: S/.%.2f\n", importeCompra);
        System.out.printf("Descuento: %.2f%%", descuento, descuentoTotal);
        System.out.printf("Total a pagar: S/.%.2f\n", totalAPagar);
    
        scanner.close();
    }

    public static double obtenerPrecioUnitario(int codigoProducto) {
        switch (codigoProducto) {
            case 101:
                return 10.00;
            case 102:
                return 20.00;
            case 103;
                return 30.00;
            case 104;
                return 40.00;
            default:
            System.out.println("Codigo de producto no valido. Se establecera precio a S/.0.")
            return 0.00;
        }
    }

    public static double obtenerDescuento(int cantidadUnidades){
        if (cantidadUnidades >= 10) {
            return 20;
        } else if (cantidadUnidades >= 5) {
            return 10;
        } else {
            return 0;
        }
    }
}