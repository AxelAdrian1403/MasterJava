public class EjemploStringExtensionArchivo
{
    public static void main(String[] args)
    {
        String archivo = "alguna_imagen.json";
        System.out.println("archivo.length() = " + archivo.length());
        //Forma estática
        System.out.println("archivo.substring(14) = " + archivo.substring(14));

        //Forma dinámica
        int i = archivo.indexOf(".");
        System.out.println("archivo.substring(i) = " + archivo.substring(i));

        //Puede darse el caso de que la cadena contenga más de un punto, por lo que se recomienda utilizar lastIndexOf()
    }
}
