import javax.swing.*;

public class SentenciaForArreglos
{
    public static void main(String[] args)
    {
        String[] nombres = new String[6];
        String[] nombres2 = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        for(int i = 0; i < nombres2.length; i++)
        {
            if(nombres2[i].equalsIgnoreCase("Andres") ||
                    nombres2[i].equalsIgnoreCase("Pepa"))
            {
                continue;
            }
            System.out.println(nombres2[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\": ");
        boolean encontrado = false;
        for(int j = 0; j < nombres2.length; j++)
        {
            if(nombres2[j].equalsIgnoreCase(buscar))
            {
                encontrado = true;
                break;
            }
        }
        if(encontrado)
        {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No existe en el sistema");
        }
    }
}
