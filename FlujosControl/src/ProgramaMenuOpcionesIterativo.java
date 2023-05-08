import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import javax.swing.JOptionPane;

public class ProgramaMenuOpcionesIterativo
{
    public static void main(String[] args)
    {
        int opcionIndice = 0;
        do
        {
            //Los Map (o mapas) los veremos mas adelante en el curso en profundidad
            //pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
            //tambien se les conoce como diccionarios para almacenar datos en base a un nombre
            Map<String, Integer> opciones = new HashMap<>();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();
            Object opcion = JOptionPane.showInputDialog(
                    null,
                    "Seleccione una operacion",
                    "Mantenedor de usuario",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opArreglo,
                    opArreglo[0]
            );

            if(opcion == null)
            {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operacion");
            }
            else
            {
                opcionIndice = opciones.get(opcion.toString());
                String mensaje = null;

                switch(opcionIndice)
                {
                    case 1 ->
                    {
                        mensaje = "Usuario actualizado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                        break;
                    }
                    case 2 ->
                    {
                        mensaje = "Usuario eliminado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                        break;
                    }
                    case 3 ->
                    {
                        mensaje = "Usuario agregado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                        break;
                    }
                    case 4 ->
                    {
                        mensaje = "Listando a los usuarios";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                        break;
                    }
                }
            }
        }while(opcionIndice != 5);

        JOptionPane.showMessageDialog(null, "Has salido con exito");
    }

}
