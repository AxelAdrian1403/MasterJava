import java.util.Scanner;
public class OperadorTernario
{
    public static void main(String[] args)
    {
         //variable = condicion ? si es verdadero  : si es falso
        String variable = (7 == 7) ? "verdadero" : "falso";
        System.out.println("variable = " + variable);
        
        String estado = "";
        double promedio = 6.2D;
        
        estado = (promedio >= 5.49) ? "Aprobado" : "Rechazado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);
        
        //Entrada de datos
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite su nota de matemáticas: ");
        double matematicas = scanner.nextDouble();
        System.out.print("Digite su nota de ciencias: ");
        double ciencias = scanner.nextDouble();
        System.out.print("Digite su nota de historia: ");
        double historia = scanner.nextDouble();
        
        promedio = (matematicas + ciencias + historia) / 3;
        
        estado = (promedio >= 7) ? "Aprobado" : "Reprobado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);
    }
}
