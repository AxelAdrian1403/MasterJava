public class EjemploStringConcatenacion
{
    public static void main(String[] args)
    {
        String curso1 = "Programación Java";
        String curso2 = new String("Programación Java");
        String profesor = "Adrián Flores";

        String detalle = (curso1 + ", con el instructor " + profesor);
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        //Al iniciar con un String, se concatena el contenido, a menos que se coloquen paréntesis
        System.out.println(detalle + numeroA + numeroB);
        //Al iniciar con entero, primero se suma el contenido, y luego se concatena
        System.out.println(numeroA + numeroB + detalle);

        //También se puede utilizar el método concat
        String detalle2 = curso1.concat(" con ".concat(profesor)); //También se puede colocar como curso1.concat(" ").concat(profesor)
        System.out.println(detalle2);
    }
}
