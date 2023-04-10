import javax.swing.JOptionPane;

public class SistemasNumericos
{
    public static void main(String[] args)
    {
        int numeroDecimal = 30;
        System.out.println("numeroDecimal = " + numeroDecimal);
        //Convertir a binario
        System.out.println("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        //Definir binario, se antepone un 0b
        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        //Convertir a octal
        System.out.println("Numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));
        
        //Definir octal, se antepone un 0
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        //Convertir hexadecimal
        System.out.println("Numero hexadecimal de " + numeroOctal + " = " + Integer.toHexString(numeroOctal));

        //Definir hexadecimal, se antepone un 0x
        int numeroHexadecimal = 0x1E;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        //Entrada de datos por ventana
        String numeroStringEntrada = JOptionPane.showInputDialog(null, "Ingrese un número entero: ");
        int numeroDecimalEntrada = 0;
        try
        {
            numeroDecimalEntrada = Integer.parseInt(numeroStringEntrada);
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }
            System.out.println("numeroDecimalEntrada = " + numeroDecimalEntrada);

        String mensaje = "Número binario de " + numeroDecimalEntrada + " = " + Integer.toBinaryString(numeroDecimalEntrada) + "\n"
                       + "Número octal de " + numeroDecimalEntrada + " = " + Integer.toOctalString(numeroDecimalEntrada) + "\n"
                       + "Número hexadecimal de " + numeroDecimalEntrada + " = " + Integer.toHexString(numeroDecimalEntrada);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
