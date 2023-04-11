import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaManejoDeNombres
{
    public static void main(String[] args)
    {
        Scanner lector = new Scanner(System.in);
        String nombre1 = "";
        String nombre2 = "";
        String nombre3 = "";

        StringBuilder newNombre1 = new StringBuilder();
        StringBuilder newNombre2 = new StringBuilder();
        StringBuilder newNombre3 = new StringBuilder();
        StringBuilder concatNombres = new StringBuilder();

        try
        {
            System.out.println("Formateo de cadenas\n");
            System.out.print("Introduzca primer nombre: ");
            nombre1 = lector.nextLine();

            newNombre1.append(nombre1.toUpperCase().charAt(1))
                      .append(".")
                      .append(nombre1.substring(nombre1.length() - 2));

            System.out.print("Introduzca segundo nombre: ");
            nombre2 = lector.nextLine();

            newNombre2.append(nombre2.toUpperCase().charAt(1))
                    .append(".")
                    .append(nombre2.substring(nombre2.length() - 2));

            System.out.print("Introduzca tercer nombre: ");
            nombre3 = lector.nextLine();

            newNombre3.append(nombre3.toUpperCase().charAt(1))
                    .append(".")
                    .append(nombre3.substring(nombre3.length() - 2));

            concatNombres.append(newNombre1.toString())
                    .append("_")
                    .append(newNombre2.toString())
                    .append("_")
                    .append(newNombre3.toString());
        }
        catch(InputMismatchException ime)
        {
            System.out.println("Error al leer cadena");
            main(args);
            System.exit(0);
        }

        System.out.println(concatNombres.toString());
    }
}
