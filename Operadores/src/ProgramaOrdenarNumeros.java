import java.util.Scanner;

public class ProgramaOrdenarNumeros
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el número 1: ");
        int num1 = scan.nextInt();

        System.out.print("Ingrese el número 2: ");
        int num2 = scan.nextInt();

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;
        System.out.println("El orden es: " + resultado);
    }
}
