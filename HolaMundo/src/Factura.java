import java.util.InputMismatchException;
import java.util.Scanner;

public class Factura
{
    public static void main(String[] args)
    {
        String nombreFactura = "";
        double precio1 = 0, precio2 = 0, subtotal = 0, total = 0;
        final double impuesto = 19E-2D;

        Scanner lector = new Scanner(System.in);
        try
        {
            System.out.println("Bienvenido al portal Factura\n");
            System.out.print("Introduzca el nombre de su factura: ");
            nombreFactura = lector.nextLine();
            System.out.print("Introduzca el precio del producto 1: ");
            precio1 = lector.nextDouble();
            System.out.print("Introduzca el precio del producto 2: ");
            precio2 = lector.nextDouble();
            subtotal = precio1 + precio2;
            total = (subtotal) * (1 + impuesto);
        }
        catch(InputMismatchException ime)
        {
            System.out.println("Lectura errónea de datos");
            main(args);
            System.exit(0);
        }

        System.out.println("La factura " + nombreFactura + " de oficina tiene un total bruto de "
                         + subtotal + ", con un impuesto de " + (impuesto * subtotal) + " y el monto"
                         + " después de impuesto es de " + total);
    }
}
