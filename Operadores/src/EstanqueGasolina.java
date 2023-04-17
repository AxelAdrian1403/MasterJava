import java.util.Scanner;

public class EstanqueGasolina
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double capacidadActual;

        System.out.print("Introduzca la capacidad actual del estanque (máx 70 litros): ");
        capacidadActual = scan.nextDouble();

        if(capacidadActual >= 0 && capacidadActual < 20)
        {
            System.out.println("Insuficiente");
        }
        else if(capacidadActual >= 20 && capacidadActual < 35)
        {
            System.out.println("Suficiente");
        }
        else if(capacidadActual >= 35 && capacidadActual < 40)
        {
            System.out.println("Medio Estanque");
        }
        else if(capacidadActual >= 40 && capacidadActual < 60)
        {
            System.out.println("Estanque 3/4");
        }
        else if(capacidadActual >= 60 && capacidadActual < 70)
        {
            System.out.println("Estanque casi lleno");
        }
        else if(capacidadActual == 70)
        {
            System.out.println("Estanque lleno");
        }
    }
}
