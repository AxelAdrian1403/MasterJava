import java.util.Scanner;

public class OperadorLogicoLoginArreglo
{
    public static void main(String[] args)
    {
        String[] usernames = new String[10];
        String[] passwords = new String[10];

        usernames[0] = "adrian";
        passwords[0] = "12345";
        usernames[1] = "admin";
        passwords[1] = "12345";

        Scanner scanner =  new Scanner(System.in);
        System.out.print("Ingrese el username: ");
        String u = scanner.nextLine();
        System.out.print("Ingrese el password: ");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++)
        {
            if(usernames[i].equals(u) && passwords[i].equals(p))
            {
                esAutenticado = true;
                break;
            }
            else
            {
                System.out.println("Username o contraseña incorrecto");
            }
        }

        if(esAutenticado) System.out.println("Bienvenido ".concat(u).concat("!"));
        else System.out.println("Necesita autenticarse");
    }
}
