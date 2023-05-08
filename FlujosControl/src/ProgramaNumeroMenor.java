import java.util.Scanner;

public class ProgramaNumeroMenor
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros a comparar: ");
        int cantidad = scanner.nextInt();

        //Preguntamos si es menor a 10, ya que el minimo es 10
        if(cantidad < 10)
        {
            System.out.println("Error: Debe comparar al menos 10 numeros");
        }
        else
        {
            int menor = Integer.MAX_VALUE; //Asignamos un valor maximo por defecto como numero menor para comenzar
            int numero;

            for(int i = 0; i < cantidad; i++)
            {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                menor = (numero < menor) ? numero : menor;
            }
            System.out.println("El numero menor es: " + menor);

            if(menor < 10)
            {
                System.out.println("El numero " + menor + " es menor que 10!");
            }
            else
            {
                System.out.println("El numero " + menor + " es igual o mayor que 10!");
            }
        }
    }
}
