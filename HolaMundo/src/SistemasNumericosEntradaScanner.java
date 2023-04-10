import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SistemasNumericosEntradaScanner
{
    public static void main(String[] args)
    {
        //Crear lector para entrada de datos por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        String numeroStringEntrada = scanner.nextLine();
        int numeroDecimalEntrada = 0;
        try
        {
            numeroDecimalEntrada = Integer.parseInt(numeroStringEntrada);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimalEntrada = " + numeroDecimalEntrada);

        String mensaje = "Número binario de " + numeroDecimalEntrada + " = " + Integer.toBinaryString(numeroDecimalEntrada) + "\n"
                + "Número octal de " + numeroDecimalEntrada + " = " + Integer.toOctalString(numeroDecimalEntrada) + "\n"
                + "Número hexadecimal de " + numeroDecimalEntrada + " = " + Integer.toHexString(numeroDecimalEntrada);
        System.out.println(mensaje);

        //Se puede omitir la conversión si se consigue directamente el entero del Scanner con...
        //scanner.nextInt(), pero lanzaría otro tipo de error, InputMismatchException
    }
}
