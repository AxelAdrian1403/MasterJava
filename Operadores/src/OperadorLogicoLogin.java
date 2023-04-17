import java.util.Scanner;
public class OperadorLogicoLogin
{
    public static void main(String[] args)
    {
        String username = "adrian";
        String password = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el username: ");
        String u = scanner.nextLine();
        System.out.print("Ingrese el password: ");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        if((u.equals(username)) && (p.equals(password)))
        {
            esAutenticado = true;
        }
        else
        {
            System.out.println("Username o contraseña incorrectos");
        }

        if(esAutenticado)
        {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }
        else
        {
            System.out.println("Lo siento, requiere autenticación");
        }

    }
}
