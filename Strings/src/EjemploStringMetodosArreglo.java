public class EjemploStringMetodosArreglo
{
    public static void main(String[] args)
    {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        System.out.println("arreglo.length = " + arreglo.length);

        for(int i = 0; i < arreglo.length; i++)
        {
            System.out.print(arreglo[i]);
        }

        System.out.println();
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");
        System.out.println("arreglo2.length = " + arreglo2.length);

        for(int i = 0; i < arreglo2.length; i++)
        {
            System.out.print(arreglo2[i] + " ");
        }
        System.out.println();

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\.");

        for(int i = 0; i < archivoArr.length; i++)
        {
            System.out.print(archivoArr[i] + " ");
        }
        System.out.println("\n" + archivoArr[archivoArr.length - 1]);
    }
}
