import java.sql.SQLOutput;

public class PrimitivosChar
{
    public static void main(String[] args)
    {
        //Se pueden tener caracteres alfabéticos, numéricos o cualquier valor perteneciente a la tabla UNICODE
        char caracterAlfabetico = 'A';
        System.out.println("caracterAlfabetico = " + caracterAlfabetico);
        char caracterNumerico = '3';
        System.out.println("caracterNumerico = " + caracterNumerico);
        char caracterUnicode = '\u0040';
        System.out.println("caracterUnicode = " + caracterUnicode);
        char caracterHTML = 64;
        System.out.println("caracterHTML = " + caracterHTML);
        System.out.println("caracterUnicode = caracterHTML: " + (caracterUnicode == caracterHTML));

        System.out.println("Char corresponde en byte = " + Character.BYTES);
        System.out.println("Char corresponde en bits = " + Character.SIZE);
        System.out.println("Valor máximo en char = " + Character.MAX_VALUE);
        System.out.println("Valor mínimo en char = " + Character.MIN_VALUE);

        char espacio = ' ';
        char espacioUnicode = '\u0020';
        //Retroceso, conocido como BackSpace, que nos sirve para eliminar un caracter
        char retroceso = '\b';
        //Tabulador
        char tabulador = '\t';
        //Nueva línea
        char nuevaLinea = '\n';
        //Retorno Carro, reinicia la linea
        char retornoCarro = '\r';
        //Otra forma de hacer salto de línea
        String salto = System.getProperty("line.separator");
        String saltoFuncion = System.lineSeparator();

        System.out.println("Hola" + espacio + "Thomas");
        System.out.println("Hola" + espacioUnicode + "Thomas");
        System.out.println("Thomas" + retroceso);
        System.out.println("Tho" + tabulador + "mas");
        System.out.println("Hola " + retornoCarro + "Thomas");
        System.out.println("Hola " + salto + "Thomas");
        System.out.println("Hola " + saltoFuncion + "Thomas");
    }
}
