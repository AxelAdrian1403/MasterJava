import java.util.Scanner;

public class MultiplicarSinSimbolo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el numero b: ");
        int b = scanner.nextInt();

        int resultado = 0;

        //Verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoA = a > -1;
        boolean positivoB = b > -1;

        //Calculamos el valor absoluto de a
        int absolutoA = positivoA? a : -a; //equivalente a Math.abs(a)

        //Sumamos tantas veces el valor de b, segun el valor de a
        for(int i = 0; i < absolutoA; i++)
        {
            resultado = resultado + b;
        }

        //Si ambos son negativo o si solo a es negativo, damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA)
        {
            resultado = -resultado;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
