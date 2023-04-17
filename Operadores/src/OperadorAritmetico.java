import javax.swing.JOptionPane;

public class OperadorAritmetico
{
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 4;
        
        int suma = num1 + num2;
        System.out.println("suma = " + suma);
        
        int resta = num1 - num2;
        System.out.println("resta = " + resta);
        
        int multi = num1 * num2;
        System.out.println("multiplicación = " + multi);

        int div = num1 / num2;
        float div2 = (float)num1 / (float)num2;
        System.out.println("división = " + div);
        System.out.println("división2 = " + div2);
        
        int resto = num1 % num2;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if(numero % 2 == 0)
        {
            System.out.println("Número par = " + numero);
        }
        else
        {
            System.out.println("Número impar = " + numero);
        }
    }
}
